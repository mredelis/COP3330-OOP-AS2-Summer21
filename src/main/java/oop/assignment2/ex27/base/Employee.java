package oop.assignment2.ex27.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    String firstname;
    String lastname;
    String zip;
    String employeeID;
    String output;

    public Employee(String firstName, String lastName, String zipCode, String employeeID){
        this.firstname = firstName;
        this.lastname = lastName;
        this.zip = zipCode;
        this.employeeID = employeeID;
    }

    public void validateFirstName(){
        if(this.firstname.isBlank())
            output = "The fist name must be filled in.";
        else if(this.firstname.length() < 3)
            output = this.firstname + " is not a valid first name. It is too short.";
        System.out.println(output);
    }

    public void validateLastName(){
        if(this.lastname.isBlank())
            output = "The last name must be filled in.";
        else if(this.lastname.length() < 3)
            output = this.lastname + " is not a valid last name. It is too short.";
        System.out.println(output);
    }

    public void validateZipCode(){
        // Regex for string containing only digits
        String regex = "[0-9]+";

        // Compile regex
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(this.zip);

        if(!m.matches())
            output = "The ZIP code must be a number.";
    }

    public void validateEmployeeID(){

    }
}
