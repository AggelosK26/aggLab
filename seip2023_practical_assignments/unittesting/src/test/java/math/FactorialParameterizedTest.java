package math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FactorialParameterizedTest {

    private int input;
    private int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1 },
                { 1, 1 },
                { 2, 2 },
                { 12, 479_001_600 }
        });
    }

    public FactorialParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test_Factorial() {
        MyMath myMath = new MyMath();
        int result = myMath.factorial(input);
        assertEquals(expected, result);
    }
}
