package math;

/**
 * This class provides mathematical operations.
 */
public class MyMath {

    /**
     * Calculates the factorial of a non-negative integer.
     *
     * This method calculates the factorial of the given non-negative integer.
     * The input should be between 0 and 12 (inclusive).
     *
     * @param n The non-negative integer for which to calculate the factorial.
     * @return The factorial of the given non-negative integer.
     * @throws IllegalArgumentException If the input is not between 0 and 12 (inclusive).
     */
    public int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("Input should be between 0 and 12 (inclusive)");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
    
    /**
     * Checks if a number is prime.
     *
     * This method checks if the given number is a prime number.
     * The number must be greater than or equal to 2.
     *
     * @param n The number to check for primality.
     * @return {@code true} if the given number is prime, {@code false} otherwise.
     * @throws IllegalArgumentException If the number is less than 2.
     */
    public boolean isPrime(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Number must be greater than or equal to 2");
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
