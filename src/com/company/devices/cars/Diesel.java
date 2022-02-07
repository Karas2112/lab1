package com.company.devices.cars;

import com.company.devices.Car;

public class Diesel extends Car {
    public Diesel(String producer, String model, Double mileage, Integer doorsQuantity, Double value, Integer yearOfProduction) {
        super(producer, model, mileage, doorsQuantity, value, yearOfProduction);
    }

    @Override
    public void refuel() {

    }

}
