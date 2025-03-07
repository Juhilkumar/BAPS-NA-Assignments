package org.learning.assignment.assignment4;

import org.junit.jupiter.api.Assertions;

class CalculatorTest {
    Calculator calculator;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculator = new Calculator(4, 7);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        calculator = null;
    }

    @org.junit.jupiter.api.Test
    void add() {
        Assertions.assertEquals(11, calculator.add(4, 7));
    }

    @org.junit.jupiter.api.Test
    void sub() {
        Assertions.assertEquals(-3, calculator.sub(4, 7));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Assertions.assertEquals(28, calculator.multiply(4, 7));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Assertions.assertEquals(4, calculator.divide(28, 7));
    }
}