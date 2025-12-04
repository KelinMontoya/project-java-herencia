package com.myorg.vehiculos;

public class Engine {
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void showSpecs() {
    System.out.println("Motor tipo " + type + " con " + horsepower + " HP");
}

    @Override
    public String toString() {
        return type + " " + horsepower + "HP";
    }
}
