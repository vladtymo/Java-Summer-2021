package com.company;

import java.util.ArrayList;

public class Parrot extends Animal implements IFlyable {
    private double flyHeight;
    private ArrayList<String> phrases;

    Parrot(String name, double maxHeight) {
        super(name);
        flyHeight = maxHeight;
        phrases = new ArrayList<String>();
        phrases.add("Java-java");
        phrases.add("Hello-hi");
    }

    @Override
    public void Say() {
        for (String p: phrases) {
            System.out.println(p);
        }
    }

    @Override
    public void Fly() {
        System.out.println("Parrot is flying in a " + flyHeight + "m of height");
    }

    @Override
    public void Lend() {
        System.out.println("Parrot is Lending...");
    }
}

