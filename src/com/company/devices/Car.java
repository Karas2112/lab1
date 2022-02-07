package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public abstract class Car extends Device implements Saleable {

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
        System.out.println("przekręcam kluczyk");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(buyer.cash<price){
            System.out.println("kupujący ma za mało kasy");
        }
        else if(seller.getCar()== null){
            System.out.println("Sprzedajacy nie ma żadnego auta");
        }
        else if(!seller.getCar().equals(this)){
            System.out.println("sprzedający nie ma tego konkretnego auta (złodziej? XD)");
        }
        else {
            seller.cash +=price;
            buyer.cash -=price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Transakcja przebieła pomyślnie, kupiono "+this);
        }
    }
    public abstract void refuel();
}