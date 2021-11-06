package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public class Car extends Device implements Saleable {

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

    @Override
    public void turnOn() {
        System.out.println("Włącz telefon");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}