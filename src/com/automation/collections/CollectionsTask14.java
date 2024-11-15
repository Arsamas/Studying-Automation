package com.automation.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


/*
Create a dictionary (Map<String, String>) with ten entries according to the principle "Last Name" - "First Name".
Check how many people have the same first or last name as the given one.
 */

public class CollectionsTask14 {
    public static void main(String[] args) {
        //Create Map dictionary
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
        //Output created Map
        System.out.println("Map dictionary: ");
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        //Given First Name and Second Name for searching as samples
        String keyLast = "Solis";
        String valueFirst = "Mollie";
        //Create counters
        int numLast = 0;
        int numFirst = 0;
        //Create flag for the case whether nothing matches
        boolean flagName = false;
        boolean flagLast = false;

        //Create iterator for iteration of the Map
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            //Check if Last Name matches. If so, counters summarize meeting times
            if (key.equals(keyLast)) numLast++;
            String value = pair.getValue();
            //Check if Last Name matches. If so, counters summarize meeting times
            if (value.equals(valueFirst)) numFirst++;
        }

        //Output the result if map dictionary contains the same name and surname as templates
        if (numLast > 0) {
            System.out.println("Last Name " + keyLast + " meets " + numLast + " times");
            flagLast = true;
        }
        if (numFirst > 0) {
            System.out.println("First Name " + valueFirst + " meets " + numFirst + " times");
            flagName = true;
        }

        //Output if nothing matched
        if (!flagLast && !flagName) {
            System.out.println("Map doesn't contain the same First Name: " + keyLast + " or Last Name: " + valueFirst);
        }
    }
}
