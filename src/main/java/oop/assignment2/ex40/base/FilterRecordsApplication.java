package oop.assignment2.ex40.base;

import java.util.*;

public class FilterRecordsApplication {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // List of maps. myList is employee list
        List<Map<String, String>> myList = new ArrayList<>();

        // map1 employee 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("first", "John");
        map1.put("last", "Johnson");
        map1.put("position", "Manager");
        map1.put("date", "2016-12-31");
        // map2 employee 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("first", "Tou");
        map2.put("last", "Xian");
        map2.put("position", "Software Engineer");
        map2.put("date", "2016-10-05");
        // map3 employee 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("first", "Michaela");
        map3.put("last", "Michelson");
        map3.put("position", "District Manager");
        map3.put("date", "2015-12-19");
        // map4 employee 4
        Map<String, String> map4 = new HashMap<>();
        map4.put("first", "Jake");
        map4.put("last", "Jacobson");
        map4.put("position", "Programmer");
        map4.put("date", "");
        // map5 employee 5
        Map<String, String> map5 = new HashMap<>();
        map5.put("first", "Jacquelyn");
        map5.put("last", "Jackson");
        map5.put("position", "DBA");
        map5.put("date", "");
        // map6 employee 6
        Map<String, String> map6 = new HashMap<>();
        map6.put("first", "Sally");
        map6.put("last", "Webber");
        map6.put("position", "Web Developer");
        map6.put("date", "2015-12-18");

        myList.add(map1);
        myList.add(map2);
        myList.add(map3);
        myList.add(map4);
        myList.add(map5);
        myList.add(map6);

        System.out.println("\nHere is the unsorted list!\n");
        System.out.printf("%-30s%s%-25s%s%-20s%n", "Name","| ", "Position", "| ", "Separation Date"); // column headings
        System.out.printf("%-30s%s%-25s%s%-20s%n", "------------------------------", "|",
            "-------------------------", " |", "--------------------");
        for (Map<String, String> stringStringMap : myList) {
            System.out.printf("%-30s%s%-25s%s%-20s%n", stringStringMap.get("first") + " " + stringStringMap.get("last"),
                "|", stringStringMap.get("position"), " |", stringStringMap.get("date"));
        }


        System.out.print("\nEnter the search string: ");
        String searchString = input.nextLine();
        System.out.println("Value to search is " + searchString);

        System.out.println("\nResults:\n");
        System.out.printf("%-30s%s%-25s%s%-20s%n", "Name","| ", "Position", "| ", "Separation Date"); // column headings
        System.out.printf("%-30s%s%-25s%s%-20s%n", "------------------------------", "|",
            "-------------------------", " |", "--------------------");

        for(int i = 0; i < myList.size(); i++){
           if(myList.get(i).get("first").contains(searchString) || myList.get(i).get("last").contains(searchString))
               System.out.printf("%-30s%s%-25s%s%-20s%n", myList.get(i).get("first") + " " + myList.get(i).get("last"), "|", myList.get(i).get("position"), " |", myList.get(i).get("date"));
        }

    }
}
