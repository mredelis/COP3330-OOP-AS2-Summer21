package oop.assignment2.ex39.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SortRecordsApplicationTest {

    @Test
    void sorting() {
        // map1 employee 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("first", "Somdat");
        map1.put("last", "Jiawan");

        // map2 employee 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("first", "George");
        map2.put("last", "Morning");

        // map3 employee 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("first", "Christina");
        map3.put("last", "Haynes");

        // map4 employee 4
        Map<String, String> map4 = new HashMap<>();
        map4.put("first", "Orlando");
        map4.put("last", "Santiago");

        List<Map<String, String>> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);
        mapList.add(map4);

        SortRecordsApplication newApp = new SortRecordsApplication();
        newApp.Sorting(mapList);

        assertEquals("Haynes", mapList.get(0).get("last"));
        assertEquals("Jiawan", mapList.get(1).get("last"));
        assertEquals("Morning", mapList.get(2).get("last"));
        assertEquals("Santiago", mapList.get(3).get("last"));
    }
}