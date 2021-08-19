package com.company;

public class Car {
    // properties
    private int maxSpeed;
    private int currentSpeed;
    protected String color;
    protected String model;

    {
        model = "no model";
        color = "no color";
    }
    Car() { }
    Car(String m, String c, int cs, int ms) {
        model = m;
        color = c;
        maxSpeed = ms >= 0 ? ms : 0;
        if (cs < 0) currentSpeed = 0;
        else if (cs > maxSpeed) currentSpeed = maxSpeed;
        else currentSpeed = cs;
    }

    // methods
    public void Boost(int value) {
        currentSpeed = (currentSpeed + value <= maxSpeed ? currentSpeed + value : maxSpeed);
//        if (currentSpeed + value <= maxSpeed)
//            currentSpeed += value;
//        else
//            currentSpeed = maxSpeed;
    }
    public void Drive() {
        System.out.println("The " + model + " is driving with speed of " + currentSpeed + "km/h");
    }
    public void ShowInfo() {
        System.out.println("::::::: " + model + " :::::::");
        System.out.println("Color: " + color);
        System.out.println("Speed: " + currentSpeed + " ... " + maxSpeed + "km/h");
    }
}
