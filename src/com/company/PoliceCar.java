package com.company;

// inheritance: class Derived extends Base
public class PoliceCar extends Car {
    private float soundVolume;

    PoliceCar() { }
    PoliceCar(String m, String c, int cs, int ms, float v) {
        super(m, c, cs, ms); // invoke base class constructor
        soundVolume = v;
    }

    public void Beep() {
        System.out.println("Beep...beep...beeeeep!!!");
    }
    public void Chase() {
        Beep();
        System.out.println("Stop!!! Ruki vverh!");
        Beep();
    }

    public void ShowInfo() {
        super.ShowInfo(); // invoke base class method
        System.out.println("Volume: " + soundVolume);
    }
}
