package com.ganesh;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCalcTest {
    private final MyCalc calc = new MyCalc();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-2, 2));
    }

    @Test
    void testSubtract() {
        assertEquals(-1, calc.subtract(2, 3));
        assertEquals(4, calc.subtract(2, -2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(-4, calc.multiply(2, -2));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(4, 2));
        assertEquals(2.5, calc.divide(5, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}

