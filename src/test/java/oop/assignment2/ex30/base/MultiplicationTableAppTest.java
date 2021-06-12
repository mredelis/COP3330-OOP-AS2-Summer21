package oop.assignment2.ex30.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableAppTest {

    @Test
    @DisplayName("4x3")
    void createMultiplicationTable_Set1() {
        MultiplicationTableApp app = new MultiplicationTableApp();

        String actual = app.createMultiplicationTable(4,3);
        // Using field width of 4 in formatted string, hence ___#
        String expected = "   1   2   3\n" +
                          "   2   4   6\n" +
                          "   3   6   9\n" +
                          "   4   8  12\n";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("2x2")
    void createMultiplicationTable_Set2() {
        MultiplicationTableApp app = new MultiplicationTableApp();

        String actual = app.createMultiplicationTable(2,2);
        // Using field width of 4 in formatted string, hence ___#
        String expected = "   1   2\n" +
                          "   2   4\n";
        assertEquals(expected, actual);
    }
}