package me.freedom4live.algorithms.factors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SimpleFactorCalculatorTest {

    @Test
    void calculate_100_factors() {
        //act
        List result = SimpleFactorCalculator.calculate(100);

        //assert
        Assertions.assertTrue(checkIfListsContainsTheSameElements(
                Arrays.asList(2, 2, 5, 5), result
        ));
    }

    @Test
    void calculate_1000_factors() {
        //act
        List result = SimpleFactorCalculator.calculate(1000);

        //assert
        Assertions.assertTrue(checkIfListsContainsTheSameElements(
                Arrays.asList(2, 2, 2, 5, 5, 5), result
        ));
    }

    @Test
    void calculate_66_factors() {
        //act
        List result = SimpleFactorCalculator.calculate(66);

        //assert
        Assertions.assertTrue(checkIfListsContainsTheSameElements(
                Arrays.asList(2, 3, 11), result
        ));
    }

    @Test
    void calculate_69_factors() {
        //act
        List result = SimpleFactorCalculator.calculate(69);

        //assert
        Assertions.assertTrue(checkIfListsContainsTheSameElements(
                Arrays.asList(3, 23), result
        ));
    }

    @Test
    void calculate_1024_factors() {
        //act
        List result = SimpleFactorCalculator.calculate(1024);

        //assert
        Assertions.assertTrue(checkIfListsContainsTheSameElements(
                Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2), result
        ));
    }

    @Test
    void calculate_12345_factors() {
        //act
        List result = SimpleFactorCalculator.calculate(12345);

        //assert
        Assertions.assertTrue(checkIfListsContainsTheSameElements(
                Arrays.asList(3, 5, 823), result
        ));
    }


    private boolean checkIfListsContainsTheSameElements(List first, List second) {
        //noinspection unchecked
        return first.containsAll(second) && second.containsAll(first);
    }

}
