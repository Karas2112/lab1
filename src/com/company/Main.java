package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;
import creatures.Animal;
import creatures.Pet;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Animal dog = new Pet("szczur");
        Animal cat = new Pet("felis");

        cat.setName("Cezary");
        dog.setName("Poppy");
        cat.setAge(20);
        dog.setAge(7);

        cat.introduceYourself();

        System.out.println("waga kota: " + cat.getWeight());
        cat.doYouLike("mouse");

        Integer humanage = cat.getHumanAge();
        System.out.println("If I'll be human I'll be " + humanage + " years old");

        dog.introduceYourself();

        dog.doYouLike("mouse");

        Car pierdzikółko = new Car("Peugeot", "308SW", 123000., 5, 50000., 2013);

        Phone MiA1 = new Phone("Xiaomi", "A1", 2019, 800., "Android", 6., 64);

        Human me = new Human();
        me.firstName = "Bartosz";
        me.lastName = "Karaś";
        me.pet = cat;
        me.setSalary(30000.0);
        me.cash=50000.;
        me.phone=MiA1;

        System.out.println("I have a " + me.pet.getSpecies());
        System.out.println("I call it  " + me.pet.getName());
        me.setCar(pierdzikółko);

        if (me.getCar() != null) {
            System.out.println(me.getCar().model);
        }
        System.out.println(cat);
        System.out.println("I have a car, which is " + me.getCar().producer + " " + me.getCar().model);
        System.out.println("It has " + me.getCar().doorsQuantity + " doors and I was driving it for the last " + me.getCar().mileage + "km");
        System.out.println(me.pet.getWeight());
        me.pet.feed();
        System.out.println(me.pet.getWeight());
        me.pet.takeForAWalk();
        System.out.println(me.pet.getWeight());
        me.pet.takeForAWalk();
        System.out.println(me.pet.getWeight());
        me.pet.takeForAWalk();
        System.out.println(me.pet.getWeight());
        me.pet.takeForAWalk();
        System.out.println(me.pet.getWeight());
        me.pet.takeForAWalk();
        System.out.println(me.pet.getWeight());
        me.pet.takeForAWalk();
        System.out.println(me.pet.getWeight());
        me.pet.takeForAWalk();
        System.out.println(me.pet.getWeight());
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        System.out.println(dog);
        System.out.println(cat);


        Human brotherInLaw = new Human();

        brotherInLaw.cash=50000;

        pierdzikółko.sell(me, brotherInLaw, 30000.);

        MiA1.sell(me,brotherInLaw,500.);

        System.out.println((dog.getWeight()));
        dog.feed(2.);
        System.out.println((dog.getWeight()));
    }

}
