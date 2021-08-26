package com.company;

public class Duck extends Animal implements IFlyable{
    private double flyHeight;

    Duck(String name, double maxHeight) {
        super(name);
        flyHeight = maxHeight;
    }

    @Override
    public void Say() {
        System.out.println("Krya-krya-kryyyyyyyyaaa!");
    }

    @Override
    public void Fly() {
        System.out.println("Dusk is flying in a " + flyHeight + "m of height");
    }

    @Override
    public void Lend() {
        System.out.println("Duck is Lending...");
    }
}
