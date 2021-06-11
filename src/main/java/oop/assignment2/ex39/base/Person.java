package oop.assignment2.ex39.base;

public class Person {
    String firstName;
    String lastName;
    String position;
    String separationDate;

    public Person(String first, String last, String pos, String sepDate){
        firstName = first;
        lastName = last;
        position = pos;
        separationDate = sepDate;
    }

    // Method to return Map Key
    public String getPersonLastName(){
        return lastName;
    }
}
