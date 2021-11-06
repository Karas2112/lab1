package com.company.devices;

public abstract class Device {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;
    public Double value;


    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return "Producer: " + this.producer + " model: " + this.model + " Year of production: " + this.yearOfProduction;
    }

    abstract public void turnOn();

    ;
}