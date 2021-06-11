package oop.assignment2.ex27.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
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

        Employee employee = new Employee(firstName, lastName, zipCode, id);
        validateInput(employee);


    }


    private String readUserInput(String prompt){
        System.out.print(prompt);
        return in.next();
    }

    public static void validateInput(Employee employee){
        employee.validateFirstName();
        employee.validateLastName();
        employee.validateZipCode();
        employee.validateEmployeeID();
    }

}
