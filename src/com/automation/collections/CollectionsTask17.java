package com.automation.collections;
import java.util.*;

/*
1. Create a Map dictionary (<String, String>) and add 10 people to it in the form "LastName"-"FirstName".
2. Let there be people with the same first name among these 10 people.
3. Let there be people with the same last names among these 10 people. Note the number of entries in the resulting collection.
4. Display the contents of the Map on the screen.
 */

public class CollectionsTask17 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //Fill the Map with ten pairs. First name "Mollie" has duplicate. Last Name "Sheppard" has duplicate
        map.put("Moreno", "Mollie");
        map.put("Mooney", "Asiya");
        map.put("Myers", "Princess");
        map.put("Sheppard", "Lina");
        map.put("Levy", "Mollie");
        map.put("Bowman", "Lilia");
        map.put("Stevenson", "Siena");
        map.put("Buchanan", "Mollie");
        map.put("Solis", "Lorna");
        map.put("Sheppard", "Charlotte");
        int i = 0;
        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            i++;
            System.out.println("key: " + key + " Value: " + map.get(key));
        }
        System.out.println("Map has " + i + " pairs");
    }
}
