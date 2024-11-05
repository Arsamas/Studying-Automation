package com.automation.separate_package;
import java.lang.Math;

public class Circle extends Figure {
    private String name;
    private double x, y, x2, y2;

    public Circle(String name, double x, double y, double x2, double y2) {
        super(name, x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX2() {
        return x2;
    }
    public double getY2() {
        return y2;
    }

    @Override
    public double areaCalculation() {
        double result = Math.sqrt(Math.pow((getX2() - getX()), 2) + Math.pow((getY2() - getY()), 2));
        return Math.PI * result * result;
    }
}
