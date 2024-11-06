package com.automation.oop_task2;

public class Bird extends Animals{

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public double foodCalculation() {
        return (getWeight()*0.02)*1000;
    }
}

