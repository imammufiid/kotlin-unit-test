/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package unit.test.course

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class AppTest {
    @Test fun appHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
