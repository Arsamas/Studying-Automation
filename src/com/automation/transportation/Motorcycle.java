package com.automation.transportation;

public class Motorcycle extends Vehicle{
    private String type;

    public Motorcycle (String licenseNumber, String brand, String model, int year, String type) {
        super(licenseNumber, brand, model,year);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void displayInfo() {
        System.out.println("License Number: " + getNumber() + ", Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ", Type: " + getType());
    }
}
