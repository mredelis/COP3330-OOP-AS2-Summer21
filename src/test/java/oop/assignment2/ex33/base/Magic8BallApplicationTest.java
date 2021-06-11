package oop.assignment2.ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallApplicationTest {

    @Test
    void returnRandomAnswer_Set1() {
        Magic8BallApplication app = new Magic8BallApplication();

        String actual = app.returnRandomAnswer(new String[]{"Yes.", "No.", "Maybe.", "Ask again later."}, 2);
        assertEquals("Maybe.", actual);
    }

    @Test
    void returnRandomAnswer_Set2() {
        Magic8BallApplication app = new Magic8BallApplication();

        String actual = app.returnRandomAnswer(new String[]{"Yes.", "No.", "Maybe.", "Ask again later."}, 0);
        assertEquals("Yes.", actual);
    }
}