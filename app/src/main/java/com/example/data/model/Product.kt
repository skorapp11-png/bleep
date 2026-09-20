package com.example.data.model

enum class ProductCategory {
    ALL,
    PHONES,
    LAPTOPS,
    WATCHES,
    AUDIO,
    TABLETS;

    fun getLabel(language: Language): String = when (this) {
        ALL -> when (language) {
            Language.ARABIC -> "الكل"
            Language.FRENCH -> "Tous"
            Language.ENGLISH -> "All"
        }
        PHONES -> when (language) {
            Language.ARABIC -> "هواتف ذكية"
            Language.FRENCH -> "Smartphones"
            Language.ENGLISH -> "Smartphones"
        }
        LAPTOPS -> when (language) {
            Language.ARABIC -> "حواسيب محمولة"
            Language.FRENCH -> "PC Portables"
            Language.ENGLISH -> "Laptops"
        }
        WATCHES -> when (language) {
            Language.ARABIC -> "ساعات ذكية"
            Language.FRENCH -> "Montres"
            Language.ENGLISH -> "Watches"
        }
        AUDIO -> when (language) {
            Language.ARABIC -> "سماعات"
            Language.FRENCH -> "Écouteurs"
            Language.ENGLISH -> "Audio"
        }
        TABLETS -> when (language) {
            Language.ARABIC -> "أجهزة لوحية"
            Language.FRENCH -> "Tablettes"
            Language.ENGLISH -> "Tablets"
        }
    }
}

enum class SpecTag {
    BATTERY,
    CAMERA,
    PERFORMANCE,
    OLED,
    LIGHTWEIGHT,
    STORAGE,
    VALUE;

    fun getLabel(language: Language): String = when (this) {
        BATTERY -> when (language) {
            Language.ARABIC -> "بطارية خارقة"
            Language.FRENCH -> "Grande autonomie"
            Language.ENGLISH -> "Long Battery"
        }
        CAMERA -> when (language) {
            Language.ARABIC -> "كاميرا احترافية"
            Language.FRENCH -> "Appareil photo Pro"
            Language.ENGLISH -> "Pro Camera"
        }
        PERFORMANCE -> when (language) {
            Language.ARABIC -> "أداء فائق"
            Language.FRENCH -> "Haute performance"
            Language.ENGLISH -> "High Performance"
        }
        OLED -> when (language) {
            Language.ARABIC -> "شاشة OLED 120Hz"
            Language.FRENCH -> "Écran OLED 120Hz"
            Language.ENGLISH -> "OLED 120Hz"
        }
        LIGHTWEIGHT -> when (language) {
            Language.ARABIC -> "خفيف ونحيف"
            Language.FRENCH -> "Fin & Léger"
            Language.ENGLISH -> "Slim & Light"
        }
        STORAGE -> when (language) {
            Language.ARABIC -> "سعة 256GB+"
            Language.FRENCH -> "Stockage 256Go+"
            Language.ENGLISH -> "Storage 256GB+"
        }
        VALUE -> when (language) {
            Language.ARABIC -> "أفضل قيمة للسعر"
            Language.FRENCH -> "Qualité/Prix"
            Language.ENGLISH -> "Best Value"
        }
    }
}

data class Product(
    val id: String,
    val name: String,
    val brand: String,
    val category: ProductCategory,
    val imageUrl: String,
    val specTags: List<SpecTag>,
    val specsAr: Map<String, String>,
    val specsEn: Map<String, String>,
    val specsFr: Map<String, String>,
    val descriptionAr: String,
    val descriptionEn: String,
    val descriptionFr: String,
    val offers: List<StoreOffer>,
    val reviews: List<Review>,
    val aiSummary: AiReviewSummary,
    val rating: Float,
    val reviewsCount: Int,
    val isRealDiscount: Boolean = false,
    val dealTag: String? = null
) {
    val lowestOffer: StoreOffer
        get() = offers.minByOrNull { it.priceUsd } ?: StoreOffer("Default", "Store", 0.0)

    val lowestPriceUsd: Double
        get() = lowestOffer.priceUsd

    val originalPriceUsd: Double?
        get() = lowestOffer.originalPriceUsd

    val discountPercent: Int
        get() = lowestOffer.discountPercent

    fun getSpecs(language: Language): Map<String, String> = when (language) {
        Language.ARABIC -> specsAr
        Language.FRENCH -> specsFr
        Language.ENGLISH -> specsEn
    }

    fun getDescription(language: Language): String = when (language) {
        Language.ARABIC -> descriptionAr
        Language.FRENCH -> descriptionFr
        Language.ENGLISH -> descriptionEn
    }
}
