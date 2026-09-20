package com.example.data.model

data class AiReviewSummary(
    val sentimentScore: Int, // e.g. 92% positive
    val totalReviewsAnalyzed: Int,
    val summaryAr: String,
    val summaryEn: String,
    val summaryFr: String,
    val prosAr: List<String>,
    val prosEn: List<String>,
    val prosFr: List<String>,
    val consAr: List<String>,
    val consEn: List<String>,
    val consFr: List<String>,
    val verdictAr: String,
    val verdictEn: String,
    val verdictFr: String
) {
    fun getSummary(language: Language): String = when (language) {
        Language.ARABIC -> summaryAr
        Language.FRENCH -> summaryFr
        Language.ENGLISH -> summaryEn
    }

    fun getPros(language: Language): List<String> = when (language) {
        Language.ARABIC -> prosAr
        Language.FRENCH -> prosFr
        Language.ENGLISH -> prosEn
    }

    fun getCons(language: Language): List<String> = when (language) {
        Language.ARABIC -> consAr
        Language.FRENCH -> consFr
        Language.ENGLISH -> consEn
    }

    fun getVerdict(language: Language): String = when (language) {
        Language.ARABIC -> verdictAr
        Language.FRENCH -> verdictFr
        Language.ENGLISH -> verdictEn
    }
}
