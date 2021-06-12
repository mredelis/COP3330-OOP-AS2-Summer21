package oop.assignment2.ex32.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 32 - Guess the Number Game
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessTheNumberApplication {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        GuessTheNumberApplication app = new GuessTheNumberApplication();


        System.out.println("Let's play Guess the Number!\n");

        boolean isInteger;
        boolean isIntegerInnerLoop;
        String diffLevel;
        String userGuessedNumber;
        boolean flagDifficultyLoop = false;
        boolean flagUserGuessedNumberLoop = false;

        int number;

        do { // this loop is to check if the user wants to play again

            ///////////////////////////////////////////////////////////////////////
            do { // this loop is to check if the difficulty level entry is valid

                int count = 0;

                // Return false is input is not an Integer Value
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                diffLevel = input.nextLine();
                isInteger = app.validateInput(diffLevel);
                if (!isInteger || (Integer.parseInt(diffLevel) < 0 || Integer.parseInt(diffLevel) > 4)) {
                    System.out.println("Sorry, Difficulty Level must be an Integer from 0-3!");
                    flagDifficultyLoop = true;
                    continue;
                }

                // Process the three difficulty levels
                int toIntegerDiffLevel = Integer.parseInt(diffLevel);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                if(toIntegerDiffLevel == 1){
                    // call method with max 10
                    GuessTheNumber guessNumber = new GuessTheNumber(10);

                    System.out.print("I have my number. What's your guess? ");

                    while (!guessNumber.numberFound){
                        count++; // First try, user can get the number in first try, then "you got it in 1 guess
                        do {
                            userGuessedNumber = input.nextLine();
                            isIntegerInnerLoop = app.validateInput(userGuessedNumber); // boolean

                            if(!isIntegerInnerLoop){
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

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                if(toIntegerDiffLevel == 2){
                    // call method with max 100
                }


                else{
                    // call method with max 1000
                }


            } while (flagDifficultyLoop);


            //////////////////////////////////////////////////////////////////////
            System.out.print("Do you wish to play again (Y/N)? ");

        } while (input.nextLine().equalsIgnoreCase("Y"));



    }


    public boolean validateInput(String difficultyLevel){
        int isInteger;
        try {
            isInteger = Integer.parseInt(difficultyLevel);
        } catch (NumberFormatException ex){
            // temporary
            System.out.println("Sorry, from validate input function!");
            return false;
        }
        return true;

    }

}
