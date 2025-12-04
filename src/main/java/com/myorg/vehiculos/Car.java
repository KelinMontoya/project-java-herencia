package com.myorg.vehiculos;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, String model, int year, int doors, Engine engine) {
        super(brand, model, year, engine);
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("El carro está arrancando con motor: " + engine.getType());
    }

    @Override
    public String getDescription() {
        return String.format("Coche: %s %s (%d) - %d puertas - Motor: %s",
                brand, model, year, doors, engine);
    }

    public void openTrunk() {
        System.out.println("Abriendo el baúl del carro.");
    }

    public void showDoors() {
        System.out.println("El carro tiene " + doors + " puertas.");
    }
}
