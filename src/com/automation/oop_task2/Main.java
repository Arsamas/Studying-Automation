package com.automation.oop_task2;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;

/*
Animal Class Structure
Class Description:
Create a class structure for different types of animals: Dog, Cat, and Bird. Each animal should have the following fields (private)
and methods (public):
name (String)
age (int)
weight (double)
Method to get the name of the animal (returns name)
Method to get the age of the animal (returns age)
Method to calculate the approximate food requirement based on weight (for example, return weight * 0.03 for dogs and cats, and weight * 0.02 for birds).
Task Implementation in the Main Class:
Create an array of random animals with a size of 10 elements. Each element should be a random instance of either Dog, Cat, or Bird.
Sort the animals by their age (ASC or DESC - it doesn't matter).
Output the sorted array to the console in the format: Name: [name], Age: [age], Weight: [weight].
 */

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        //Create array
        Animals[] arrAnimals = new  Animals[10];
        //Fill array with random name, age and weight
        for (int i = 0; i < 10; i++) {
            int bid = rand.nextInt(3);
            switch (bid) {
                case 0:
                    //Dog object
                    arrAnimals[i] = new Dog ("Dog", rand.nextInt(1,20), rand.nextDouble(1.00,15));
                    break;
                case 1:
                    //Cat object
                    arrAnimals[i] = new Cat ("Cat", rand.nextInt(1, 20), rand.nextDouble(0.700,5));
                    break;
                case 2:
                    //Bird object
                    arrAnimals[i] = new Bird ("Bird", rand.nextInt(1,20), rand.nextDouble(0.5, 1.5));
                    break;
            }
        }
        System.out.println("Array before sorting");
        for (Animals el: arrAnimals) System.out.println(el);
        Arrays.sort(arrAnimals, Comparator.comparing(Animals::getAge));
        System.out.println();
        System.out.println("Array after sorting by age");
        for (Animals el: arrAnimals) System.out.printf(el + ".  Daily portion is:  %.3f%n",el.foodCalculation());

    }
}
