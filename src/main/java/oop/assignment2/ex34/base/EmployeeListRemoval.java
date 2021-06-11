package oop.assignment2.ex34.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 34 - Employee List Removal
 */

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeListRemoval {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.add("John Smith");
        employeeName.add("Jackie Jackson");
        employeeName.add("Chris Jones");
        employeeName.add("Amanda Cullen");
        employeeName.add("Jeremy Goodwin");

        EmployeeListRemoval app = new EmployeeListRemoval();
        app.printEmployeeNames(employeeName);
        app.removeEmployee(employeeName);
        app.printEmployeeNames(employeeName);
    }

    public void printEmployeeNames(ArrayList<String> names){
        System.out.printf("There are %d employees:\n", names.size() );
        for (int idx = 0; idx < names.size(); idx++)
            System.out.println(names.get(idx));
        System.out.println();
    }

    public void removeEmployee(ArrayList<String> names){
        System.out.print("Enter an employee name to remove: ");
        String buffer = in.nextLine();

        System.out.println();

        if(!names.contains(buffer))
            System.out.println(buffer + " does not exist in the array\n");
        else
            names.remove(buffer);
    }

}
