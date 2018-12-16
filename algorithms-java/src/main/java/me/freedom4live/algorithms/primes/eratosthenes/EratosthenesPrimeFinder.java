package me.freedom4live.algorithms.primes.eratosthenes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class EratosthenesPrimeFinder {

    static List<Integer> find(int maxNumber) {
        if (isSmallResult(maxNumber)) {
            return calculateSmallResult(maxNumber);
        }
        Result result = new Result(maxNumber);
        checkTwoNumber(result);
        checkOtherNumbers(result);

        return result.getResultPrimes();
    }

    private static void checkOtherNumbers(Result result) {
        int pointer = 3;
        int maxFactor = (int) Math.sqrt(result.getMaxNumber());
        while (pointer <= maxFactor) {
            for (int i = pointer * 2; i <= result.maxNumber; i += pointer) {
                result.markAsComplex(i);
            }

            pointer += 2;
            while (pointer <= result.getMaxNumber() && result.isComplex(pointer)) {
                pointer += 2;
            }
        }
    }

    private static void checkTwoNumber(Result result) {
        for (int i = 4; i < result.getMaxNumber(); i += 2) {
            result.markAsComplex(i);
        }
    }

    private static List<Integer> calculateSmallResult(int number) {
        if (number == 2) return Collections.singletonList(2);
        if (number == 3) return Arrays.asList(2, 3);

        return Collections.emptyList();
    }

    private static boolean isSmallResult(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The finding area must be positive!");
        }

        return number <= 3;
    }

    private static class Result {
        private final boolean[] complexNumbersCell;
        private final int maxNumber;

        private Result(int maxNumber) {
            complexNumbersCell = new boolean[maxNumber + 1];
            this.maxNumber = maxNumber;
        }

        private int getMaxNumber() {
            return maxNumber;
        }

        private boolean isComplex(int number) {
            return complexNumbersCell[number];
        }

        private void markAsComplex(int number) {
            if (number >= complexNumbersCell.length) {
                throw new IllegalArgumentException("The number is more then finding area!");
            }

            complexNumbersCell[number] = true;
        }

        private List<Integer> getResultPrimes() {
            final List<Integer> result = new ArrayList<>();
            for (int i = 2; i < complexNumbersCell.length; i++) {
                if (!complexNumbersCell[i]) result.add(i);
            }

            return result;
        }

    }

}
