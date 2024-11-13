package com.automation.transportation;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car (String licenseNumber, String brand, String model, int year, int numberOfDoors) {
        super(licenseNumber, brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }


    @Override
    public void displayInfo() {
        System.out.println("License Number: " + getNumber() + ", Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ", Number of doors: " + getNumberOfDoors());
    }
}
