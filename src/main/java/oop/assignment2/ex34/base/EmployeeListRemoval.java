package oop.assignment2.ex34.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 34 - Employee List Removal
 */

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeListRemoval {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> employeeNamesArray = new ArrayList<>();
        employeeNamesArray.add("John Smith");
        employeeNamesArray.add("Jackie Jackson");
        employeeNamesArray.add("Chris Jones");
        employeeNamesArray.add("Amanda Cullen");
        employeeNamesArray.add("Jeremy Goodwin");

        EmployeeListRemoval app = new EmployeeListRemoval();
        app.printEmployeeNames(employeeNamesArray);

        System.out.print("Enter an employee name to remove: ");
        String buffer = in.nextLine();

        employeeNamesArray = app.removeEmployee(employeeNamesArray, buffer);
        app.printEmployeeNames(employeeNamesArray);
    }

    public void printEmployeeNames(ArrayList<String> names) {
        System.out.printf("There are %d employees:\n", names.size());

        for (String name : names) System.out.println(name);

        System.out.println();
    }

    public ArrayList<String> removeEmployee(ArrayList<String> arr, String buffer) {
        if (!arr.contains(buffer)) {
            System.out.println(buffer + " does not exist in the array.\n");
        } else {
            arr.remove(buffer);
        }
        return arr;
    }

}
