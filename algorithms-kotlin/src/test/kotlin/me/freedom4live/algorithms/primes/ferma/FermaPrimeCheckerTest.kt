package me.freedom4live.algorithms.primes.ferma

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class FermaPrimeCheckerTest {

    @Test
    fun isPrime_61Prime10Times_prime() {
        //act
        val isPrime = FermaPrimeChecker.isPrime(61, 10)

        //assert
        assertTrue(isPrime)
    }

    @Test
    fun isPrime_997Prime100Times_prime() {
        //act
        val isPrime = FermaPrimeChecker.isPrime(997, 100)

        //assert
        assertTrue(isPrime)
    }

    @Test
    fun isPrime_9973Prime100Times_prime() {
        //act
        val isPrime = FermaPrimeChecker.isPrime(9973, 100)

        //assert
        assertTrue(isPrime)
    }

    @Test
    fun isPrime_1847Prime100Times_prime() {
        //act
        val isPrime = FermaPrimeChecker.isPrime(1847, 100)

        //assert
        assertTrue(isPrime)
    }

    @Test
    fun isPrime_102Prime1000Times_notPrime() {
        //act
        val isPrime = FermaPrimeChecker.isPrime(102, 1000)

        //assert
        assertFalse(isPrime)
    }

    @Test
    fun isPrime_1000Prime1000Times_notPrime() {
        //act
        val isPrime = FermaPrimeChecker.isPrime(1000, 1000)

        //assert
        assertFalse(isPrime)
    }

    @Test
    fun isPrime_1232Prime1000Times_notPrime() {
        //act
        val isPrime = FermaPrimeChecker.isPrime(1232, 1000)

        //assert
        assertFalse(isPrime)
    }

    @Test
    fun isPrime_445Prime1000Times_notPrime() {
        //act
        val isPrime = FermaPrimeChecker.isPrime(445, 1000)

        //assert
        assertFalse(isPrime)
    }

    @Test
    fun isPrime_100Prime1000Times_notPrime() {
        //act
        val isPrime = FermaPrimeChecker.isPrime(100, 1000)

        //assert
        assertFalse(isPrime)
    }

}
