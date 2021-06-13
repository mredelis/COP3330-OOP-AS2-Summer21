package oop.assignment2.ex32.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 32 - Guess the Number Game
 */

import java.util.Scanner;

public class GuessTheNumberApplication {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Let's play Guess the Number!\n");

        boolean isInteger;

        String diffLevelStr;

        boolean flagDifficultyLoop = false;


        do { // this loop is to check if the user wants to play again

            do { // this loop is to check if the difficulty level entry is valid

                // Return false is input is not an Integer Value
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                diffLevelStr = input.nextLine();

                InputValidator validateDiffLevel = new InputValidator(diffLevelStr);
                isInteger = validateDiffLevel.validateInput();

                if (!isInteger || (Integer.parseInt(diffLevelStr) < 0 || Integer.parseInt(diffLevelStr) > 4)) {
                    System.out.println("Sorry, Difficulty Level must be an Integer from 0-3!");
                    flagDifficultyLoop = true;
                    continue;
                }

                // Process the three difficulty levels
                int toIntegerDiffLevel = Integer.parseInt(diffLevelStr);

                if (toIntegerDiffLevel == 1){
                    DifficultyLevel level1 = new DifficultyLevel();
                    level1.startPlaying(1);
                }
                else if(toIntegerDiffLevel == 2){
                    DifficultyLevel level2 = new DifficultyLevel();
                    level2.startPlaying(2);
                }
                else{
                    DifficultyLevel level3 = new DifficultyLevel();
                    level3.startPlaying(3);
                }

            } while (flagDifficultyLoop);


            System.out.print("Do you wish to play again (Y/N)? ");

        } while (input.nextLine().equalsIgnoreCase("Y"));

        System.out.println("Good bye!");

    }

}
