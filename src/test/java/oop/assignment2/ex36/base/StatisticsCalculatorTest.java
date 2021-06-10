package oop.assignment2.ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsCalculatorTest {

    ArrayList<Double> testArray= new ArrayList<>(Arrays.asList(1000.0, 100.0, 300.0, 200.0));

    @Test
    void averageTime() {
        StatisticsCalculator calc = new StatisticsCalculator();

        double expected = 400;
        double actual = calc.averageTime(testArray);
        assertEquals(expected, actual);
    }

    @Test
    void maxTime() {
        StatisticsCalculator calc = new StatisticsCalculator();

        double expected = 1000;
        double actual = calc.maxTime(testArray);
        assertEquals(expected, actual);
    }

    @Test
    void minTime() {
        StatisticsCalculator calc = new StatisticsCalculator();

        double expected = 100;
        double actual = calc.minTime(testArray);
        assertEquals(expected, actual);
    }

    @Test
    void standardDeviation() {
        StatisticsCalculator calc = new StatisticsCalculator();

        double expected = 353.55;
        double actual = calc.standardDeviation(testArray);
        double delta = 0.01;
        assertEquals(expected, actual, delta);
    }
}