package com.automation.figures;
import java.lang.Math;

public class Circle extends Figures {
    private double x1, y1;

    //constructor with additional parameters
    public Circle (String name, double x, double y, double x1, double y1) {
        super(name, x, y);
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getX1() {
        return this.x1;
    }

    public double getY1() {
        return this.y1;
    }

    //overriding calculating method according to the formula of circle area
    @Override
    public double areaCalculation() {
        double result = Math.sqrt(Math.pow((getX1() - getX()), 2) + Math.pow((getY1() - getY()), 2));
        return Math.PI*result*result;
    }
}
