/*
 * Created on 7/4/21, 8:24 PM
 * Copyright (c) Imam Mufiid 2021. All right reserved.
 */

package unit.test.course

class Calculator {
    fun add(first: Int, second: Int): Int = first + second

    fun divide(first: Int, second: Int): Int {
        if (second == 0) {
            throw IllegalArgumentException("Can't divide by zero")
        } else {
            return first/second
        }
    }
}