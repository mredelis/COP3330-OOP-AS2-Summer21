package oop.assignment2.ex32.base;

import java.util.Random;

public class GuessTheNumber {
    private final int ranNumber;
    boolean numberFound = false; // if number is guessed

    // Constructor
    public GuessTheNumber(int max){
        Random random = new Random();
        this.ranNumber = random.nextInt(max) + 1;
    }


    public String userMessages(int playerGuessedNum){
        if(playerGuessedNum == ranNumber){
            this.numberFound = true;
            return "You got it "; // concat output statement with main class count
        }
        if(playerGuessedNum < ranNumber)
            return "Too low. Guess again: ";

        return "Too high. Guess again: ";
    }
}
