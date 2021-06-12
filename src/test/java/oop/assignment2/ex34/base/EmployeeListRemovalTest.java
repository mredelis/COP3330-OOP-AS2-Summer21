package oop.assignment2.ex34.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListRemovalTest {

    ArrayList<String> testArray = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson",
                                                                "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

    @Test
    void removeEmployee_Set1() {
        EmployeeListRemoval del = new EmployeeListRemoval();

        ArrayList<String> actual = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson",
                                                                "Chris Jones", "Jeremy Goodwin"));
                ArrayList<String> expected = del.removeEmployee(testArray, "Amanda Cullen");

        assertEquals(expected, actual);
    }

    @Test
    void removeEmployee_Set2() {
        EmployeeListRemoval del = new EmployeeListRemoval();

        ArrayList<String> actual = new ArrayList<>(Arrays.asList("Jackie Jackson", "Chris Jones",
                                                                 "Amanda Cullen", "Jeremy Goodwin"));
        ArrayList<String> expected = del.removeEmployee(testArray, "John Smith");

        assertEquals(expected, actual);
    }
}