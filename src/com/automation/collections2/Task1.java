package com.automation.collections2;
import java.util.HashMap;
import java.util.Map;


/*
Задача 1: Подсчет повторяющихся слов в тексте
Условие: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>, где ключом является слово,
а значением — количество его повторений в тексте.
Метод должен игнорировать регистр букв, то есть слова "Java" и "java" считаются одинаковыми.
Удалите знаки препинания и лишние пробелы.
Выведите только слова, которые встречаются более одного раза.
Подсказка: Используйте методы класса String для обработки текста и Map<String, Integer> для хранения слов и их частот.
Пример:
String text = "Java is a programming language. Java is used for many applications.";
Результат:
{java=2, is=2}
Решение:
Разбейте строку на слова, используя метод split.
Пройдите по каждому слову и приведите его к нижнему регистру.
Сохраните частоту слов в Map.
Верните только те слова, у которых значение больше 1.
 */

public class Task1 {
    public static void main(String[] args) {
        //We input the string
        String str = "Java is a programming language. Java is used for many applications.";

        System.out.println(convertString(str));
    }

    public static Map<String, Integer> convertString(String str) {
        Map<String, Integer> map = new HashMap<>();
        //Put all words in a low case
        String string = str.toLowerCase();
        //Pattern do delete ,/./space from array
        String regex = "[\\,. ]+";
        //Split String to separate elements using pattern conditions
        String[] list = string.split(regex);

        for (String el : list) {
            //Counter of duplicates
            int count = 0;
            for (String elem: list) {
                if (el.equals(elem)) {
                    count++;
                }
                //add pairs in the Map
                if (count > 1) map.put(el, count);
            }
        }
        return map;
    }
}
