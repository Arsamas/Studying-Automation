package com.automation.figures;
import java.lang.Math;

public class Triangle extends Figures {
    private double x1, y1, x2, y2;

    //constructor with additional parameters
    public Triangle (String name, double x, double y, double x1, double y1, double x2, double y2) {
        super(name, x, y);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return this.x1;
    }

    public double getY1() {
        return this.y1;
    }

    public double getX2() {
        return this.x2;
    }

    public double getY2() {
        return this.y2;
    }

    //overriding calculating method according to the formula of triangle area
    @Override
    public double areaCalculation() {
        double result = Math.abs(getX() * (getY1() - getY2()) + getX1() * (getY2() - getY()) + getX2() * (getY() - getY1()));
        return result * 0.5;
    }
}
