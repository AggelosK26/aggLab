package unittesting;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Rule;

public class ArithmeticOperationsTest {

    @Test(expected = ArithmeticException.class)
    public void test_Divide() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

        double numerator = 10.0;
        double denominator = 0.0;

        arithmeticOperations.divide(numerator, denominator);

        // The code should throw an ArithmeticException,
        // so if it reaches this point, the test fails.
        fail("Expected ArithmeticException was not thrown.");
    }

//    @Test
//    public void test_Multiply() {
//        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
//
//        int x = 5;
//        int y = 4;
//
//        int expected = 20;
//        int result = arithmeticOperations.multiply(x, y);
//
//        assertEquals(expected, result);
//    }
    @Rule 
	public ExpectedException thrown = ExpectedException.none(); //initialize it to .none()
    
    @Test
    public void test_Multiply() {
        ArithmeticOperations operations = new ArithmeticOperations();

        // Test case 1: Multiply two positive integers
        int result1 = operations.multiply(5, 3);
        assertEquals(15, result1);


        // Test case 3: Multiply a negative number (exception expected)
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("x & y should be >= 0");
        operations.multiply(-5, 3);

        // Test case 4: Multiply two large positive integers (exception expected)
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("The product does not fit in an Integer variable");
        operations.multiply(Integer.MAX_VALUE, 2);
    }
}