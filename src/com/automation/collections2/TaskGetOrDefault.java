package com.automation.collections2;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
У тебя есть список товаров с их количеством на складе. Тебе нужно создать программу, которая по запросу выводит
количество товара на складе. Если товар не найден, вывести "Товар не найден".
Для поиска количества товара будем использовать метод getOrDefault, чтобы вернуть "Товар не найден", если товара нет на складе.
 */

public class TaskGetOrDefault {
    public static void main(String[] args) {
        Map<String, String> store = new HashMap<>();
        store.put("Apple" , "100");
        store.put("Banana" , "200");
        store.put("Orange" , "300");
        String name = "";

        System.out.println("Please, input the name of a fruit. We will check how many kilos are in-store: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            name = reader.readLine();
        }
        catch (IOException e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }

        System.out.println(store.getOrDefault(name, "Product not found"));


    }
}
