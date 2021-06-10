package oop.assignment2.ex25.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 25 - Password Strength Indicator
 */

public class Solution25 {

    public static void main(String[] args) {
        Solution25 app = new Solution25();

        // passwordValidator
        // return 1 if VERY weak password
        // return 2 if weak password
        // return 3 if strong password
        // return 4 if VERY strong password

        String password = "1337h@xor!";
        String output ="";
        int res = app.passwordValidator(password);

        switch (res){
            case 1:
                output = " is very weak password.";
                break;
            case 2:
                output = " is a weak password.";
                break;
            case 3:
                output = " is a strong password";
                break;
            case 4:
                output = " is a very strong password.";
                break;
        }

        System.out.println("The password " + password + output);

    }

    public int passwordValidator(String password) {
        // (?=.*[0-9]) at least one digit
        // (?=.*[#?!@$%^&*-] at least special characters

        // Only numbers and is fewer than eight characters.
        if(password.matches("^[0-9]+$") && password.length() < 9){
            return 1;
        }
        // Only letters and is fewer than eight characters.
        else if(password.matches("^[a-zA-Z]+$") && password.length() < 9){
            return 2;
        }
        // Contains letters and at least one number and is at least eight characters.
        else if(password.matches("^(?=.*[0-9])(?=[A-Za-z0-9]{8,})[A-Za-z0-9]+$")){
            return 3;
        }
        // Contains letters, numbers, and special characters and is at least eight characters.
        else if(password.matches("^(?=[A-Za-z0-9#?!@$%^&*-]{8,})[A-Za-z0-9#?!@$%^&*-]+$")){
            return 4;
        }
        else
            throw new IllegalArgumentException("Rule not taken into account in exercise");
    }
}
