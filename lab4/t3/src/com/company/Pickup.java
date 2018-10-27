package com.company;

public class Pickup implements CargoAuto, PassangersAuto {
    public void Cargo() {
        System.out.println("Везу груз");
    }

    public void Passangers() {
        System.out.println("Везу пассажиров");
    }
}
