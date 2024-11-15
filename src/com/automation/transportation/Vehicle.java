package com.automation.transportation;


public class Vehicle {
    private String licenseNumber;
    private String brand;
    private String model;
    private int year;

    public Vehicle (String licenseNumber, String brand, String model, int year) {
        this.licenseNumber = licenseNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getNumber() {
        return this.licenseNumber;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void displayInfo() {
        System.out.println("License Number: " + licenseNumber + ", Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}
