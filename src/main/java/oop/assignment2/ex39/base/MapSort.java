package oop.assignment2.ex39.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSort {

    public List<Map<String, String>> createListOfEmployeeMapsToSort(){

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


        List<Map<String, String>> employeeList = new ArrayList<>();
        employeeList.add(map1);
        employeeList.add(map2);
        employeeList.add(map3);
        employeeList.add(map4);
        employeeList.add(map5);
        employeeList.add(map6);

        return employeeList;
    }
}
