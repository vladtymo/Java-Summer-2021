package com.company;

public class SportCar extends Car {
    private short nitro;

    SportCar() { }
    SportCar(String m, String c, int cs, int ms, short n) {
        super(m, c, cs, ms);
        nitro = n;
    }

    public void SuperBoost(int value) {
        super.Boost(value * nitro);
    }

    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Nitro: " + nitro);
    }
}
