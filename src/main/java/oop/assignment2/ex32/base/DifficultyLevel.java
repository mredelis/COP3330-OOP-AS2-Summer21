package oop.assignment2.ex32.base;

import java.util.Scanner;

public class DifficultyLevel {
    private static final Scanner in = new Scanner(System.in);


    public void startPlaying(int level) {

        int max = this.setLevelMax(level);

        GuessTheNumber guessNumber = new GuessTheNumber(max);

        int count = 0;
        int number;
        String userGuessedNumberStr;
        boolean isInteger;
        boolean flagInvalidEntry;

        System.out.print("I have my number. What's your guess? ");

        while (!guessNumber.numberFound) {

            do {
                flagInvalidEntry = false;
                userGuessedNumberStr = in.nextLine();
                InputValidator validateUserEntry = new InputValidator(userGuessedNumberStr);
                isInteger = validateUserEntry.validateInput(); // boolean

                if (!isInteger) {
                    System.out.print("Sorry, you must enter a valid integer! Try again: ");
                    count++;
                    flagInvalidEntry = true;
                }

            } while (flagInvalidEntry);

            number = Integer.parseInt(userGuessedNumberStr);
            count++;

            System.out.print(guessNumber.userMessages(number));
        }

        // Found it
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

