package oop.assignment2.ex27.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 27 - Validating Inputs
 */

import java.util.Scanner;

public class ValidateInputsApplication {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        ValidateInputsApplication sol = new ValidateInputsApplication();

        String firstName = sol.readUserInput("Enter first name: ");
        String lastName = sol.readUserInput("Enter last name: ");
        String zipCode = sol.readUserInput("Enter the ZIP code: ");
        String id = sol.readUserInput("Enter an employee ID: ");

        String output = sol.validateInput(firstName, lastName, id, zipCode);
        System.out.println(output);
    }


    private String readUserInput(String prompt){
        System.out.print(prompt);
        return in.nextLine();
    }

    public String validateInput(String firstName, String lastName, String id, String zip){
        InputValidator val = new InputValidator();
        String out1 = val.validateFirstName(firstName);
        String out2 = val.validateLastName(lastName);
        String out3 = val.validateEmployeeID(id);
        String out4 = val.validateZipCode(zip);

        if(out1.isBlank() && out2.isBlank() && out3.isBlank() && out4.isBlank())
            return "There were no errors found.";
        else
            return out1 + out2 + out3 + out4;
    }

}
