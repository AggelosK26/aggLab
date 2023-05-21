package math;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * This class contains unit tests for the MyMath class.
 */
public class MyMathTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Default constructor for the MyMathTest class.
     */
    public MyMathTest() {
        // Default constructor
    }

    /**
     * Tests the factorial method with a negative number.
     * Expects an IllegalArgumentException with an appropriate error message.
     */
    @Test
    public void test_FactorialNegativeNumber() {
        MyMath myMath = new MyMath();

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Input should be between 0 and 12 (inclusive)");
        myMath.factorial(-5);
    }

    /**
     * Tests the factorial method with a number outside the allowed range.
     * Expects an IllegalArgumentException with an appropriate error message.
     */
    @Test
    public void test_FactorialOutOfRange() {
        MyMath myMath = new MyMath();

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Input should be between 0 and 12 (inclusive)");
        myMath.factorial(15);
    }

    /**
     * Tests the factorial method with input values of 0 and 1.
     * Expects the factorial of 0 to be 1 and the factorial of 1 to be 1.
     */
    @Test
    public void test_FactorialZeroAndOne() {
        MyMath myMath = new MyMath();

        int result0 = myMath.factorial(0);
        assertEquals(1, result0);

        int result1 = myMath.factorial(1);
        assertEquals(1, result1);
    }
    
    /**
     * Tests the isPrime method with prime numbers.
     * Expects the method to return true for prime numbers.
     */
    @Test
    public void test_IsPrimeWithPrimeNumber() {
        MyMath myMath = new MyMath();
        Assert.assertTrue(myMath.isPrime(2));
        Assert.assertTrue(myMath.isPrime(3));
    }

    /**
     * Tests the isPrime method with non-prime numbers.
     * Expects the method to return false for non-prime numbers.
     */
    @Test
    public void test_IsPrimeWithNonPrimeNumber() {
        MyMath myMath = new MyMath();
        Assert.assertFalse(myMath.isPrime(4));
        Assert.assertFalse(myMath.isPrime(6));
    }

    /**
     * Tests the isPrime method with a number less than 2.
     * Expects an IllegalArgumentException to be thrown.
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_IsPrimeWithNumberLessThan2() {
        MyMath myMath = new MyMath();
        myMath.isPrime(1);
    }
}
