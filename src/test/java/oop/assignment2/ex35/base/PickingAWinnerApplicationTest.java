package oop.assignment2.ex35.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PickingAWinnerApplicationTest {

    ArrayList<String> namesArray = new ArrayList<>(Arrays.asList("Homer", "Bart", "Maggie", "Lisa", "Moe"));

    @Test
    void pickWinner1() {
        PickingAWinnerApplication app = new PickingAWinnerApplication();
        String actual = app.pickWinner(namesArray, 0);
        assertEquals("Homer", actual);
    }

    @Test
    void pickWinner2() {
        PickingAWinnerApplication app = new PickingAWinnerApplication();
        String actual = app.pickWinner(namesArray, 2);
        assertEquals("Maggie", actual);
    }
}