package oop.assignment2.ex36.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 36 - Computing Statistics
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ComputingStatisticsApplication {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<Double> timeArray = new ArrayList<>();

        do {
            System.out.print("Enter a number: ");
            String buffer = input.nextLine();
            if(buffer.equalsIgnoreCase("done"))
                flag = false;
            else{
                boolean result = isNumber(buffer);
                if(result){
                    timeArray.add(Double.parseDouble(buffer));
                }
            }

        } while(flag);

        if(!timeArray.isEmpty()){
            // print all elements of the ArrayList
            System.out.print("Numbers: ");
            for(int idx = 0; idx < timeArray.size(); idx++)
                System.out.printf("%.2f, ", timeArray.get(idx));

            StatisticsCalculator calc = new StatisticsCalculator();
            double ave = calc.averageTime(timeArray);
            System.out.printf("\nThe average is %.2f\n", ave);

            double min = calc.minTime(timeArray);
            System.out.printf("The minimum is %.2f\n", min);

            double max = calc.maxTime(timeArray);
            System.out.printf("The maximum is %.2f\n", max);

            double std = calc.standardDeviation(timeArray);
            System.out.printf("The standard deviation is %.2f\n", std);
        }


    }

    private static boolean isNumber(String buffer) {
        try {
            Double.parseDouble(buffer);
            return true;
        } catch ( NumberFormatException e){
            return false;
        }
    }

}
