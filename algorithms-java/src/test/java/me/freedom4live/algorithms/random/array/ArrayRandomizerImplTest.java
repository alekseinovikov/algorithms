package me.freedom4live.algorithms.random.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRandomizerImplTest {

    private ArrayRandomizer randomizer;


    @BeforeEach
    void setUp() {
        randomizer = new ArrayRandomizerImpl();
    }

    @Test
    void randomize_hasStrings_theSameElements() {
        //arrange
        String[] stringArray = new String[]{"first", "second", "third", "fourth"};

        //act
        String[] randomizedArray = randomizer.randomize(stringArray);

        //assert
        List<String> randomizedList = Arrays.asList(randomizedArray);
        for (String s : stringArray) {
            assertTrue(randomizedList.contains(s));
        }
    }

    @Test
    void randomize_emptyArray_emptyArray() {
        //arrange
        String[] stringArray = new String[0];

        //act
        String[] resultArray = randomizer.randomize(stringArray);

        //assert
        assertEquals(0, resultArray.length);
    }

    @Test
    void randomize_anyArray_notTheSameArray() {
        //arrange
        String[] stringArray = new String[]{"element"};

        //act
        String[] resultArray = randomizer.randomize(stringArray);

        //assert
        assertNotSame(stringArray, resultArray);
    }

    @Test
    void randomize_hasRandomStrings_theSameElements() {
        //arrange
        String[] stringArray = new String[1000];
        for (int i = 0; i < stringArray.length; i++) {
            String value = UUID.randomUUID().toString();
            stringArray[i] = value;
        }

        //act
        String[] randomizedArray = randomizer.randomize(stringArray);

        //assert
        List<String> randomizedList = Arrays.asList(randomizedArray);
        for (String s : stringArray) {
            assertTrue(randomizedList.contains(s));
        }
    }

    @Test
    void randomize_hasIntegers_notTheSameOrder() {
        //arrange
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};

        //act
        Integer[] randomizedArray = randomizer.randomize(intArray);

        boolean somethingChanged = false;

        for (int i = 0; i < intArray.length; i++) {
            if (!intArray[i].equals(randomizedArray[i])) {
                somethingChanged = true;
            }
        }

        //assert
        assertTrue(somethingChanged);
    }

    @Test
    void randomize_hasRandomIntegers_notTheSameOrder() {
        //arrange
        Integer[] intArray = new Integer[1000];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            Integer value = random.nextInt(1000);
            intArray[i] = value;
        }

        //act
        Integer[] randomizedArray = randomizer.randomize(intArray);

        boolean somethingChanged = false;

        for (int i = 0; i < intArray.length; i++) {
            if (!intArray[i].equals(randomizedArray[i])) {
                somethingChanged = true;
            }
        }

        //assert
        assertTrue(somethingChanged);
    }

}
