/*
 * Created on 7/4/21, 8:25 PM
 * Copyright (c) Imam Mufiid 2021. All right reserved.
 */

package unit.test.course

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class CalculatorTest {
    private val firstNum = 1
    private val secondNum = 5
    private val resultNum = 6
    private var calculator = Calculator()

    @Test
    fun testAddSuccess() {
        val result = calculator.add(firstNum, secondNum)
        assertNotNull(result)
        assertEquals(resultNum, result, "Hasil seharusnya $resultNum")
    }

}