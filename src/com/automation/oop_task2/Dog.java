package com.automation.oop_task2;

public class Dog extends Animals{

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public double foodCalculation() {
        return (getWeight()*0.03)*1000;
    }
}
