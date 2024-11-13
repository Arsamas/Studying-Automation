package com.automation.transportation;
import java.util.ArrayList;
import java.util.List;


public class ParkingLot {
    private List<Vehicle> listVehicle;

    public ParkingLot() {
        this.listVehicle = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        listVehicle.add(vehicle);
    }

    public void displayList() {
        for(Vehicle elem : listVehicle) {
            elem.displayInfo();
        }
    }
}
