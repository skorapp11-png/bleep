package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "saved_products")
data class SavedProductEntity(
    @PrimaryKey val productId: String,
    val productName: String,
    val category: String,
    val basePriceUsd: Double,
    val targetAlertPriceUsd: Double,
    val alertEnabled: Boolean = true,
    val savedTimestamp: Long = System.currentTimeMillis()
)

@Entity(tableName = "price_alert_notifications")
data class PriceAlertNotificationEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val productId: String,
    val productName: String,
    val storeName: String,
    val oldPriceUsd: Double,
    val newPriceUsd: Double,
    val discountPercent: Int,
    val timestamp: Long = System.currentTimeMillis(),
    val isRead: Boolean = false
)
