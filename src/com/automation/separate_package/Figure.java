package com.automation.separate_package;
import java.lang.Math;

public abstract class Figure {
    private String name;
    private double x, y;

    public Figure(String name, double x, double y) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    /*public String getName() {
        return name;
    }*/

    public abstract double areaCalculation();
}





