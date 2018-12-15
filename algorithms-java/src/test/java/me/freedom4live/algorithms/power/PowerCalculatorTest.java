package me.freedom4live.algorithms.power;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerCalculatorTest {

    @Test
    void power_valueIsZeroAnyPower_zero() {
        for (int i = 0; i < 1000; i++) {
            //act
            int result = PowerCalculator.power(0, new Random().nextInt(1000) + 1);

            //assert
            assertEquals(0, result);
        }
    }

    @Test
    void power_anyValueZeroPower_one() {
        for (int i = 0; i < 1000; i++) {
            //act
            int result = PowerCalculator.power(new Random().nextInt(), 0);

            //assert
            assertEquals(1, result);
        }
    }

    @Test
    void power_valueIs2PowerIs4_16() {
        //act
        int result = PowerCalculator.power(2, 4);

        //assert
        assertEquals(16, result);
    }

    @Test
    void power_anyValueAnyPower_powerOfThem() {
        for (int i = 0; i < 1000; i++) {
            //arrange
            Random random = new Random();
            int value = random.nextInt(15);
            int power = random.nextInt(6);
            int neededResult = (int) Math.pow(value, power);

            //act
            int result = PowerCalculator.power(value, power);

            //assert
            assertEquals(neededResult, result);
        }
    }

}
