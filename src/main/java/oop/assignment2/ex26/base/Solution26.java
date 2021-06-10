package oop.assignment2.ex26.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 26 - Months to Pay Off a Credit Card
 */

import java.util.Scanner;

public class Solution26 {
    private static final Scanner input = new Scanner(System.in);

    private static double apr;
    private static double b;  // balance
    private static double p;  // monthly payment

    public static void main(String[] args) {
        Solution26 app = new Solution26();
        app.readUserInput();

        PaymentCalculator calc = new PaymentCalculator();
        // n is the number of months
        int n = calc.calculateMonthsUntilPaidOff(b, apr, p);

        String output = "It will take you " + n + " months to pay off this card.";

        System.out.println(output);
    }


    public void readUserInput(){
        System.out.print("What is your balance? ");
        b = input.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = input.nextDouble();  // Annual

        System.out.print("What is the monthly payment you can make? ");
        p = input.nextDouble();
    }
}
