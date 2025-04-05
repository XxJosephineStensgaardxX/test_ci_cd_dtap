
package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private com.example.Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new com.example.Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, calculator.add(-2, 2), "-2 + 2 should equal 0");
        assertEquals(-5, calculator.add(-2, -3), "-2 + -3 should equal -5");
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should equal 2");
        assertEquals(-1, calculator.subtract(2, 3), "2 - 3 should equal -1");
        assertEquals(0, calculator.subtract(2, 2), "2 - 2 should equal 0");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 should equal 0");
        assertEquals(-6, calculator.multiply(2, -3), "2 * -3 should equal -6");
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
        assertEquals(0.5, calculator.divide(1, 2), "1 / 2 should equal 0.5");
        assertEquals(-2, calculator.divide(6, -3), "6 / -3 should equal -2");
    }
}
