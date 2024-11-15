package com.automation.collections;
import java.util.Map;
import java.util.HashMap;
import  java.time.LocalDate;
import java.util.Iterator;

/*
Create a dictionary (Map<String, LocalDate>) and enter ten entries into it according to the principle: "last name" - "date of birth".
Remove all people born in summer from the dictionary.
 */



public class CollectionsTask15 {
    public static void main(String[] args) {
        //Create Map with requirements attributes
        Map<String, LocalDate> map = new HashMap<>();
        //Fill Map
        map.put("Moreno", LocalDate.of(2000, 1, 1));
        map.put("Mooney", LocalDate.of(2000, 2, 2));
        map.put("Myers", LocalDate.of(2000, 3, 3));
        map.put("Booker", LocalDate.of(2000, 4, 4));
        map.put("Levy", LocalDate.of(2000, 5, 5));
        map.put("Bowman", LocalDate.of(2000, 6, 6));
        map.put("Stevenson", LocalDate.of(2000, 7, 7));
        map.put("Buchanan", LocalDate.of(2000, 8, 8));
        map.put("Solis", LocalDate.of(2000, 9, 9));
        map.put("Sheppard", LocalDate.of(2000, 10, 10));
        //Create iterator for iteration
        Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, LocalDate> pair = iterator.next();
            //Define the Value
            LocalDate value = pair.getValue();
            //Check if users have birthday in summer
            if (value.getMonthValue() == 6 || value.getMonthValue() == 7 || value.getMonthValue() == 8){
            //Remove user by using iterator
                iterator.remove();
            }
        }

        //Output Map without removed users
        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

