package me.freedom4live.algorithms.primes.ferma;

import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;

class FermaPrimeChecker {

    static boolean isPrime(long number, long times) {
        if (number < 2) return false;
        if (number == 2) return true;

        BigInteger theNumber = BigInteger.valueOf(number);

        for (int i = 0; i < times; i++) {
            long randomNumber = getRandomNumberForTest(number);

            BigInteger powResult = BigInteger.valueOf(randomNumber).pow((int) number - 1);
            long result = powResult.mod(theNumber).longValue();
            if (result != 1) return false;
        }
        return true;
    }

    private static long getRandomNumberForTest(long number) {
        return ThreadLocalRandom.current().longs(2, number)
                .findFirst().orElseThrow(() -> new IllegalStateException("Can't get current random state!"));
    }

}
