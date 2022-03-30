package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.stream.util.XMLEventAllocator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
//        assertEquals(4, Calculator.multiply(2, 2));
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(0, Calculator.multiply(0, 1)),
                () -> assertEquals(-4, Calculator.multiply(-2, 2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(5, Calculator.multiply(2.5, 2)));
    }

    @Test
    @DisplayName("Second test")
    void testMultiply() {
        assertEquals(4, Calculator.multiply(2,2));
    }
}