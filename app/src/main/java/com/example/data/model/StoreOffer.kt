package com.example.data.model

data class StoreOffer(
    val storeName: String,
    val storeType: String,
    val priceUsd: Double,
    val originalPriceUsd: Double? = null,
    val inStock: Boolean = true,
    val stockNote: String = "In Stock",
    val storeRating: Float = 4.8f,
    val freeShipping: Boolean = true,
    val isLowestPrice: Boolean = false,
    val storeUrl: String = ""
) {
    val discountPercent: Int
        get() {
            if (originalPriceUsd == null || originalPriceUsd <= priceUsd) return 0
            return (((originalPriceUsd - priceUsd) / originalPriceUsd) * 100).toInt()
        }
}
