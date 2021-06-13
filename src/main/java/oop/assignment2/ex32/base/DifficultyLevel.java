package oop.assignment2.ex32.base;

import java.util.Scanner;

public class DifficultyLevel {
    private static final Scanner in = new Scanner(System.in);


    public void startPlaying(int level) {

        int max = this.setLevelMax(level);

        GuessTheNumber guessNumber = new GuessTheNumber(max);
        System.out.print("I have my number. What's your guess? ");

        int count = 0;
        int number;

        String userGuessedNumberStr;

        boolean isInteger;
        boolean flagUserGuessedNumberLoop = false;

        while (!guessNumber.numberFound) {
            count++; // First try, user can get the number in first try, then "you got it in 1 guess"

            do { // Difficulty level loop
                userGuessedNumberStr = in.nextLine();

                InputValidator validateUserEntry = new InputValidator(userGuessedNumberStr);
                isInteger = validateUserEntry.validateInput(); // boolean

                if (!isInteger) {
                    System.out.println("Sorry, you must enter a valid integer!");

                    count++;
                    flagUserGuessedNumberLoop = true;

                }
            } while (flagUserGuessedNumberLoop);

            number = Integer.parseInt(userGuessedNumberStr);

            System.out.print(guessNumber.userMessages(number));
        }

        System.out.println("in " + count + " guesses!");

    }

    private int setLevelMax(int level) {
        if (level == 1)
            return 10;
        else if (level == 2)
            return  100;
        else
            return 1000;
    }
}

