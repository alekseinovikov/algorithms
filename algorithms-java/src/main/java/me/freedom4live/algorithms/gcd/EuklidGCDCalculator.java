package me.freedom4live.algorithms.gcd;

public class EuklidGCDCalculator implements GCDCalculator {

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int reminder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = reminder;
        }

        return firstNumber;
    }

}
