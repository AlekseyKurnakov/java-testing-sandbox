package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CalculatorTest {

    @Test
    public void testSum() {

        int expected = 5;
        int actual = Calculator.sum(3, 2);

        assertEquals(expected, actual);
    }
    @Test
    void twoSumTest() {
        int[] numbers = new int[]{3,2,4};
        int[] expected = new int[]{1, 2};
        int[] actual = Calculator.twoSum(numbers, 6);

        assertArrayEquals(expected, actual);


    }

}
