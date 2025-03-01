package com.example.unituitesting

import androidx.compose.ui.Modifier
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyCounterTest {
    @get:Rule
    val composableRule = createComposeRule()

    @Test
    fun testCounter(){
        composableRule.setContent {
            CounterApp()
        }

        composableRule.onNodeWithText("Count is 0").performClick()
        composableRule.onNodeWithText("Count is 1").assertIsDisplayed()

       // composableRule.onNodeWithText("Count is 1").performClick()
    }
}











