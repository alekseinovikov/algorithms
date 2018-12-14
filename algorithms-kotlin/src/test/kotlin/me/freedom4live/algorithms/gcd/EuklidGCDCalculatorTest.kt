package me.freedom4live.algorithms.gcd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class EuklidGCDCalculatorTest {

    private lateinit var calculator: GCDCalculator


    @BeforeEach
    fun setUp() {
        calculator = EuklidGCDCalculator()
    }

    @Test
    fun calculate_hasGCD_two() {
        //arrange
        val first = 6
        val second = 4

        //act
        val result = calculator.calculate(first, second)

        //assert
        assertEquals(2, result)
    }

    @Test
    fun calculate_hasGCD_5() {
        //arrange
        val first = 15
        val second = 5

        //act
        val result = calculator.calculate(first, second)

        //assert
        assertEquals(5, result)
    }

    @Test
    fun calculate_changedOrder_5() {
        //arrange
        val first = 5
        val second = 15

        //act
        val result = calculator.calculate(first, second)

        //assert
        assertEquals(5, result)
    }

    @Test
    fun calculate_simpleNumbers_1() {
        //arrange
        val first = 19
        val second = 23

        //act
        val result = calculator.calculate(first, second)

        //assert
        assertEquals(1, result)
    }

    @Test
    fun calculate_zero_zero() {
        //arrange
        val first = 0
        val second = 0

        //act
        val result = calculator.calculate(first, second)

        //assert
        assertEquals(0, result)
    }

}
