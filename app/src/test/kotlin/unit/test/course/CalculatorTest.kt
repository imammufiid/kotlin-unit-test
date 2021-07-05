/*
 * Created on 7/4/21, 8:25 PM
 * Copyright (c) Imam Mufiid 2021. All right reserved.
 */

package unit.test.course

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

internal class CalculatorTest {
    private val firstNum = 5
    private val secondNum = 1
    private val resultNum = 6
    private var calculator = Calculator()

    @Test
    fun testAddSuccess() {
        val result = calculator.add(firstNum, secondNum)
        assertNotNull(result)
        assertEquals(resultNum, result, "Hasil seharusnya $resultNum")
    }

    @Test
    fun testDivideSuccess() {
        val result = calculator.divide(firstNum, secondNum)
        assertNotNull(result)
        assertEquals(5, result)
    }

    @Test
    fun testDivideFailed() {
        assertThrows<IllegalArgumentException> {
            calculator.divide(firstNum, 0)
        }
    }


}