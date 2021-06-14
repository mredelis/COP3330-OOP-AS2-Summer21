package oop.assignment2.ex39.base;

import java.util.*;

public class SortRecordsApplication {
    public static void main(String[] args) {

        SortRecordsApplication app = new SortRecordsApplication();

        // List of maps.
        MapSort listOfMaps = new MapSort();
        List<Map<String, String>> employeeList = listOfMaps.createListOfEmployeeMapsToSort();

        app.printColumnHeadings("Here is the unsorted list");
        app.printTable(employeeList);

        Collections.sort(employeeList, (m1, m2) -> m1.get("last").compareTo(m2.get("last")));

        app.printColumnHeadings("Here is the sorted list!");
        app.printTable(employeeList);

    }


    public void printColumnHeadings(String prompt){
        System.out.println("\n" + prompt + "\n");
        System.out.printf("%-30s%s%-25s%s%-20s%n", "Name","| ", "Position", "| ", "Separation Date");
        System.out.printf("%-30s%s%-25s%s%-20s%n", "------------------------------", "|",
                          "-------------------------", " |", "--------------------");
    }


    public void printTable(List<Map<String, String>> eList){
        for (Map<String, String> stringStringMap : eList) {
            System.out.printf("%-30s%s%-25s%s%-20s%n", stringStringMap.get("first") + " " + stringStringMap.get("last"),
                "|", stringStringMap.get("position"), " |", stringStringMap.get("date"));
        }
    }
}
