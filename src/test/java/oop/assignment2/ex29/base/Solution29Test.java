package oop.assignment2.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void user_enters_rate_of_return1() {
        Solution29 app = new Solution29();

        int expected = 18;
        int actual = app.formulaCalculator(4);
        assertEquals(expected, actual);
    }

    @Test
    void user_enters_rate_of_return2() {
        Solution29 app = new Solution29();

        int expected = 56;
        int actual = app.formulaCalculator(1.3);
        assertEquals(expected, actual);
    }
}