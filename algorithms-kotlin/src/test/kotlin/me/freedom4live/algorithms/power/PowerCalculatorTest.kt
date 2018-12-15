package me.freedom4live.algorithms.power

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.random.Random

internal class PowerCalculatorTest {

    @Test
    fun power_powerIsZeroAnyValue_one() {
        repeat(1000) {
            //act
            val result = PowerCalculator.power(Random.nextInt(), 0)

            //assert
            assertEquals(1, result)
        }
    }

    @Test
    fun power_powerIsAnyValueIsZero_zero() {
        repeat(1000) {
            //act
            val result = PowerCalculator.power(0, Random.nextInt(1000) + 1)

            //assert
            assertEquals(0, result)
        }
    }

    @Test
    fun power_powerIs4ValueIs2_16() {
        //act
        val result = PowerCalculator.power(2, 4)

        //
        assertEquals(16, result)
    }

    @Test
    fun power_anyValueAnyPower() {
        repeat(1000) {
            //arrange
            val value = Random.nextInt(15)
            val power = Random.nextInt(6)
            val neededResult: Int = Math.pow(value.toDouble(), power.toDouble()).toInt()

            //act
            val result = PowerCalculator.power(value, power)

            //assert
            assertEquals(neededResult, result)
        }
    }

}
