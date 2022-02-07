package com.company.devices.cars;

import com.company.devices.Car;

public class LPG extends Car {
    public LPG(String producer, String model, Double mileage, Integer doorsQuantity, Double value, Integer yearOfProduction) {
        super(producer, model, mileage, doorsQuantity, value, yearOfProduction);
    }

    @Override
    public void refuel() {

    }

}
