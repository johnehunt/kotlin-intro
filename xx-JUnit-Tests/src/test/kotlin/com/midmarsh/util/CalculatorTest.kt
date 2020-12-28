package com.midmarsh.util

import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable

class CalculatorTest {

    private val calculator = Calculator()

    @BeforeEach
    fun setUp() {
        println("BeforeEach")
    }

    @AfterEach
    fun tearDown() {
        println("AfterEach")
    }

    @Test
    @Order(1)
    fun testWhenAdding1and3ThenAnswerIs4() {
        Assertions.assertEquals(4, calculator.add(1, 3))
    }

    @Test
    @Order(2)
    fun `Adding 1 and 0 should be equal to 0`() {
        Assertions.assertEquals(1, calculator.add(1, 0))
    }

    @Test
    @Order(3)
    fun testDivide22by7By() {
        val myPi = calculator.div(22.0, 7.0)
        println(myPi)
        Assertions.assertEquals(3.14, myPi, 0.01)
    }

    @Test
    fun `Dividing by zero should throw the DivideByZeroException`() {
        val exception = Assertions.assertThrows(DivideByZeroException::class.java) {
            calculator.div(5.0, 0.0)
        }

        Assertions.assertEquals(5.0, exception.numerator)
    }

    @Test
    fun `The square of a number should be equal to that number multiplied in itself`() {
        Assertions.assertAll(
                Executable { assertEquals(0, calculator.add(0, 0)) },
                Executable { Assertions.assertEquals(1, calculator.add(0, 1)) },
                Executable { Assertions.assertEquals(2, calculator.add(1, 1)) }
        )
    }

    @Test
    @Disabled("for demonstration purposes")
    fun skippedTest() {
        // not executed
    }


}