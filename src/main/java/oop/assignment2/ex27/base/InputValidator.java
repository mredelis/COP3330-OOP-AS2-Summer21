package oop.assignment2.ex27.base;

public class InputValidator {

    public String validateFirstName(String firstname){
        if(firstname.isBlank())
            return "The first name must be at least 2 characters long." + "\nThe fist name must be filled in.";
        else if(firstname.length() < 3)
            return "The first name must be at least 2 characters long.";
        else
            return "";
    }

    public String validateLastName(String lastname){
        if(lastname.isBlank())
            return "The last name must be at least 2 characters long." + "\nThe last name must be filled in.";
        else if(lastname.length() < 3)
            return "The last name must be at least 2 characters long.";
        else
            return "";
    }

    public String validateEmployeeID(String id){
        String regex = "[A-Z]{2}-[0-9]{4}";
        if(!id.matches(regex))
            return "The employee ID must be in the format of AA-1234.";
        else
            return "";
    }

    public String validateZipCode(String zip){
        if(!zip.matches("^[0-9]{5}$"))
            return "The zipcode must be a 5 digit number.";
        else
            return "";
    }
}
