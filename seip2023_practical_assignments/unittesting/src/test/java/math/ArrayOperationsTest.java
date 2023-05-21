package math;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import io.FileIO;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ArrayOperationsTest {
    FileIO fileIO = mock(FileIO.class);
    
    MyMath myMath = mock(MyMath.class);
    
    @InjectMocks
    private ArrayOperations arrayOperations;

    @Before
    public void setup() {
        // Mock the behavior of the fileIO.readFile() method
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
        Integer[] numbersArray = numbers.toArray(new Integer[0]);
        int[] numbersIntArray = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersIntArray[i] = numbersArray[i];
        }
        when(fileIO.readFile("filepath.txt")).thenReturn(numbersIntArray);
        
        // Mock the behavior of the myMath.isPrime() method
        when(myMath.isPrime(2)).thenReturn(true);
        when(myMath.isPrime(3)).thenReturn(true);
        when(myMath.isPrime(4)).thenReturn(false);
        when(myMath.isPrime(5)).thenReturn(true);
        when(myMath.isPrime(6)).thenReturn(false);
        when(myMath.isPrime(7)).thenReturn(true);
        when(myMath.isPrime(8)).thenReturn(false);
        when(myMath.isPrime(9)).thenReturn(false);
    }



    @Test
    public void test_FindPrimesInFile() {
        int[] expected = {2, 3, 5, 7};
        int[] result = arrayOperations.findPrimesInFile(fileIO, "filepath.txt", myMath);
        assertArrayEquals(expected, result);
    }
}
