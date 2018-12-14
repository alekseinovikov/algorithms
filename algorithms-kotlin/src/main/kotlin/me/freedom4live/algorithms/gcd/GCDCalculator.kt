package me.freedom4live.algorithms.gcd

interface GCDCalculator {
    fun calculate(firstNumber: Int, secondNumber: Int): Int
}

class EuklidGCDCalculator : GCDCalculator {

    override fun calculate(firstNumber: Int, secondNumber: Int): Int {
        var first = firstNumber
        var second = secondNumber
        while (second != 0) {
            val reminder = first % second
            first = second
            second = reminder
        }

        return first
    }

}
