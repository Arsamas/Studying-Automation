package com.automation.streams;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.Arrays;
import java.util.Iterator;

/*
Задача 1: Фильтрация четных чисел
У тебя есть список чисел. Необходимо создать программу, которая выводит все четные числа из
списка, используя лямбда-выражение и метод filter.
 */

public class Task1FromAnya {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(10);
        //Fill the array by the random values
        Random rand = new Random(20);
        for (int i = 0; i < 10; i ++) {
            arr.add(rand.nextInt(0, 101));
        }
        //Filter only even numbers
        Stream<Integer> myStream = arr.stream().filter((n) -> n % 2 == 0);
        //Output the result
        myStream.forEach(System.out::println);
    }
}
