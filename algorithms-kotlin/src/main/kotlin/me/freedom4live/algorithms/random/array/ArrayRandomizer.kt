package me.freedom4live.algorithms.random.array

import kotlin.random.Random.Default.nextInt

interface ArrayRandomizer {
    fun <T> randomize(innerArray: Array<T>): Array<T>
}

class ArrayRandomizerImpl : ArrayRandomizer {
    override fun <T> randomize(innerArray: Array<T>): Array<T> {
        val resultArray = innerArray.copyOf()

        for (i in 0 until resultArray.size - 1) {
            swap(resultArray, i, getRandomIndex(i + 1, resultArray.size))
        }

        return resultArray
    }

    private fun <T> swap(array: Array<T>, firstIndex: Int, secondIndex: Int) {
        val temp = array[firstIndex]
        array[firstIndex] = array[secondIndex]
        array[secondIndex] = temp
    }

    private fun getRandomIndex(from: Int, to: Int): Int {
        return when {
            from >= to -> from
            else -> nextInt(from, to)
        }
    }

}
