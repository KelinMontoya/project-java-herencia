package com.myorg.vehiculos;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine("Gasolina", 150);
        Engine e2 = new Engine("Gasolina", 80);

        Vehicle v1 = new Car("Toyota", "Corolla", 2020, 4, e1);
        Vehicle v2 = new Motorcycle("Yamaha", "MT-03", 2019, false, e2);

        System.out.println(v1.getDescription());
        v1.start();
        v1.stop();

        System.out.println();

        System.out.println(v2.getDescription());
        v2.start();
        v2.stop();

        if (v1 instanceof Car) {
            ((Car) v1).openTrunk();
            ((Car) v1).showDoors();
        }
        if (v2 instanceof Motorcycle) {
            ((Motorcycle) v2).doWheelie();
            ((Motorcycle) v2).showFairing();
        }
    }
}
