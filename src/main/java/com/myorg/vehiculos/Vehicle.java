package com.myorg.vehiculos;

public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected Engine engine;

    public Engine getEngine() { return engine; }

    public Vehicle(String brand, String model, int year, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    public String getDescription() {
        return brand + " " + model + " (" + year + ")";
    }

    public void start() {
        System.out.println("El vehículo está arrancando.");
    }

    public void stop() {
        System.out.println("El vehículo se ha detenido.");
    }
    public void showBrand() {
    System.out.println("Marca: " + brand);
}
}
