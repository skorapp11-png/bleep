package com.example.data.model

data class Review(
    val id: String,
    val userName: String,
    val rating: Float,
    val date: String,
    val isVerifiedBuyer: Boolean = true,
    val usagePeriod: String = "3 months",
    val commentAr: String,
    val commentEn: String,
    val commentFr: String,
    val helpfulCount: Int = 12
) {
    fun getComment(language: Language): String = when (language) {
        Language.ARABIC -> commentAr
        Language.FRENCH -> commentFr
        Language.ENGLISH -> commentEn
    }
}
