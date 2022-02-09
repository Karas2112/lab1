package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;
import creatures.Animal;

import java.util.Date;

public class Human extends Animal {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    public Car[] garage;
    public Phone phone;
    public double cash;

    public Human() {
        super("homo sapiens");
        this.salary = 1200.0;
    }

    void setSalary(Double salary) {
        if (salary >= 0) {
            System.out.println("nowe dane zostały wyłane do systemu księgowego");
            System.out.println("Koniecznie odbierz aneks od umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać");
            this.salary = salary;

        } else {
            System.out.println("Nie można przypisać ujemnej wartości do wypłaty");
        }

    }

    Double getSalary() {
        System.out.println(new Date());
        System.out.println("wynagrodzenie: " + this.salary);

        return this.salary;
    }

    void setCar(Car newCar) {
        if (this.salary > newCar.value) {
            System.out.println("Udało sie kupic auto za gotówkę");
            this.garage[0] = newCar;
        } else if (this.salary >= newCar.value / 12) {
            System.out.println("Udało sie kupic auto na kredyt");
            this.garage[0] = newCar;
        } else {
            System.out.println("lol biedak");
        }

    }

    public Car getCar() {
        return this.garage[0];
    }

    public Phone getPhone() {
        return this.phone;
    }

    public String toString() {
        return firstName + " " + lastName + " " + age + " " + salary + " " + pet + " " + garage[0];
    }


    @Override
    public void feed(Double foodWeight) {

    }
}
