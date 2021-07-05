/*
 * Created on 7/4/21, 8:25 PM
 * Copyright (c) Imam Mufiid 2021. All right reserved.
 */

package unit.test.course

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import java.lang.IllegalArgumentException

//@DisplayNameGeneration(SimpleDisplayNameGenerator::class)
@DisplayName("Test for Calculator Class")
internal class CalculatorTest {
    private val firstNum = 5
    private val secondNum = 1
    private val resultNum = 6
    private var calculator = Calculator()

    @Test
    @DisplayName("Test for function calculator.add(5, 1)")
    fun testAddSuccess() {
        val result = calculator.add(firstNum, secondNum)
        assertNotNull(result)
        assertEquals(resultNum, result, "Hasil seharusnya $resultNum")
    }

    @Test
    @DisplayName("Test for function calculator.divide(5, 1)")
    fun testDivideSuccess() {
        val result = calculator.divide(firstNum, secondNum)
        assertNotNull(result)
        assertEquals(5, result)
    }

    @Test
    @DisplayName("Test throw error for function calculator.divide(5, 1)")
    fun testDivideFailed() {
        assertThrows<IllegalArgumentException> {
            calculator.divide(firstNum, 0)
        }
    }

    @Test
    @Disabled("Coming Soon")
    fun testComingSoon() {
        assertTrue(true)
    }

}