package com.automation.figures;
import java.lang.Math;

public class Square extends Figures {
    private double x1, y1, x2, y2;

    //constructor with additional parameters
    public Square (String name, double x, double y, double x1, double y1, double x2, double y2) {
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

    //overriding calculating method according to the formula of square area
    @Override
    public double areaCalculation() {
        double length = Math.sqrt(Math.pow((getX1() - getX()), 2) + Math.pow((getY1() - getY()), 2));
        double width = Math.sqrt(Math.pow((getX2() - getX()), 2) + Math.pow((getY2() - getY()), 2));
        return length * width;
    }
}
