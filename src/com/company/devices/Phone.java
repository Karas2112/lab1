package com.company.devices;

public class Phone extends Device {
    public Double screen_size;

    public String os;
    public Integer rom_memory;

    public Phone(String producer, String model, Integer yearOfProduction, Double value, String os, Double screen_size, Integer rom_memory) {
        super(producer, model, yearOfProduction);

    }

    public String toString() {
        return producer + " " + model + " " + os + " " + screen_size + " " + rom_memory + "GB";
    }

    @Override
    public void turnOn() {
        System.out.println("Włącz telefon");
    }

}