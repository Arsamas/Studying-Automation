package com.automation.figures;
import java.util.Random;
import java.util.Arrays;
import java.io.IOException;
import java.util.Comparator;



public class Main {
    public static void main(String[] args) throws IOException{
        Random rand = new Random();
        //Creating new objects array
        Figures [] figures = new Figures[10];
        //Filling up array by name of a figure and coordinates
        for (int i = 0; i < 10; i++) {
            //Random code of the figure
            int bid = rand.nextInt(3);
            switch (bid) {
                case 0:
                    //Creating Circle object if code = 0
                    figures[i] = new Circle("Circle", rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
                    break;
                case 1:
                    //Creating Triangle object if code = 1
                    figures[i] = new Triangle("Triangle", rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
                    break;
                case 2:
                    //Creating //Creating Square object if code = 2
                    figures[i] = new Square("Square", rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
                    break;
            }
        }
        //Sorting object array using Comparator
        Arrays.sort(figures, Comparator.comparing(Figures::areaCalculation));

        //Displaying sorting array using toString functionality
        for (int i = 0; i < 10; i++) {
            System.out.println(figures[i]);
        }
    }
}








