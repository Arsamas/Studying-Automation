package com.automation.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.*;
import java.lang.String;
import java.util.Optional;


/*
Подсчет количества строк, начинающихся с буквы 'A'
У тебя есть список строк. Необходимо подсчитать, сколько строк начинаются с буквы "A", используя лямбда-выражение и метод filter и count.
 */




public class Task3FromAnya {
    public static void main(String[] args) {
        String str[] = new String[]
                {"lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed", "do", "eiusmod", "tempor",
                        "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua", "ut", "enim", "ad", "minim", "veniam", "quis",
                        "nostrud", "exercitation", "ullamco", "laboris", "nisi", "ut", "aliquip", "ex", "ea", "commodo", "consequat",
                        "duis", "aute", "irure", "dolor", "in", "reprehenderit", "in", "voluptate", "velit", "esse", "cillum", "dolore",
                        "eu", "fugiat", "nulla", "pariatur", "excepteur", "sint", "occaecat", "cupidatat", "non", "proident", "sunt", "in",
                        "culpa", "qui", "officia", "deserunt", "mollit", "anim", "id", "est", "laborum"
                };
        //Fill List by the values
        List<String> list = new ArrayList<>(Arrays.asList(str));


         long numberAString = list.stream()
                .filter((n) -> n.charAt(0) =='a')
                .count();

        System.out.println(numberAString);
    }
}
