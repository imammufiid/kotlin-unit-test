/*
 * Created on 7/5/21, 9:39 AM
 * Copyright (c) Imam Mufiid 2021. All right reserved.
 */

package unit.test.course.generator

import org.junit.jupiter.api.DisplayNameGenerator
import java.lang.reflect.Method

class SimpleDisplayNameGenerator: DisplayNameGenerator {
    override fun generateDisplayNameForClass(testClass: Class<*>): String {
        return "Test ${testClass.simpleName}"
    }

    override fun generateDisplayNameForNestedClass(nestedClass: Class<*>): String {
        return "Test ${nestedClass.simpleName}"
    }

    override fun generateDisplayNameForMethod(testClass: Class<*>, testMethod: Method): String {
        return "Test ${testClass.simpleName}.${testMethod.name}"
    }
}