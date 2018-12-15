package me.freedom4live.algorithms.factors

object SimpleFactorCalculator {

    fun calculate(number: Int): List<Int> = Result(number).run {
        findFactorOfTwoAndUpdateResult(this)
        findFactorsOfOtherNumbersAndUpdateResult(this)
        findAdditionalFactorAndUpdateResult(this)
        this.getFactorsAsList()
    }

    private fun findFactorOfTwoAndUpdateResult(result: Result) {
        while (result.reminder % 2 == 0) {
            result.addFactor(2)
            result.reminder /= 2
        }
    }

    private fun findFactorsOfOtherNumbersAndUpdateResult(result: Result) {
        var currentFactor = 3
        var maxFactor: Int = computeCurrentMaxFactor(result)

        while (maxFactor >= currentFactor) {
            checkNumberByFactor(result, currentFactor)
            maxFactor = computeCurrentMaxFactor(result)

            currentFactor += 2
        }
    }

    private fun findAdditionalFactorAndUpdateResult(result: Result) {
        if (result.reminder > 1) result.addFactor(result.reminder)
    }

    private fun checkNumberByFactor(result: Result, currentFactor: Int) {
        while (result.reminder % currentFactor == 0) {
            result.addFactor(currentFactor)
            result.reminder /= currentFactor
        }
    }

    private fun computeCurrentMaxFactor(result: Result) =
        Math.sqrt(result.reminder.toDouble()).toInt()

    private data class Result(var reminder: Int) {
        private val factors: MutableList<Int> = mutableListOf()

        fun addFactor(factor: Int) {
            factors.add(factor)
        }

        fun getFactorsAsList() = factors
    }

}
