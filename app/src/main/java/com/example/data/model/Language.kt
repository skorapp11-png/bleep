package com.example.data.model

enum class Language(val code: String, val displayName: String, val nativeName: String, val isRtl: Boolean) {
    ARABIC("ar", "العربية", "العربية", true),
    ENGLISH("en", "English", "English", false),
    FRENCH("fr", "Français", "Français", false)
}
