package oop.assignment2.ex28.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_Five_Doubles() {
        Calculator calc = new Calculator();

        double expected = 15;
        double actual = calc.addNumbers(new double[]{1, 2, 3, 4, 5});
        assertEquals(expected, actual);
    }

    @Test
    void add_Five_FloatingPoint_Numbers() {
        Calculator calc = new Calculator();

        double expected = 10.6;
        double actual = calc.addNumbers(new double[]{2.3, 2.5, 2.7, 2.1, 1});
        assertEquals(expected, actual);
    }
}