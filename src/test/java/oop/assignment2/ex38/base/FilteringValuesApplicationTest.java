package oop.assignment2.ex38.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FilteringValuesApplicationTest {

    @Test
    void filterEvenNumbers_Set1() {
        FilteringValuesApplication test = new FilteringValuesApplication();

        ArrayList<Integer> userInput = new ArrayList<>(Arrays.asList(1, 12, 5, 6, 9, 8, 20));
        ArrayList<Integer> actual = test.filterEvenNumbers(userInput);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(12, 6, 8, 20));

        assertEquals(expected, actual);
    }

    @Test
    void filterEvenNumbers_Set2() {
        FilteringValuesApplication test = new FilteringValuesApplication();

        ArrayList<Integer> userInput = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> actual = test.filterEvenNumbers(userInput);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

        assertEquals(expected, actual);
    }


}