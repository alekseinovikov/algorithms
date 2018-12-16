package me.freedom4live.algorithms.primes.eratosthenes

object EratosthenesPrimeFinder {

    fun find(number: Int): List<Int> {
        val result = Result(number)

        checkTwoFactors(result)
        checkOtherFactors(result)

        return result.getResultList()
    }

    private fun checkOtherFactors(result: Result) {
        val maxFactor = Math.sqrt(result.maxNumber.toDouble()).toInt()
        var pointer = 3
        while (pointer <= maxFactor) {
            for (i in pointer * 2..result.maxNumber step pointer) {
                result.markAsComplex(i)
            }

            pointer += 2
            while (pointer <= result.maxNumber && result.isComplex(pointer)) {
                pointer += 2
            }
        }
    }

    private fun checkTwoFactors(result: Result) {
        for (i in 4..result.maxNumber step 2) {
            result.markAsComplex(i)
        }
    }

    private data class Result(val maxNumber: Int) {
        private val complexCell: Array<Boolean> = Array(maxNumber + 1) { false }

        fun getResultList(): List<Int> {
            return complexCell.mapIndexed { index, value -> Pair(index, value) }
                .filter { it.first > 1 && it.second.not() }.map { it.first }
        }

        fun markAsComplex(number: Int) {
            complexCell[number] = true
        }

        fun isComplex(number: Int) = complexCell[number]

    }

}
