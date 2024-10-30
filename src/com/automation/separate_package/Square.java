package com.automation.separate_package;
import java.lang.Math;

public class Square extends Figure {
    private String name;
    private double x, y, x2, y2, x3, y3;

    public Square(String name, double x, double y, double x2, double y2, double x3, double y3) {
        super(name, x, y);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double getX2() {
        return x2;
    }
    public double getY2() {
        return y2;
    }
    public double getX3() {
        return x3;
    }
    public double getY3() {
        return y3;
    }


    @Override
    public double areaCalculation() {
        double length = Math.sqrt(Math.pow((getX2() - getX()), 2) + Math.pow((getY2() - getY()), 2));
        double width = Math.sqrt(Math.pow((getX3() - getX()), 2) + Math.pow((getY3() - getY()), 2));
        return length * width;
    }
}
