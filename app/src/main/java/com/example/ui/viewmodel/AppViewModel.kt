package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.ai.GeminiService
import com.example.data.local.AppDatabase
import com.example.data.local.PriceAlertNotificationEntity
import com.example.data.local.ProductRepository
import com.example.data.local.SavedProductEntity
import com.example.data.model.AppStrings
import com.example.data.model.Currency
import com.example.data.model.Language
import com.example.data.model.Product
import com.example.data.model.ProductCategory
import com.example.data.model.SpecTag
import com.example.data.model.Strings
import com.example.data.sample.ProductCatalog
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

data class ProductMatch(
    val product: Product,
    val matchScore: Int, // 0 to 100
    val isWithinBudget: Boolean,
    val matchedSpecsCount: Int
)

class AppViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: ProductRepository = ProductRepository(
        AppDatabase.getDatabase(application).productDao()
    )
    private val geminiService = GeminiService()

    // Preferences & Localization
    private val _language = MutableStateFlow(Language.ARABIC)
    val language: StateFlow<Language> = _language.asStateFlow()

    private val _currency = MutableStateFlow(Currency.DZD)
    val currency: StateFlow<Currency> = _currency.asStateFlow()

    private val _isDarkMode = MutableStateFlow(true)
    val isDarkMode: StateFlow<Boolean> = _isDarkMode.asStateFlow()

    private val _currentTab = MutableStateFlow(0)
    val currentTab: StateFlow<Int> = _currentTab.asStateFlow()

    // Search & Filter state
    private val _selectedCategory = MutableStateFlow(ProductCategory.ALL)
    val selectedCategory: StateFlow<ProductCategory> = _selectedCategory.asStateFlow()

    private val _maxBudgetUsd = MutableStateFlow(1200.0) // ~240,000 DZD
    val maxBudgetUsd: StateFlow<Double> = _maxBudgetUsd.asStateFlow()

    private val _selectedSpecs = MutableStateFlow<Set<SpecTag>>(setOf(SpecTag.VALUE, SpecTag.BATTERY))
    val selectedSpecs: StateFlow<Set<SpecTag>> = _selectedSpecs.asStateFlow()

    // Product Detail & AI interaction
    private val _selectedProduct = MutableStateFlow<Product?>(null)
    val selectedProduct: StateFlow<Product?> = _selectedProduct.asStateFlow()

    private val _aiResponse = MutableStateFlow<String?>(null)
    val aiResponse: StateFlow<String?> = _aiResponse.asStateFlow()

    private val _isAiLoading = MutableStateFlow(false)
    val isAiLoading: StateFlow<Boolean> = _isAiLoading.asStateFlow()

    // Temporary banner alert
    private val _bannerMessage = MutableStateFlow<String?>(null)
    val bannerMessage: StateFlow<String?> = _bannerMessage.asStateFlow()

    // Room database flows
    val savedProducts: StateFlow<List<SavedProductEntity>> = repository.savedProducts
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val alertNotifications: StateFlow<List<PriceAlertNotificationEntity>> = repository.alertNotifications
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val strings: Strings
        get() = AppStrings.get(_language.value)

    fun setLanguage(lang: Language) {
        _language.value = lang
    }

    fun setCurrency(curr: Currency) {
        _currency.value = curr
    }

    fun toggleDarkMode() {
        _isDarkMode.value = !_isDarkMode.value
    }

    fun setCurrentTab(index: Int) {
        _currentTab.value = index
    }

    fun setCategory(category: ProductCategory) {
        _selectedCategory.value = category
    }

    fun setMaxBudgetUsd(budget: Double) {
        _maxBudgetUsd.value = budget
    }

    fun toggleSpec(spec: SpecTag) {
        val current = _selectedSpecs.value.toMutableSet()
        if (current.contains(spec)) {
            current.remove(spec)
        } else {
            current.add(spec)
        }
        _selectedSpecs.value = current
    }

    fun openProductDetail(product: Product) {
        _selectedProduct.value = product
        _aiResponse.value = null
        _isAiLoading.value = false
    }

    fun closeProductDetail() {
        _selectedProduct.value = null
        _aiResponse.value = null
    }

    fun clearBanner() {
        _bannerMessage.value = null
    }

    fun isProductSaved(productId: String): Boolean {
        return savedProducts.value.any { it.productId == productId }
    }

    fun toggleProductTracking(product: Product) {
        viewModelScope.launch {
            val exists = repository.isProductSaved(product.id)
            if (exists) {
                repository.removeProduct(product.id)
                _bannerMessage.value = when (_language.value) {
                    Language.ARABIC -> "تمت إزالة ${product.name} من قائمة التنبيهات"
                    Language.FRENCH -> "${product.name} retiré du suivi"
                    Language.ENGLISH -> "Removed ${product.name} from tracked alerts"
                }
            } else {
                repository.saveProduct(
                    SavedProductEntity(
                        productId = product.id,
                        productName = product.name,
                        category = product.category.name,
                        basePriceUsd = product.lowestPriceUsd,
                        targetAlertPriceUsd = product.lowestPriceUsd * 0.9,
                        alertEnabled = true
                    )
                )
                _bannerMessage.value = when (_language.value) {
                    Language.ARABIC -> "🔔 تم تفعيل تتبع السعر لـ ${product.name}! ستتلقى تنبيهاً عند حدوث تخفيض حقيقي."
                    Language.FRENCH -> "🔔 Alerte activée pour ${product.name} ! Vous serez prévenu en cas de baisse."
                    Language.ENGLISH -> "🔔 Price drop alert active for ${product.name}!"
                }
            }
        }
    }

    fun askAiQuestion(question: String) {
        val prod = _selectedProduct.value ?: return
        if (question.isBlank()) return

        viewModelScope.launch {
            _isAiLoading.value = true
            _aiResponse.value = null
            try {
                val answer = geminiService.askAiAboutProduct(prod, question, _language.value)
                _aiResponse.value = answer
            } catch (e: Exception) {
                _aiResponse.value = when (_language.value) {
                    Language.ARABIC -> "حدث خطأ أثناء معالجة السؤال. يرجى المحاولة مرة أخرى."
                    Language.FRENCH -> "Une erreur est survenue lors de l'analyse."
                    Language.ENGLISH -> "An error occurred during analysis."
                }
            } finally {
                _isAiLoading.value = false
            }
        }
    }

    // Smart recommendations matching algorithm
    fun getMatchedRecommendations(): List<ProductMatch> {
        val maxBudget = _maxBudgetUsd.value
        val category = _selectedCategory.value
        val requiredSpecs = _selectedSpecs.value

        return ProductCatalog.products
            .filter { category == ProductCategory.ALL || it.category == category }
            .map { product ->
                val price = product.lowestPriceUsd
                val isWithinBudget = price <= maxBudget

                // Spec score
                val matchingSpecs = product.specTags.intersect(requiredSpecs)
                val specScore = if (requiredSpecs.isEmpty()) 80 else {
                    ((matchingSpecs.size.toDouble() / requiredSpecs.size) * 60).toInt()
                }

                // Budget score (up to 40 points)
                val budgetScore = if (isWithinBudget) {
                    40
                } else {
                    val excessPercent = (price - maxBudget) / maxBudget
                    (40 - (excessPercent * 80).toInt()).coerceAtLeast(0)
                }

                val totalScore = (specScore + budgetScore).coerceIn(40, 99)

                ProductMatch(
                    product = product,
                    matchScore = totalScore,
                    isWithinBudget = isWithinBudget,
                    matchedSpecsCount = matchingSpecs.size
                )
            }
            .sortedWith(
                compareByDescending<ProductMatch> { it.isWithinBudget }
                    .thenByDescending { it.matchScore }
                    .thenBy { it.product.lowestPriceUsd }
            )
    }

    // Real deals list
    fun getRealDeals(): List<Product> {
        return ProductCatalog.products
            .filter { it.isRealDiscount }
            .sortedByDescending { it.discountPercent }
    }

    // Simulate price drop alert (to demonstrate the real deal notification system requested by user)
    fun simulatePriceDropCheck() {
        viewModelScope.launch {
            val discountProduct = ProductCatalog.products.find { it.id == "redmi-note-13-pro-plus" }
                ?: ProductCatalog.products.first()
            val store = discountProduct.lowestOffer

            val alert = PriceAlertNotificationEntity(
                productId = discountProduct.id,
                productName = discountProduct.name,
                storeName = store.storeName,
                oldPriceUsd = store.originalPriceUsd ?: (store.priceUsd * 1.2),
                newPriceUsd = store.priceUsd,
                discountPercent = discountProduct.discountPercent.coerceAtLeast(19)
            )
            repository.addPriceAlertNotification(alert)

            val currentLang = _language.value
            val priceStr = _currency.value.format(store.priceUsd, currentLang)
            _bannerMessage.value = when (currentLang) {
                Language.ARABIC -> "🔥 تم رصد تخفيض حقيقي! انخفض سعر ${discountProduct.name} إلى $priceStr لدى ${store.storeName} (-${alert.discountPercent}%)"
                Language.FRENCH -> "🔥 Vraie baisse détectée ! ${discountProduct.name} passe à $priceStr chez ${store.storeName} (-${alert.discountPercent}%)"
                Language.ENGLISH -> "🔥 Real Price Drop! ${discountProduct.name} dropped to $priceStr at ${store.storeName} (-${alert.discountPercent}%)"
            }
        }
    }
}
