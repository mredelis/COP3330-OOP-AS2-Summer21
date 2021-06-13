package oop.assignment2.ex32.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {

    // In the application, the range of values are 1-10, 1-100, and 1-1000
    // For testing, if max = min, then the random number generated will always be equal to the min

    GuessTheNumber guessApp = new GuessTheNumber(10, 10);
    // this.ranNumber = random.nextInt((max-min) + 1) + min;
    // ranNumber would be 10 for these test cases

    @Test
    @DisplayName("You got it")
    void userMessages_Set1() {
        int playerGuessedNum = 10;
        String actual = guessApp.userMessages(playerGuessedNum);
        assertEquals("You got it ", actual);
    }

    @Test
    @DisplayName("Too Low")
    void userMessages_Set2() {
        int playerGuessedNum = 2;
        String actual = guessApp.userMessages(playerGuessedNum);
        assertEquals("Too low. Guess again: ", actual);
    }

    @Test
    @DisplayName("Too High")
    void userMessages_Set3() {
        int playerGuessedNum = 15;
        String actual = guessApp.userMessages(playerGuessedNum);
        assertEquals("Too high. Guess again: ", actual);
    }
}