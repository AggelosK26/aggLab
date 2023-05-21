package math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * This class contains parameterized unit tests for the factorial method in the MyMath class.
 */
@RunWith(Parameterized.class)
public class FactorialParameterizedTest {

    private int input;
    private int expected;

    /**
     * Provides the test data for the parameterized tests.
     * Each test case is represented as an array of input and expected values.
     *
     * @return the collection of test data arrays
     */
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1 },
                { 1, 1 },
                { 2, 2 },
                { 12, 479_001_600 }
        });
    }

    /**
     * Constructs a parameterized test case with the given input and expected values.
     *
     * @param input    the input value for the factorial calculation
     * @param expected the expected result of the factorial calculation
     */
    public FactorialParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    /**
     * Tests the factorial method with parameterized input values.
     */
    @Test
    public void test_Factorial() {
        MyMath myMath = new MyMath();
        int result = myMath.factorial(input);
        assertEquals(expected, result);
    }
}
