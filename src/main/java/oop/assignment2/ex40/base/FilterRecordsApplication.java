package oop.assignment2.ex40.base;

import java.util.*;

public class FilterRecordsApplication {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        FilterRecordsApplication myApp = new FilterRecordsApplication();

        MapFilter mapList = new MapFilter();
        List<Map<String, String>> employeeList = mapList.createListOfEmployeeMapsToFilter();

        myApp.printColumnHeadings("Here is the List!");
        myApp.printTable(employeeList);

        System.out.print("\nEnter the search string: ");
        String searchString = input.nextLine();

        if(!searchString.isBlank()){
            myApp.printColumnHeadings("Results:\n");
            List<Map<String, String>> searchResults = myApp.filtering(searchString, employeeList);
            myApp.printTable(searchResults);
        }
        else
            System.out.println("Search string can not be blank ");
    }


    public void printColumnHeadings(String prompt) {
        System.out.println("\n" + prompt);
        System.out.printf("%-30s%s%-25s%s%-20s%n", "Name", "| ", "Position", "| ", "Separation Date");
        System.out.printf("%-30s%s%-25s%s%-20s%n", "------------------------------", "|",
            "-------------------------", " |", "--------------------");
    }


    public void printTable(List<Map<String, String>> eList) {
        for (Map<String, String> stringStringMap : eList) {
            System.out.printf("%-30s%s%-25s%s%-20s%n", stringStringMap.get("first") + " " + stringStringMap.get("last"),
                "|", stringStringMap.get("position"), " |", stringStringMap.get("date"));
        }
    }


    // Test filter here
    public List<Map<String, String>> filtering(String searchString, List<Map<String, String>> employeeList) {
        List<Map<String, String>> results = new ArrayList<>();

        if (employeeList != null) {
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).get("first").contains(searchString) || employeeList.get(i).get("last").contains(searchString))
                    results.add(employeeList.get(i));
            }
        }

        return results;
    }

}
