package com.company;

public class Frog extends Animal {
    private double jumpLength;

    Frog(String name, double jumpLength) {
        super(name);
        this.jumpLength = jumpLength;
    }

    @Override
    public void Say() {
        System.out.println("Kva-kva-kvaaaaaa!!!");
    }
}