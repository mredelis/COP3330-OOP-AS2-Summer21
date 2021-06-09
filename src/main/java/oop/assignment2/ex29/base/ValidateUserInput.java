package oop.assignment2.ex29.base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateUserInput {
    Scanner in = new Scanner(System.in);

    public double validateInput(){
        double rateOfReturn;

        while (true){
            System.out.print("What is the rate of return? ");
            try {
                rateOfReturn = in.nextDouble();
            } catch (InputMismatchException e){
                System.out.println("Sorry. That's not a valid input.");
                in.next();
                continue;
            }
            if(Math.abs(rateOfReturn) < 0.0001) {
                // equal to zero but floating point comparison
                System.out.println("Sorry. That's not a valid input.");
//                in.next();
                continue;
            }
            break;
        }

        return rateOfReturn;
    }

}
