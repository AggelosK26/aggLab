package math;

import java.util.ArrayList;
import java.util.List;

import io.FileIO;

/**
 * This class provides operations related to arrays.
 */
public class ArrayOperations {

    /**
     * Finds the prime numbers in a file.
     *
     * This method reads the numbers from a file, checks if each number is prime,
     * and returns an array containing the prime numbers found.
     *
     * @param fileIo The FileIO object used to read the file.
     * @param filepath The path of the file to be read.
     * @param myMath The MyMath object used to check if a number is prime.
     * @return An array containing the prime numbers found in the file.
     */
    public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
        // Read the file and get the numbers as an array
        int[] numbers = fileIo.readFile(filepath);

        // List to store the prime numbers
        List<Integer> primeNumbers = new ArrayList<>();

        // Iterate over the numbers and check if they are prime
        for (int number : numbers) {
            if (myMath.isPrime(number)) {
                primeNumbers.add(number);
            }
        }

        // Convert the list of prime numbers to an array
        int[] primeArray = new int[primeNumbers.size()];
        for (int i = 0; i < primeNumbers.size(); i++) {
            primeArray[i] = primeNumbers.get(i);
        }

        return primeArray;
    }
}
