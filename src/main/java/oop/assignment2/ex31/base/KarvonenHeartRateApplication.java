package oop.assignment2.ex31.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 31 - Karvonen Heart Rate
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class KarvonenHeartRateApplication {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        KarvonenHeartRateApplication app = new KarvonenHeartRateApplication();
        int age = app.readUserInput("Enter your age: ");
        int restingHR = app.readUserInput("Enter your resting heart rate: ");

        System.out.printf("Resting Pulse: %d\t\tAge: %d \n\n", restingHR, age);

        System.out.printf("%-10s%s%-10s%n", "Intensity","| ", "Rate"); // column headings
        System.out.printf("%-10s%s%-10s%n", "----------", "|", "----------");

        KarvonenCalculator operation = new KarvonenCalculator();
        for(int i = 55; i<=95; i+=5){
            int TargetHeartRate = operation.calculateTargetHeartRate(age, restingHR, i);
            System.out.printf("%-2s%-8s%s%-4s bpm%n", i, "%", "| ", TargetHeartRate); // column headings
        }
    }

    private int readUserInput(String prompt){
        int result;
        while (true){
            System.out.print(prompt);
            try {
                result = in.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Sorry. That's not a valid input.");
                in.next();
                continue;
            }
            break;
        }

        return result;
    }
}
