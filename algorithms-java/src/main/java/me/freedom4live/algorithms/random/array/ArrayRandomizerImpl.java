package me.freedom4live.algorithms.random.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomizerImpl implements ArrayRandomizer {

    private final Random random;

    ArrayRandomizerImpl() {
        random = new Random();
    }

    @Override
    public <T> T[] randomize(T[] innerArray) {
        final T[] resultArray = copyArray(innerArray);
        final int lengthOfArray = resultArray.length;

        for (int i = 0; i < lengthOfArray; i++) {
            swap(resultArray, i, getRandomNumber(i, lengthOfArray));
        }

        return resultArray;
    }

    private <T> void swap(T[] array, int firstIndex, int secondIndex) {
        T temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private int getRandomNumber(int from, int to) {
        return random.nextInt(to - from) + from;
    }

    private <T> T[] copyArray(T[] array) {
        return Arrays.copyOf(array, array.length);
    }

}
