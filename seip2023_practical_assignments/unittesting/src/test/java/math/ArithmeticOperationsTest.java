package math;

import org.junit.Test;
import org.junit.rules.ExpectedException;



import static org.junit.Assert.assertEquals;

import org.junit.Rule;

public class ArithmeticOperationsTest {
	ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    /**
     * Test case for dividing by zero.
     * Expects an ArithmeticException to be thrown.
     */
    @Test(expected = ArithmeticException.class)
    public void testDivide_DivisionByZero() {
        double numerator = 0;
        double denominator = 0;

        arithmeticOperations.divide(numerator, denominator);
    }

    /**
     * Test case for dividing two positive numbers.
     */
    @Test
    public void test_Divide_NormalCase1() {
        double numerator = 10;
        double denominator = 2;
        double expected = 5.0;

        double result = arithmeticOperations.divide(numerator, denominator);

        assertEquals(expected, result, 0.00001);
    }

    /**
     * Test case for dividing a negative number by a positive number.
     */
    @Test
    public void test_Divide_NormalCase2() {
        double numerator = -6;
        double denominator = 3;
        double expected = -2.0;

        double result = arithmeticOperations.divide(numerator, denominator);

        assertEquals(expected, result, 0.00001);
    }

    /**
     * Test case for dividing zero by a positive number.
     */
    @Test
    public void test_Divide_NormalCase3() {
        double numerator = 0;
        double denominator = 5;
        double expected = 0.0;

        double result = arithmeticOperations.divide(numerator, denominator);

        assertEquals(expected, result, 0.00001);
    }

    /**
     * Test case for dividing by zero.
     * Expects an ArithmeticException to be thrown.
     */
    @Test(expected = ArithmeticException.class)
    public void test_Divide_DivisionByZero() {
        double numerator = 0;
        double denominator = 0;

        arithmeticOperations.divide(numerator, denominator);
    }

    /**
     * Test case for dividing a large number by 1.
     */
    @Test
    public void test_Divide_LargeNumbers() {
        double numerator = Double.MAX_VALUE;
        double denominator = 1;
        double expected = 1.7976931348623157E308;

        double result = arithmeticOperations.divide(numerator, denominator);

        assertEquals(expected, result, 0.00001);
    }

    /**
     * Test case for dividing a negative number by zero.
     * Expects an ArithmeticException to be thrown.
     */
    @Test(expected = ArithmeticException.class)
    public void testDivide_NegativeNumberDividedByZero() {
        double numerator = -10;
        double denominator = 0;

        arithmeticOperations.divide(numerator, denominator);
    }

    /**
     * Test case for dividing the maximum value of a double by the maximum value of a double.
     */
    @Test
    public void test_Divide_DivideByMaxValue() {
        double numerator = Double.MAX_VALUE;
        double denominator = Double.MAX_VALUE;
        double expected = 1.0;

        double result = arithmeticOperations.divide(numerator, denominator);

        assertEquals(expected, result, 0.00001);
    }

    @Rule 
	public ExpectedException thrown = ExpectedException.none(); //initialize it to .none()
    
    ArithmeticOperations operations = new ArithmeticOperations();

    /**
     * Test case for multiplying two positive numbers.
     */
    @Test
    public void test_Multiply_NormalCase1() {
        int x = 5;
        int y = 3;
        int expected = 15;

        int result = operations.multiply(x, y);

        assertEquals(expected, result);
    }

    /**
     * Test case for multiplying a number by zero.
     */
    @Test(expected = ArithmeticException.class)
    public void test_Multiply_NormalCase2() {
        int x = 10;
        int y = 0;

        operations.multiply(x, y);
    }

    /**
     * Test case for multiplying a number by 1.
     */
    @Test
    public void test_Multiply_NormalCase3() {
        int x = 100;
        int y = 1;
        int expected = 100;

        int result = operations.multiply(x, y);

        assertEquals(expected, result);
    }

    /**
     * Test case for multiplying two equal numbers.
     */
    @Test
    public void test_Multiply_NormalCase4() {
        int x = 7;
        int y = 7;
        int expected = 49;

        int result = operations.multiply(x, y);

        assertEquals(expected, result);
    }

    /**
     * Test case for multiplying two arbitrary numbers.
     */
    @Test
    public void test_Multiply_NormalCase5() {
        int x = 12;
        int y = 6;
        int expected = 72;

        int result = operations.multiply(x, y);

        assertEquals(expected, result);
    }

    /**
     * Test case for multiplying a number by zero.
     */
    @Test
    public void test_Multiply_ZeroMultiplier() {
        int x = 0;
        int y = 5;
        int expected = 0;

        int result = operations.multiply(x, y);

        assertEquals(expected, result);
    }

    /**
     * Test case for multiplying the maximum value of Integer by 1.
     */
    @Test
    public void test_Multiply_MaxX() {
        int x = Integer.MAX_VALUE;
        int y = 1;
        int expected = 2147483647;

        int result = operations.multiply(x, y);

        assertEquals(expected, result);
    }

    /**
     * Test case for multiplying 1 by the maximum value of Integer.
     */
    @Test
    public void test_Multiply_MaxY() {
        int x = 1;
        int y = Integer.MAX_VALUE;
        int expected = 2147483647;

        int result = operations.multiply(x, y);

        assertEquals(expected, result);
    }

    /**
     * Test case for multiplying two numbers where the product exceeds the maximum value of Integer.
     * Expects an IllegalArgumentException to be thrown.
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_Multiply_ProductExceedsIntegerMaxValue() {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;

        operations.multiply(x, y);
    }

    /**
     * Test case for multiplying a negative number with a positive number.
     * Expects an IllegalArgumentException to be thrown.
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_Multiply_NegativeInputs() {
        int x = -5;
        int y = 2;

        operations.multiply(x, y);
    }
}