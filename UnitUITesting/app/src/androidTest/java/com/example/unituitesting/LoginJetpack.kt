package com.example.unituitesting

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.example.unituitesting.uiTesting.JetpackUiTesting
import org.junit.Rule
import org.junit.Test

class LoginJetpack {
    @get:Rule
    val composableRule = createComposeRule()

    @Test
    fun checkTextFiled(){
        composableRule.setContent {
            JetpackUiTesting()
        }

        composableRule.onNodeWithText("EMAIL").performTextInput("geekyAnt@gmail.com")
        composableRule.onNodeWithText("Password").performTextInput("123456")

        composableRule.onNodeWithText("Login").performClick()
    }
}










