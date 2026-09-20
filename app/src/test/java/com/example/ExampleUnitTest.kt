package com.example

import com.example.data.model.AppStrings
import com.example.data.model.Currency
import com.example.data.model.Language
import com.example.data.sample.ProductCatalog
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun testCurrencyFormatting() {
        val amount = 100.0

        // DZD in Arabic: 100 * 200 = 20,000 د.ج
        val dzdAr = Currency.DZD.format(amount, Language.ARABIC)
        assertTrue(dzdAr.contains("20,000") && dzdAr.contains("د.ج"))

        // USD in English: $100.00
        val usdEn = Currency.USD.format(amount, Language.ENGLISH)
        assertTrue(usdEn.contains("$") && usdEn.contains("100"))

        // EUR in French: 92.00 €
        val eurFr = Currency.EUR.format(amount, Language.FRENCH)
        assertTrue(eurFr.contains("€") && eurFr.contains("92"))
    }

    @Test
    fun testProductCatalogIntegrity() {
        val products = ProductCatalog.products
        assertTrue("Catalog should not be empty", products.isNotEmpty())

        products.forEach { product ->
            assertNotNull(product.id)
            assertNotNull(product.name)
            assertTrue("Lowest price must be positive", product.lowestPriceUsd > 0)
            assertTrue("Product must have at least one offer", product.offers.isNotEmpty())
            assertTrue("Product must have specs in Arabic", product.specsAr.isNotEmpty())
            assertTrue("Product must have specs in English", product.specsEn.isNotEmpty())
            assertTrue("Product must have specs in French", product.specsFr.isNotEmpty())
            assertNotNull(product.aiSummary)
        }
    }

    @Test
    fun testTranslationsAvailable() {
        val arabic = AppStrings.get(Language.ARABIC)
        val english = AppStrings.get(Language.ENGLISH)
        val french = AppStrings.get(Language.FRENCH)

        assertEquals("SmartBuy", arabic.appTitle)
        assertEquals("SmartBuy", english.appTitle)
        assertEquals("SmartBuy", french.appTitle)

        assertTrue(arabic.budgetTitle.isNotBlank())
        assertTrue(english.budgetTitle.isNotBlank())
        assertTrue(french.budgetTitle.isNotBlank())
    }
}
