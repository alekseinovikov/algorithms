package me.freedom4live.algorithms.factors;

import java.util.ArrayList;
import java.util.List;

class SimpleFactorCalculator {

    static List<Integer> calculate(Integer number) {
        List<Integer> result = new ArrayList<>();

        number = checkOnTwo(number, result);
        checkOtherFactors(number, result);

        return result;
    }

    private static void checkOtherFactors(Integer number, List<Integer> result) {
        int maxFactor = (int) Math.sqrt(number);
        int currentFactor = 3;

        while (currentFactor <= maxFactor) {
            while (number % currentFactor == 0) {
                result.add(currentFactor);

                number = number / currentFactor;
                maxFactor = (int) Math.sqrt(number);
            }

            currentFactor += 2;
        }

        if (number > 1) result.add(number);
    }

    private static Integer checkOnTwo(Integer number, List<Integer> result) {
        while (number % 2 == 0) {
            result.add(2);
            number = number / 2;
        }
        return number;
    }

}
