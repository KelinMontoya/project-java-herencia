package com.myorg.vehiculos;

public class Motorcycle extends Vehicle {
    private boolean hasFairing;

    public Motorcycle(String brand, String model, int year, boolean hasFairing, Engine engine) {
        super(brand, model, year, engine);
        this.hasFairing = hasFairing;
    }

    @Override
    public void start() {
        System.out.println("La moto está arrancando con motor: " + engine.getType());
    }

    @Override
    public String getDescription() {
        return String.format("Moto: %s %s (%d) - Sidecar/carenado: %s - Motor: %s",
                brand, model, year, hasFairing ? "sí" : "no", engine);
    }

    public void doWheelie() {
        System.out.println("La moto está haciendo un caballito!");
    }

    public void showFairing() {
        System.out.println("La moto tiene carenado: " + (hasFairing ? "sí" : "no"));
    }
}
