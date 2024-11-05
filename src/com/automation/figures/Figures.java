package com.automation.figures;

public abstract class Figures {
    private String name;
    private double x, y;

    //Creating constructor with main parameters: name and coordinates, plus area for further sorting
    public Figures(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
        areaCalculation();
    }

    //name getter
    String getName() {
        return this.name;
    }

    //x coordinate getter
    public double getX() {
        return this.x;
    }

    //y coordinate getter
    public double getY() {
        return this.y;
    }

    //overriding toString method for displaying name and area
    @Override
    public String toString() {
        return getName() + ",  S = " + areaCalculation();
    }

    //abstract method for calculating area of a figure
    abstract public double areaCalculation() ;
}

