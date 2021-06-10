package oop.assignment2.ex25.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    @DisplayName("Only numbers and is fewer than eight characters")
    void Only_Numbers_Fewer_Eight_Characters() {
        Solution25 passValidator = new Solution25();
        int expected = 1;
        int actual = passValidator.passwordValidator("12345");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Only Letters and is fewer than eight characters")
    void Only_Letters_Fewer_Eight_Characters() {
        Solution25 passValidator = new Solution25();
        int expected = 2;
        int actual = passValidator.passwordValidator("abcdef");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Letters and at least one number and is at least eight characters")
    void Letters_AtLeastOneNumber_AtLeastEightCharacters() {
        Solution25 passValidator = new Solution25();
        int expected = 3;
        int actual = passValidator.passwordValidator("abc123xyz");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Contains letters, numbers, and special characters and is at least eight characters")
    void Letters_Numbers_SpecialCharacters_AtLeastEightCharacters() {
        Solution25 passValidator = new Solution25();
        int expected = 4;
        int actual = passValidator.passwordValidator("1337h@xor!");
        assertEquals(expected, actual);
    }
}