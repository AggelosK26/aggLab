package math;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MyMathTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    public MyMathTest() {
        // Default constructor
    }

    @Test
    public void test_FactorialNegativeNumber() {
        MyMath myMath = new MyMath();

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Input should be between 0 and 12 (inclusive)");
        myMath.factorial(-5);
    }

    @Test
    public void test_FactorialOutOfRange() {
        MyMath myMath = new MyMath();

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Input should be between 0 and 12 (inclusive)");
        myMath.factorial(15);
    }

    @Test
    public void test_FactorialZeroAndOne() {
        MyMath myMath = new MyMath();

        int result0 = myMath.factorial(0);
        assertEquals(1, result0);

        int result1 = myMath.factorial(1);
        assertEquals(1, result1);
    }
    
    @Test
    public void test_IsPrimeWithPrimeNumber() {
        MyMath myMath = new MyMath();
        Assert.assertTrue(myMath.isPrime(2));
        Assert.assertTrue(myMath.isPrime(3));
    }

    @Test
    public void test_IsPrimeWithNonPrimeNumber() {
        MyMath myMath = new MyMath();
        Assert.assertFalse(myMath.isPrime(4));
        Assert.assertFalse(myMath.isPrime(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_IsPrimeWithNumberLessThan2() {
        MyMath myMath = new MyMath();
        myMath.isPrime(1);
    }
}
