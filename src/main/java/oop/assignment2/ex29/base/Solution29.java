package oop.assignment2.ex29.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 29 - Handling Bad Input
 */

public class Solution29 {

    public static void main(String[] args) {

        ValidateUserInput userInput = new ValidateUserInput();
        double rateOfReturn = userInput.validateInput();

        int years = new Solution29().formulaCalculator(rateOfReturn);
        System.out.printf("It will take %d years to double your initial investment.", years);
    }

    public int formulaCalculator(double r){
        return (int)Math.ceil(72/r);
    }
}
