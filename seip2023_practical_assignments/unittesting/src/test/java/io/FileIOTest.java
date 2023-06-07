package io;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;

/**
 * This class contains unit tests for the FileIO class.
 */
public class FileIOTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    /**
     * Tests the normal case of reading a file.
     */
    @Test
    public void test_ReadFile_NormalCase() {
        FileIO fileIO = new FileIO();
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = fileIO.readFile("src/test/resources/numbers.txt");
        assertArrayEquals(expected, actual);
    }

    /**
     * Tests the case of reading an empty file.
     */
    @Test
    public void test_ReadFile_EmptyFile() {
        FileIO fileIO = new FileIO();
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Given file is empty");
        fileIO.readFile("src/test/resources/empty.txt");
    }

    /**
     * Tests the case of reading a non-existent file.
     */
    @Test
    public void test_ReadFile_NonExistentFile() {
        FileIO fileIO = new FileIO();
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Input file does not exist");
        fileIO.readFile("src/test/resources/nonexistent.txt");
    }
    
    
    
    /**
     * Tests the case of reading a file containing invalid entries.
     */
    @Test
    public void test_ReadFileContainsInvalidEntries() {
        FileIO fileIO = new FileIO();
        String filepath = "src/test/resources/invalid.txt";

        // Additional exception expectations or assertions can be added as needed
        fileIO.readFile(filepath);
    }
}
