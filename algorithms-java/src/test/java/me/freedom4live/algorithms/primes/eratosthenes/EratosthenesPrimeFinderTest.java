package me.freedom4live.algorithms.primes.eratosthenes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EratosthenesPrimeFinderTest {

    @Test
    void find_5_3primes() {
        //act
        List<Integer> result = EratosthenesPrimeFinder.find(5);

        //assert
        List<Integer> expectedResult = Arrays.asList(2, 3, 5);
        assertTrue(checkIfListsContainsTheSameElements(expectedResult, result));
    }

    @Test
    void find_100_25primes() {
        //act
        List<Integer> result = EratosthenesPrimeFinder.find(100);

        //assert
        List<Integer> expectedResult = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        assertTrue(checkIfListsContainsTheSameElements(expectedResult, result));
    }

    @Test
    void find_175_40primes() {
        //act
        List<Integer> result = EratosthenesPrimeFinder.find(175);

        //assert
        List<Integer> expectedResult = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173);
        assertTrue(checkIfListsContainsTheSameElements(expectedResult, result));
    }

    @Test
    void find_410_80primes() {
        //act
        List<Integer> result = EratosthenesPrimeFinder.find(410);

        //assert
        List<Integer> expectedResult = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
                179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281,
                283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409);
        assertTrue(checkIfListsContainsTheSameElements(expectedResult, result));
    }

    @Test
    void find_945_160primes() {
        //act
        List<Integer> result = EratosthenesPrimeFinder.find(945);

        //assert
        List<Integer> expectedResult = Arrays.asList(
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
                179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281,
                283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409,
                419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541,
                547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659,
                661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809,
                811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941);
        assertTrue(checkIfListsContainsTheSameElements(expectedResult, result));
    }

    private boolean checkIfListsContainsTheSameElements(List first, List second) {
        //noinspection unchecked
        return first.containsAll(second) && second.containsAll(first);
    }

}
