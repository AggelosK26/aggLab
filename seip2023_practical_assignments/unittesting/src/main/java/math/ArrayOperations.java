package math;

import java.util.ArrayList;
import java.util.List;

import io.FileIO;

public class ArrayOperations {
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
