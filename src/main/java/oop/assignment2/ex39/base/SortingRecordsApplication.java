package oop.assignment2.ex39.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingRecordsApplication {
    public static void main(String[] args) {

        Person p1 = new Person("John", "Johnson", "Manager", "2016-12-31");
        Person p2 = new Person("Tou", "Xingu", "Software Engineer", "2016-10-05");
        Person p3 = new Person("Michaela", "Michelson", "District Manager", "2015-12-19");
        Person p4 = new Person("Jake", "Jacobson", "Programmer", "");
        Person p5 = new Person("Jacquelyn", "Jackson", "DBA", "");
        Person p6 = new Person("Sally", "Webber", "Webb Developer", "2015-12-18");

        Map<String, Person> m1 = new HashMap<>();
        Map<String, Person> m2 = new HashMap<>();
        Map<String, Person> m3 = new HashMap<>();
        Map<String, Person> m4 = new HashMap<>();
        Map<String, Person> m5 = new HashMap<>();
        Map<String, Person> m6 = new HashMap<>();
        m1.put(p1.getPersonLastName(), p1);
        m2.put(p2.getPersonLastName(), p2);
        m3.put(p3.getPersonLastName(), p3);
        m4.put(p4.getPersonLastName(), p4);
        m5.put(p5.getPersonLastName(), p5);
        m6.put(p6.getPersonLastName(), p6);


        List<Map<String, Person>> mapList = new ArrayList<>();
        mapList.add(m1);
        mapList.add(m2);
        mapList.add(m3);
        mapList.add(m4);
        mapList.add(m5);
        mapList.add(m6);

        System.out.println("Before Sorting:");
        for(int idx = 0; idx < mapList.size(); idx++){
            System.out.println(mapList.get(idx).keySet());
            System.out.println(mapList.get(idx).get(mapList.get(idx).keySet()));
        }

    }
}
