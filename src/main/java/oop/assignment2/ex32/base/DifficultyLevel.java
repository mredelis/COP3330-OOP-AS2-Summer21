package oop.assignment2.ex32.base;

import java.util.Scanner;

public class DifficultyLevel {
    private static final Scanner in = new Scanner(System.in);
    private final int level;

    // Constructor
    public DifficultyLevel(int difficultyLevel) {
        this.level = difficultyLevel;
    }


    public void setLevelMax() {
        int max;
        if (this.level == 1)
            max = 10;
        else if (this.level == 2)
            max = 100;
        else
            max = 3;

        this.play(max);
    }

    public void play(int max) {
        GuessTheNumber guessNumber = new GuessTheNumber(max);
        System.out.print("I have my number. What's your guess? ");

        int count = 0;
        String userGuessedNumber;
        boolean isInt;
        while (!guessNumber.numberFound) {
            count++; // First try, user can get the number in first try, then "you got it in 1 guess"
            do {
                userGuessedNumber = in.nextLine();
                isInt = app.validateInput(userGuessedNumber); // boolean

                if (!isIntegerInnerLoop) {
                    System.out.println("Sorry, you must enter a valid integer!");
                    count++;
                    flagUserGuessedNumberLoop = true;
                    continue;
                }
            } while (flagUserGuessedNumberLoop);

            number = Integer.parseInt(userGuessedNumber);

            System.out.print(guessNumber.userMessages(number));
        }

        System.out.println("in " + count + " guesses!");
    } // First difficulty level

}

