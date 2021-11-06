package com.company.devices;

import com.company.Human;

public class Phone extends Device {
    public Double screen_size;

    public String os;
    public Integer rom_memory;

    public Phone(String producer, String model, Integer yearOfProduction, Double value, String os, Double screen_size, Integer rom_memory) {
        super(producer, model, yearOfProduction);

    }

    public String toString() {
        return producer + " " + model;
    }

    @Override
    public void turnOn() {
        System.out.println("Włącz telefon");
    }


    public void sell(Human seller, Human buyer, Double price) {
        if(buyer.cash<price){
            System.out.println("kupujący ma za mało kasy");
        }
        else if(seller.getPhone()== null){
            System.out.println("Sprzedajacy nie ma żadnego telefonu");
        }
        else if(!seller.getPhone().equals(this)){
            System.out.println("sprzedający nie ma tego konkretnego telefonu (złodziej? XD)");
        }
        else {
            seller.cash +=price;
            buyer.cash -=price;
            seller.phone = null;
            buyer.phone = this;
            System.out.println("Transakcja przebiegła pomyślnie, kupiono "+this);
        }
    }
}