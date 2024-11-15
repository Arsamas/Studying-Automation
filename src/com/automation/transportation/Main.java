package com.automation.transportation;
/*
Задача для суперкласса
Создай систему для хранения и вывода информации о транспортных средствах на парковке. Каждое транспортное средство имеет общий набор
характеристик (например, номер, марка, модель и т. д.), но есть различия в атрибутах для разных видов транспорта (автомобили, мотоциклы).
Подсказки для реализации:
Создай класс Vehicle (суперкласс):
Поля: licenseNumber (номер), brand (марка), model (модель), year (год выпуска).
Методы: displayInfo(), который выводит основную информацию о транспортном средстве.
Создайте классы-наследники: Car и Motorcycle:
Каждый из них наследует поля и методы класса Vehicle.
Дополни их специфичными полями: например, Car может иметь поле numberOfDoors, а Motorcycle — type (например, спортивный или кроссовый).
Переопредели метод displayInfo(), чтобы добавить вывод дополнительной информации для конкретного типа транспортного средства.
В классе ParkingLot создайте метод для хранения и отображения всех транспортных средств:
 */



public class Main {
    public static void main(String[] args) {
        //Create object for storing and displaying of the vehicles
        ParkingLot parkingLot = new ParkingLot();
        //Create objects Car and Motorcycle
        Vehicle subaru = new Car("ХА 2210 СА", "Subaru", "Forester", 2015, 4);
        Vehicle kawasaki = new Motorcycle ("ХА 2211 СА", "Kawasaki", "Enduro", 2015, "Sport");
        //Display information about objects.
        subaru.displayInfo();
        kawasaki.displayInfo();
        //Add objects to the parkingLot store
        parkingLot.addVehicle(subaru);
        parkingLot.addVehicle(kawasaki);
        //Display information about objects
        parkingLot.displayList();
    }
}

