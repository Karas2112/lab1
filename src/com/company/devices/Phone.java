package com.company.devices;

import com.company.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {
    static final String DEFAULT_APP_NAME = "DEFAULT_APP_NAME";
    static final String DEFAULT_SERVER_NAME = "wsb.pl";
    static final Integer DEFAULT_PORT = 443;
    static final String DEFAULT_PROTOCOL = "https";
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
        if (buyer.cash < price) {
            System.out.println("kupujący ma za mało kasy");
        } else if (seller.getPhone() == null) {
            System.out.println("Sprzedajacy nie ma żadnego telefonu");
        } else if (!seller.getPhone().equals(this)) {
            System.out.println("sprzedający nie ma tego konkretnego telefonu (złodziej? XD)");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.phone = null;
            buyer.phone = this;
            System.out.println("Transakcja przebiegła pomyślnie, kupiono " + this);
        }
    }


    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_APP_NAME);
    }

    public void installAnApp(String appName, String version) {
        System.out.println("Instalowanie aplikacji " + appName + " w wersji " + version);
        this.installAnApp(appName, version, DEFAULT_SERVER_NAME);
    }

    public void installAnApp(String appName, String version, String server) {
        System.out.println("Instalowanie aplikacji " + appName + " w wersji " + version + " z " + server);
        try {
            URL url = new URL("https", "wsb.pl", 443, appName + " w wersji " + version);
            this.installAnApp(url);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL url) {

        System.out.println("Instalowanie aplikacji...");
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames){

        }
    }


}