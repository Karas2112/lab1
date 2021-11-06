package com.company;

import devices.Car;
import devices.Phone;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Animal dog = new Animal("szczur");
        Animal cat = new Animal("felis");

        dog.name = "Poppy";
        dog.weight = 10.0;
        dog.age = 5;
        dog.alive = false;
        cat.name = "Cezary";
        cat.age = 19;

        cat.introduceYourself();

        System.out.println("waga kota: " + cat.weight);
        cat.doYouLike("mouse");

        Integer humanage = cat.getHumanAge();
        System.out.println("If I'll be human I'll be " + humanage + " years old");

        dog.introduceYourself();

        dog.doYouLike("mouse");

        Car pierdzikółko = new Car("Peugeot", "308SW", 123000., 5, 200000.);


        Phone MiA1 = new Phone();
        MiA1.display_size = 6.0;
        MiA1.model = "A1";
        MiA1.producer = "Xiaomi";
        MiA1.platform = "Android";
        MiA1.rom_memory = 64;

        Human me = new Human();
        me.firstName = "Bartosz";
        me.lastName = "Karaś";
        me.pet = cat;
        me.setSalary(30000.0);
        me.phone = MiA1;

        System.out.println("I have a " + me.pet.species);
        System.out.println("I call it  " + me.pet.name);
        me.setCar(pierdzikółko);

        if(me.getCar()!=null){
            System.out.println(me.getCar().model);
        }
        System.out.println(cat);
        System.out.println("I have a car, which is " + me.getCar().producer + " " + me.getCar().model);
        System.out.println("It has " + me.getCar().doorsQuantity + " doors and I was driving it for the last " + me.getCar().mileage + "km");
        System.out.println(me.pet.weight);
        me.pet.feed();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(me.phone);

    }

}