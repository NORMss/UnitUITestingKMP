@file:OptIn(ExperimentalTestApi::class)

import androidx.compose.ui.test.ExperimentalTestApi
import kotlin.test.Test
import androidx.compose.ui.test.runComposeUiTest
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick

class CounterKtTest {
    @Test
    fun testCounterUp() = runComposeUiTest {
        setContent {
            Counter()
        }

        onNodeWithText("Count: 0").assertExists()
        onNodeWithText("Count: 1").assertDoesNotExist()
        onNodeWithText("Increment").performClick()
        onNodeWithText("Count: 1").assertExists()
        onNodeWithText("Count: 0").assertDoesNotExist()
    }
}