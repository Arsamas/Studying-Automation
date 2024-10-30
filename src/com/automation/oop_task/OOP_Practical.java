package com.automation.oop_task;
import com.automation.separate_package.*;
import java.util.Random;
import java.util.Arrays;



/*
In a separate figure package you need to create a class structure and implement the necessary methods.
There must be a base abstract class and its descendants.
All functions must be implemented.
In the Main class with the main method main, the task must be implemented.
Class Description:
Create a class structure for circle, square and triangle. Each of them should have the following fields (private) and methods (public)
- name
- coordinates
- function to get coordinates
- area calculation function
Task
The following items should be implemented in the main function:
- creating an array of random shapes with the size of 10 elements.
- sort the shapes by area (ASC/DESC - it doesn't matter)
- output the sorted array on the console in the form : Name, S=area
 */

public class OOP_Practical {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] circleArr = new int[4];
        int[] triangleArr = new int[6];
        int[] rectangleArr = new int[6];
        //Создаем двумерный массив для заполнения случайными числами: код фигуры и площадь фигуры
        double[][] arrayFigures = new double [2][10];
        //Заполняем массив
        for(int i = 0; i < arrayFigures[0].length; i++) {
            arrayFigures[0][i] = rand.nextInt(3);
            //если 0,0 - circle
            if (arrayFigures[0][i] == 0.0) {
                for (int k = 0; k < 4; k ++) {
                    circleArr[k] = rand.nextInt(10);
                }
                //Случайные координаты для цетра круга и точки на окружности
                Figure circle = new Circle("circle", circleArr[0], circleArr[1], circleArr[2], circleArr[3]);
                if (circle.areaCalculation() != 0.0) {
                    arrayFigures[1][i] = circle.areaCalculation();
                }
                //если 1,0 - triangle
            } else if (arrayFigures[0][i] == 1.0) {
                for (int q = 0; q < 6; q ++) {
                    triangleArr[q] = rand.nextInt(10);
                }
                //Случайные координаты для трех вершин треугольник (вырожденность не проверяю)
                Figure triangle = new Triangle("triangle", triangleArr[0], triangleArr[1], triangleArr[2], triangleArr[3], triangleArr[4], triangleArr[5]);
                if (triangle.areaCalculation() != 0.0) {
                    arrayFigures[1][i] = triangle.areaCalculation();
                }
                //если 1,0 - rectangle
            } else if (arrayFigures[0][i] == 2.0)   {
                for (int q = 0; q < 6; q ++) {
                    rectangleArr[q] = rand.nextInt(10);
                }
                //Случайные координаты для квадрата (проверки на правильность квадрата нет)
                Figure square = new Square("square", rectangleArr[0], rectangleArr[1], rectangleArr[2], rectangleArr[3], rectangleArr[4], rectangleArr[5]);
                if (square.areaCalculation() != 0.0) {
                    arrayFigures[1][i] = square.areaCalculation();
                }
            }
        }
        //Сортируем массив по площади (Desc), коды фигур должны соответствовать своим площадям
        double temp, auxil;
        // Здесь должна быть сортировка
        for(int i =0; i < arrayFigures[1].length; i++) {
            for (int j = i + 1; j < arrayFigures[1].length; j++) {
                if (arrayFigures[1][i] < arrayFigures[1][j]) {
                    temp = arrayFigures[1][i];
                    arrayFigures[1][i] = arrayFigures[1][j];
                    arrayFigures[1][j] = temp;
                    auxil = arrayFigures[0][i];
                    arrayFigures[0][i] = arrayFigures[0][j];
                    arrayFigures[0][j] = auxil;
                }
            }
        }

        //выводим массив на экран, заменяя код фигуры на название
        for (int i = 0; i < arrayFigures[0].length; i ++) {
            if (arrayFigures[0][i] == 0.0) {
                System.out.printf("Circle, S= %.2f",arrayFigures[1][i]);
            } else if (arrayFigures[0][i] == 1.0) {
                System.out.printf("Triangle, S=%.2f", arrayFigures[1][i]);
            } else if (arrayFigures[0][i] == 2.0) {
                System.out.printf("Square, S=%.2f", arrayFigures[1][i]);
            }
            System.out.println();
        }
    }
}

