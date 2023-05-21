package math;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class serves as a test suite for running all the tests in the math package.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        FactorialParameterizedTest.class,
        MyMathTest.class
})
public class AllTests {
    // This class doesn't have any code as it is used solely for test suite configuration.
}
