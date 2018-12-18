package me.freedom4live.algorithms.primes.ferma

import java.math.BigInteger
import kotlin.random.Random

object FermaPrimeChecker {

    fun isPrime(number: Long, times: Int): Boolean = when {
        number < 2 -> false
        number == 2L -> true
        else -> checkIsPrime(number, times)
    }

    private fun checkIsPrime(number: Long, times: Int): Boolean {
        val bigIntNumber = BigInteger.valueOf(number)

        repeat(times) {
            val randomNumber = getRandom(number).toBigInteger()
            val preResult = randomNumber.pow(number.toInt() - 1)
            val result = preResult.mod(bigIntNumber).toInt()

            if (result != 1) return false
        }

        return true
    }

    private fun getRandom(number: Long): Long = Random.nextLong(2, number)

}
