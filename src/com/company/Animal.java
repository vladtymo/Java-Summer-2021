package com.company;

// abstract - class that contains at least one abstract method
public abstract class Animal {
    String name;

    Animal(String n) {
        name = n;
    }

    public void Move() {
        System.out.println("I am moving...");
    }
    public abstract void Say();
    public String GetName() { return name; }
}