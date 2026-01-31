package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum() {

        int expected = 5;
        int actual = Calculator.sum(3, 2);

        assertEquals(expected, actual);
    }
}
