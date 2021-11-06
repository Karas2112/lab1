package com.company.devices;

public class Car extends Device{

    public Car(String producer, String model, Double mileage, Integer doorsQuantity, Double value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.mileage = mileage;
        this.doorsQuantity = doorsQuantity;
        this.value = value;
    }

    public String toString() {
        return producer + " " + model + " " + mileage + " " + doorsQuantity + " " + value+ " " + yearOfProduction;
    }

    public Integer doorsQuantity;
    public Double mileage;
}