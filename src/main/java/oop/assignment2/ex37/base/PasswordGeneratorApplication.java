package oop.assignment2.ex37.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 37 - Password Generator
 */

import java.util.Scanner;

public class PasswordGeneratorApplication {
    private PasswordGenerator pass;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        PasswordGeneratorApplication app = new PasswordGeneratorApplication();

        int length = app.getUserInput("What's the minimum length? ");
        int specialChars = app.getUserInput("How many special characters? ");
        int numbers = app.getUserInput("How many numbers? ");

        int letters = length - (specialChars + numbers);
        String password;

//        System.out.print(length + " " + specialChars + " " + numbers);
        if(letters >= (specialChars + numbers)){
            password = app.generate(specialChars, numbers, letters);
            System.out.println("Your password is " + password);
        }
        else
            System.out.println("Please ensure that there are at least as many letters " +
                                "are there are special characters and numbers.");

        input.close();
    }


    public PasswordGeneratorApplication(){
        this.pass = new PasswordGenerator();
    }


    public int getUserInput(String prompt){
        boolean isInteger;
        int value;

        while (true){
            System.out.print(prompt);
            String buffer = input.nextLine();
            isInteger = validateInput(buffer);

            if(isInteger){
                value = Integer.parseInt(buffer);
                if(value > 0)
                    break;
            }
        }
        return value;
    }


    public boolean validateInput(String buffer){
        try {
          Integer.parseInt(buffer);
        } catch (NumberFormatException ex){
            return false;
        }
        return true;
    }

    public String generate(int specialChars, int numbers, int letters){
        return this.pass.PassGenerator(specialChars, numbers, letters);
    }


}
