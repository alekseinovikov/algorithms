package me.freedom4live.algorithms.power

object PowerCalculator {

    fun power(value: Int, power: Int): Int = when {
        power == 0 -> 1
        value == 0 -> 0
        else -> binaryPower(value, power)
    }

    private fun binaryPower(value: Int, power: Int): Int = when (power % 2) {
        0 -> {
            val partResult = power(value, power / 2)
            partResult * partResult
        }
        else -> power(value, power - 1) * value
    }

}
