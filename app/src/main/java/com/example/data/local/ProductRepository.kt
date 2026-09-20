package com.example.data.local

import kotlinx.coroutines.flow.Flow

class ProductRepository(private val productDao: ProductDao) {
    val savedProducts: Flow<List<SavedProductEntity>> = productDao.getAllSavedProducts()
    val alertNotifications: Flow<List<PriceAlertNotificationEntity>> = productDao.getAllAlertNotifications()

    suspend fun isProductSaved(id: String): Boolean = productDao.getSavedProduct(id) != null

    suspend fun saveProduct(product: SavedProductEntity) = productDao.insertSavedProduct(product)

    suspend fun removeProduct(productId: String) = productDao.deleteSavedProduct(productId)

    suspend fun addPriceAlertNotification(alert: PriceAlertNotificationEntity) =
        productDao.insertAlertNotification(alert)

    suspend fun markAlertRead(id: Long) = productDao.markAlertRead(id)

    suspend fun clearAllAlerts() = productDao.clearAllAlerts()
}
