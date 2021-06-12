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

        do {
            int count = 0;

            // Return false is input is not an Integer Value
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            diffLevel = input.nextLine();
            isInteger = app.validateInput(diffLevel);
            if(!isInteger || (Integer.parseInt(diffLevel) < 0 || Integer.parseInt(diffLevel) > 4)){
                System.out.println("Sorry, Difficulty Level must be an Integer from 0-3!");
                flagDifficultyLoop = true;
                continue;
            }

            int toIntegerDiffLevel = Integer.parseInt(diffLevel);

            if(toIntegerDiffLevel == 1){
                // call method with max 10
                GuessTheNumber guessNumber = new GuessTheNumber(10);

                while (!guessNumber.numberFound){
                    count++; // First try, user can get the number in first try, then "you got it in 1 guess

                    do {
                        System.out.print("I have my number. What's your guess? ");
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
                    System.out.println(guessNumber.userMessages(number));
                }
            } // First difficulty level


            if(toIntegerDiffLevel == 2){
                // call method with max 100
            }


            else{
                // call method with max 1000
            }


        } while (flagDifficultyLoop);

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
//        while (true){
//            System.out.print("What is the rate of return? ");
//            try {
//                rateOfReturn = in.nextDouble();
//            } catch (InputMismatchException e){
//                System.out.println("Sorry. That's not a valid input.");
//                in.next();
//                continue;
//            }
//            if(Math.abs(rateOfReturn) < 0.0001) {
//                // equal to zero but floating point comparison
//                System.out.println("Sorry. That's not a valid input.");
////                in.next();
//                continue;
//            }
//            break;
//        }
//
//        return rateOfReturn;
    }
}
