package oop.assignment2.ex28.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 28 - Adding Numbers
 */

import java.util.Scanner;

public class Solution28 {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double[] doubleArray = new double[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            doubleArray[i] = input.nextDouble();
        }

        Calculator calc = new Calculator();
        double total = calc.addNumbers(doubleArray);
        System.out.println("The total is " + total);

    }
}
