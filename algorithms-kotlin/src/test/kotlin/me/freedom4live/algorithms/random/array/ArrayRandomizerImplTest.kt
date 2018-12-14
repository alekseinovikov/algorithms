package me.freedom4live.algorithms.random.array

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.streams.toList

internal class ArrayRandomizerImplTest {

    private lateinit var randomizer: ArrayRandomizer


    @BeforeEach
    fun setUp() {
        randomizer = ArrayRandomizerImpl()
    }

    @Test
    fun randomize_stringArray_containsAllTheElements() {
        //arrange
        val stringArray = arrayOf("first", "second", "third", "fourth")

        //act
        val resultArray = randomizer.randomize(stringArray)

        //assert
        assertEquals(stringArray.size, resultArray.size)
        assertEquals(0, stringArray.filter { resultArray.contains(it).not() }.size)
    }

    @Test
    fun randomize_randomStringArray_containsAllElements() {
        //arrange
        val stringArray: Array<String> = IntRange(0, 1000).map { UUID.randomUUID().toString() }.toTypedArray()

        //act
        val resultArray = randomizer.randomize(stringArray)

        //assert
        assertEquals(stringArray.size, resultArray.size)
        assertEquals(0, stringArray.filter { resultArray.contains(it).not() }.size)
    }

    @Test
    fun randomize_emptyArray_empty() {
        //arrange
        val emptyArray = arrayOf<Any>()

        //act
        val resultArray = randomizer.randomize(emptyArray)

        //assert
        assertEquals(0, resultArray.size)
    }

    @Test
    fun randomize_anyArray_notTheSame() {
        //arrange
        val sourceArray = arrayOf("anyString")

        //act
        val resultArray = randomizer.randomize(sourceArray)

        //assert
        assertNotSame(sourceArray, resultArray)
    }

    @Test
    fun randomize_intArray_differentOrder() {
        //arrange
        val sourceArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

        //act
        val resultArray = randomizer.randomize(sourceArray)

        //assert
        var somethingChanged = false
        resultArray.forEachIndexed { index, element ->
            if (sourceArray[index].equals(element).not())
                somethingChanged = true
        }

        assertTrue(somethingChanged)
    }

    @Test
    fun randomize_randomIntArray_differentOrder() {
        //arrange
        val sourceArray: Array<Int> = Random().ints(1000).toList().toTypedArray()

        //act
        val resultArray = randomizer.randomize(sourceArray)

        //assert
        var somethingChanged = false
        resultArray.forEachIndexed { index, element ->
            if (sourceArray[index].equals(element).not())
                somethingChanged = true
        }

        assertTrue(somethingChanged)
    }

}
