package com.automation.collections;
import java.util.*;
import java.util.List;



/*
Create a dictionary (Map<String, String>) and enter ten entries in it according to the principle "last name" - "first name".
Delete people who have the same names.
 */

public class CollectionsTask16 {
    public static void main(String[] args) {
        //Create a Map and fill with data
        Map<String, String> map = new HashMap<>();
        map.put("Moreno", "Mollie");
        map.put("Mooney", "Asiya");
        map.put("Myers", "Princess");
        map.put("Booker", "Lina");
        map.put("Levy", "Mollie");
        map.put("Bowman", "Lilia");
        map.put("Stevenson", "Siena");
        map.put("Buchanan", "Mollie");
        map.put("Solis", "Lorna");
        map.put("Sheppard", "Charlotte");
        System.out.println("Map before removing people with the same name");
        System.out.println();
        //Create a List for filling with keys contain the same values
        List<String> list = new ArrayList<>();
        //Create a List for filling with values from Map
        List<String> arr = new ArrayList<>(map.values());

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        for (String el : arr) {
            int i = 0;
            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                //Find duplicate
                if (entry.getValue().equals(el)) {
                    //Counter for control duplicate
                    i++;
                    //Each element inputs into List
                    list.add(entry.getKey());
                }
            }
            //If element is not duplicate, it will remove from List
            if (i == 1 ) list.removeLast();
        }
        //Turn List into Set to get Set with unique keys
        Set<String> set = new HashSet<>(list);
        //Remove elements from Map, if their keys were put into Set
        for (String key : set) {
            map.remove(key);
        }
        System.out.println();
        System.out.println();
        System.out.println("Map after removing people with the same name");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
