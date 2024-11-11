package com.automation.collections;
import java.util.*;

public class CollectionsTask16Version2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Moreno", "Mollie");
        map.put("Mooney", "Siena");
        map.put("Myers", "Mollie");
        map.put("Booker", "Lina");
        map.put("Levy", "Mollie");
        map.put("Bowman", "Lilia");
        map.put("Stevenson", "Siena");
        map.put("Buchanan", "Mollie");
        map.put("Solis", "Lorna");
        map.put("Sheppard", "Charlotte");
        System.out.println("Map before removing");
        System.out.println();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        //Set for unique names
        Set<String> names = new HashSet<>();
        //Set with duplicate names for removing
        Set<String> duplicateNames = new HashSet<>();

        //Compare names
        for(String name : map.values()) {
            //If name contains in the Set of existing name, so it is duplicate
            if (names.contains(name)) {
                //Add name to the Set of duplicates
                duplicateNames.add(name);
            } else {
                //Add name to the Set of the unique names
                names.add(name);
            }
        }

        //Remove element with duplicate names
        map.values().removeAll(duplicateNames);

        System.out.println("Map after removing");
        System.out.println();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

