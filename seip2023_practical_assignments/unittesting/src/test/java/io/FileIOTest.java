package io;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class FileIOTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void test_ReadFile_NormalCase() {
        FileIO fileIO = new FileIO();
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = fileIO.readFile("src/test/resources/numbers.txt");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_ReadFile_EmptyFile() {
        FileIO fileIO = new FileIO();
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Given file is empty");
        fileIO.readFile("src/test/resources/empty.txt");
    }

    @Test
    public void test_ReadFile_NonExistentFile() {
        FileIO fileIO = new FileIO();
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Input file does not exist");
        fileIO.readFile("src/test/resources/nonexistent.txt");
    }
    
    @Test
    public void test_ReadFileContainsInvalidEntries() {
        FileIO fileIO = new FileIO();
        String filepath = "src/test/resources/invalid.txt";

//        exceptionRule.expect(NumberFormatException.class);
        fileIO.readFile(filepath);
    }
    
    
}


