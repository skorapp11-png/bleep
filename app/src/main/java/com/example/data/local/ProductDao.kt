package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao {
    @Query("SELECT * FROM saved_products ORDER BY savedTimestamp DESC")
    fun getAllSavedProducts(): Flow<List<SavedProductEntity>>

    @Query("SELECT * FROM saved_products WHERE productId = :id LIMIT 1")
    suspend fun getSavedProduct(id: String): SavedProductEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSavedProduct(product: SavedProductEntity)

    @Query("DELETE FROM saved_products WHERE productId = :id")
    suspend fun deleteSavedProduct(id: String)

    @Query("SELECT * FROM price_alert_notifications ORDER BY timestamp DESC")
    fun getAllAlertNotifications(): Flow<List<PriceAlertNotificationEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAlertNotification(alert: PriceAlertNotificationEntity)

    @Query("UPDATE price_alert_notifications SET isRead = 1 WHERE id = :id")
    suspend fun markAlertRead(id: Long)

    @Query("DELETE FROM price_alert_notifications")
    suspend fun clearAllAlerts()
}
