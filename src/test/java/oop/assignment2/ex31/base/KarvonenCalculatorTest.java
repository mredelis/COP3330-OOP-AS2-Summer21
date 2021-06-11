package oop.assignment2.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenCalculatorTest {

    @Test
    void calculateTargetHeartRate_Set1() {
        KarvonenCalculator calc = new KarvonenCalculator();

        int expected = calc.calculateTargetHeartRate(22, 65, 55);
        int actual = 138;
        assertEquals(expected, actual);
    }

    @Test
    void calculateTargetHeartRate_Set2() {
        KarvonenCalculator calc = new KarvonenCalculator();

        int expected = calc.calculateTargetHeartRate(22, 65, 90);
        int actual = 184;
        assertEquals(expected, actual);
    }
}