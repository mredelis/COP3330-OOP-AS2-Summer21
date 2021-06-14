package oop.assignment2.ex40.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FilterRecordsApplicationTest {

//    Map<String, String> m1 = new HashMap<>();
//    m1.put()

    @Test
    void filtering() {

        FilterRecordsApplication myApp = new FilterRecordsApplication();

        Map<String, String> m1 = new HashMap<>();
        m1.put("first", "Joe");
        m1.put("last", "Montana");

        Map<String, String> m2 = new HashMap<>();
        m2.put("first", "Monica");
        m2.put("last", "Spencer");

        Map<String, String> m3 = new HashMap<>();
        m3.put("first", "Mofoluso");
        m3.put("last", "Jacobson");

        Map<String, String> m4 = new HashMap<>();
        m4.put("first", "Jacinda");
        m4.put("last", "Arden");

        List<Map<String, String>> mapList = new ArrayList<>();
        mapList.add(m1);
        mapList.add(m2);
        mapList.add(m3);
        mapList.add(m4);

        List<Map<String, String>> expected1 = myApp.filtering("Ja", mapList);
        List<Map<String, String>> expected2 = myApp.filtering("Cu", mapList);
        List<Map<String, String>> expected3 = myApp.filtering("Mo", mapList);

        // Two matches. Does the expected List size is equal to 2 after filtering?
        assertTrue(expected1.size() == 2, "Filtering failed, List size should be 2 if the search string is Ja");
        // Non of the records match search string "Cu"
        assertTrue(expected2.size() == 0, "Filtering failed, List size should be 0 if the search string is Cu");
        // Three matches
        assertTrue(expected3.size() == 3, "Filtering failed, List size should be 3 if the search string is Mo");

//        myApp.printTable(expected1);
//        System.out.println();
//        myApp.printTable(expected2);
//        System.out.println();
//        myApp.printTable(expected3);

    }
}