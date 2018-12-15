package me.freedom4live.algorithms.power;

class PowerCalculator {

    static int power(int value, int power) {
        if (power == 0) return 1;
        if (value == 0) return 0;

        if (power % 2 == 1) {
            return power(value, power - 1) * value;
        } else {
            int binaryResult = power(value, power / 2);
            return binaryResult * binaryResult;
        }
    }

}
