package me.freedom4live.algorithms.factors

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SimpleFactorCalculatorTest {

    @Test
    fun calculate_100_factors() {
        //act
        val result = SimpleFactorCalculator.calculate(100)

        //assert
        assertTrue(
            checkIfListsContainsTheSameElements(
                listOf(2, 2, 5, 5), result
            )
        )
    }

    @Test
    fun calculate_1000_factors() {
        //act
        val result = SimpleFactorCalculator.calculate(1000)

        //assert
        assertTrue(
            checkIfListsContainsTheSameElements(
                listOf(2, 2, 2, 5, 5, 5), result
            )
        )
    }

    @Test
    fun calculate_66_factors() {
        //act
        val result = SimpleFactorCalculator.calculate(66)

        //assert
        assertTrue(
            checkIfListsContainsTheSameElements(
                listOf(2, 3, 11), result
            )
        )
    }

    @Test
    fun calculate_69_factors() {
        //act
        val result = SimpleFactorCalculator.calculate(69)

        //assert
        assertTrue(
            checkIfListsContainsTheSameElements(
                listOf(3, 23), result
            )
        )
    }

    @Test
    fun calculate_1024_factors() {
        //act
        val result = SimpleFactorCalculator.calculate(1024)

        //assert
        assertTrue(
            checkIfListsContainsTheSameElements(
                listOf(2, 2, 2, 2, 2, 2, 2, 2, 2, 2), result
            )
        )
    }

    @Test
    fun calculate_12345_factors() {
        //act
        val result = SimpleFactorCalculator.calculate(12345)

        //assert
        assertTrue(
            checkIfListsContainsTheSameElements(
                listOf(3, 5, 823), result
            )
        )
    }

    private fun checkIfListsContainsTheSameElements(first: List<*>, second: List<*>): Boolean =
        first.containsAll(second) && second.containsAll(first)

}
