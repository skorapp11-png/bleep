package com.example.data.model

import java.text.DecimalFormat

enum class Currency(
    val code: String,
    val symbolAr: String,
    val symbolEn: String,
    val symbolFr: String,
    val rateFromUsd: Double // 1 USD in this currency
) {
    DZD("DZD", "د.ج", "DZD", "DA", 200.0),
    USD("USD", "$", "$", "$", 1.0),
    EUR("EUR", "€", "€", "€", 0.92),
    GBP("GBP", "£", "£", "£", 0.79),
    SAR("SAR", "ر.س", "SAR", "SAR", 3.75),
    AED("AED", "د.إ", "AED", "AED", 3.67);

    fun format(usdAmount: Double, language: Language): String {
        val converted = usdAmount * rateFromUsd
        val symbol = when (language) {
            Language.ARABIC -> symbolAr
            Language.FRENCH -> symbolFr
            Language.ENGLISH -> symbolEn
        }
        val formatter = when {
            this == DZD -> DecimalFormat("#,###")
            converted >= 1000 -> DecimalFormat("#,###")
            else -> DecimalFormat("#,##0.00")
        }
        val formattedNumber = formatter.format(converted)
        return when (language) {
            Language.ARABIC -> "$formattedNumber $symbol"
            Language.FRENCH -> "$formattedNumber $symbol"
            Language.ENGLISH -> "$symbol$formattedNumber"
        }
    }

    fun getSymbol(language: Language): String = when (language) {
        Language.ARABIC -> symbolAr
        Language.FRENCH -> symbolFr
        Language.ENGLISH -> symbolEn
    }

    fun getLocalizedName(language: Language): String = when (this) {
        DZD -> when (language) {
            Language.ARABIC -> "الدينار الجزائري (DZD)"
            Language.FRENCH -> "Dinar algérien (DZD)"
            Language.ENGLISH -> "Algerian Dinar (DZD)"
        }
        USD -> when (language) {
            Language.ARABIC -> "الدولار الأمريكي (USD)"
            Language.FRENCH -> "Dollar américain (USD)"
            Language.ENGLISH -> "US Dollar (USD)"
        }
        EUR -> when (language) {
            Language.ARABIC -> "اليورو الأوروبي (EUR)"
            Language.FRENCH -> "Euro (EUR)"
            Language.ENGLISH -> "Euro (EUR)"
        }
        GBP -> when (language) {
            Language.ARABIC -> "الجنيه الإسترليني (GBP)"
            Language.FRENCH -> "Livre sterling (GBP)"
            Language.ENGLISH -> "British Pound (GBP)"
        }
        SAR -> when (language) {
            Language.ARABIC -> "الريال السعودي (SAR)"
            Language.FRENCH -> "Riyal saoudien (SAR)"
            Language.ENGLISH -> "Saudi Riyal (SAR)"
        }
        AED -> when (language) {
            Language.ARABIC -> "الدرهم الإماراتي (AED)"
            Language.FRENCH -> "Dirham des Émirats (AED)"
            Language.ENGLISH -> "UAE Dirham (AED)"
        }
    }

    fun convertFromUsd(usdAmount: Double): Double = usdAmount * rateFromUsd

    fun convertToUsd(amountInThisCurrency: Double): Double = amountInThisCurrency / rateFromUsd
}
