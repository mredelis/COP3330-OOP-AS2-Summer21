package oop.assignment2.ex27.base;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class InputValidatorTest {
    static Stream<Arguments> produceStringsForFistNameValidation(){
        return Stream.of(
                arguments("A", "The first name must be at least 2 characters long.\n"),
                arguments("", "The first name must be at least 2 characters long.\nThe fist name must be filled in.\n"),
                arguments("Amelia", ""));
    }

    static Stream<Arguments> produceStringsForLastNameValidation(){
        return Stream.of(
                arguments("J", "The last name must be at least 2 characters long.\n"),
                arguments("", "The last name must be at least 2 characters long.\nThe last name must be filled in.\n"),
                arguments("Voldemort", ""));
    }

    static Stream<Arguments> produceStringsForEmployeeIDValidation(){
        return Stream.of(
                arguments("A12-1234", "The employee ID must be in the format of AA-1234.\n"),
                arguments("", "The employee ID must be in the format of AA-1234.\n"),
                arguments("Voldemort", "The employee ID must be in the format of AA-1234.\n"),
                arguments("AA-1234", ""));
    }

    static Stream<Arguments> produceStringsZIPCodeValidation(){
        return Stream.of(
                arguments("ABCDE", "The zipcode must be a 5 digit number.\n"),
                arguments("", "The zipcode must be a 5 digit number.\n"),
                arguments("Voldemort", "The zipcode must be a 5 digit number.\n"),
                arguments("32827555", "The zipcode must be a 5 digit number.\n"),
                arguments("32827", ""));
    }

    @ParameterizedTest
    @MethodSource("produceStringsForFistNameValidation")
    public void test_validateFirstName(String userInput, String expected) {
        InputValidator validator = new InputValidator();

        String actual = validator.validateFirstName(userInput);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("produceStringsForLastNameValidation")
    public void test_validateLastName(String userInput, String expected) {
        InputValidator validator = new InputValidator();

        String actual = validator.validateLastName(userInput);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("produceStringsForEmployeeIDValidation")
    public void test_validateEmployeeID(String userInput, String expected) {
        InputValidator validator = new InputValidator();

        String actual = validator.validateEmployeeID(userInput);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("produceStringsZIPCodeValidation")
    public void test_validateZipCode(String userInput, String expected) {
        InputValidator validator = new InputValidator();

        String actual = validator.validateZipCode(userInput);

        assertEquals(expected, actual);
    }
}