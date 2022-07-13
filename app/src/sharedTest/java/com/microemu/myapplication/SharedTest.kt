package com.microemu.myapplication

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.onNodeWithText
import com.microemu.myapplication.ui.theme.MyApplicationTheme

class SharedTest(
    private val composeTestRule: ComposeContentTestRule
) {

    fun sharedTest() {
        composeTestRule.setContent {
            MyApplicationTheme {
                Greeting("Android")
            }
        }

        composeTestRule.onNodeWithText("Hello Android!").assertIsDisplayed()
    }
}