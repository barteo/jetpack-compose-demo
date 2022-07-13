package com.microemu.myapplication

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ComposeTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private val sharedTest = SharedTest(composeTestRule)

    @Test
    fun robolectricTest() {
        sharedTest.sharedTest()
    }
}