package com.automation.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

/*
Задача 2: Преобразование строк в их длины
У тебя есть список строк. Необходимо создать программу, которая преобразует каждую строку в ее длину, используя лямбда-выражение и метод map.
 */

public class Task2FromAnya {
    public static void main(String[] args) {
        String [] str= new String[] {"alpha","beta", "epsilon", "mu", "tau", "lambda", "delta", "iota", "omega", "xi"};
        List<String> list = new ArrayList<>(Arrays.asList(str));

        Stream<Integer> myStream = list.stream().map((n) -> n.length());

        myStream.forEach(elem -> System.out.print(" " + elem));

    }
}
