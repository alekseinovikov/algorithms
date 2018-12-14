package me.freedom4live.algorithms.gcd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EuklidGCDCalculatorTest {

    private GCDCalculator calculator;


    @BeforeEach
    void setUp() {
        calculator = new EuklidGCDCalculator();
    }

    @Test
    void calculate_hasGCD_two() {
        //arrange
        int first = 6;
        int second = 4;

        //act
        int result = calculator.calculate(first, second);

        //assert
        Assertions.assertEquals(2, result);
    }

    @Test
    void calculate_hasGCD_5() {
        //arrange
        int first = 15;
        int second = 5;

        //act
        int result = calculator.calculate(first, second);

        //assert
        Assertions.assertEquals(5, result);
    }

    @Test
    void calculate_changedOrder_5() {
        //arrange
        int first = 5;
        int second = 15;

        //act
        int result = calculator.calculate(first, second);

        //assert
        Assertions.assertEquals(5, result);
    }

    @Test
    void calculate_simpleNumbers_1() {
        //arrange
        int first = 19;
        int second = 23;

        //act
        int result = calculator.calculate(first, second);

        //assert
        Assertions.assertEquals(1, result);
    }

    @Test
    void calculate_zero_zero() {
        //arrange
        int first = 0;
        int second = 0;

        //act
        int result = calculator.calculate(first, second);

        //assert
        Assertions.assertEquals(0, result);
    }

}
