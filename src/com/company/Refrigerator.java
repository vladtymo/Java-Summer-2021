package com.company;

public class Refrigerator {

    // properties (fields)
    // OOP access modifiers:
    //  * private - can access only from class scope
    //  * public - can access from anywhere
    //  * default - can access from anywhere in this package
    private String model;
    private float height, width, length;
    private int minT, maxT;
    private int currentT;
    private float powerUsage;
    private boolean isON; // ON - true, OFF - false

    // static field - create single instance
    private static String type = "Household appliance";
    private static int count = 0;

    // initializer scope
    {
        height = width = length = 1;
        ++count;
    }
    // methods (functions)
    // constructors
    // default constructor - without parameters
    public Refrigerator() {
        model = "no model";
        isON = false;
    }
    // parametrized constructor - with parameters
    public Refrigerator(String model, float w, float l, float h, float pu) {
        this.model = model;
        length = l;
        width = w;
        height = h;
        powerUsage = pu;
    }

    // getters
    public float GetCurrentT() {
        return currentT;
    }
    // static method - can access only static fields
    public static String GetType() {
        return type;
    }
    public static int GetCount() {
        return count;
    }

    // setters
    public void SetMinMaxT(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        minT = min;
        maxT = max;
    }
    public void SetUpT() {
        if (currentT < maxT)
            ++currentT;
    }
    public void SetDownT() {
        if (currentT > minT)
            --currentT;
    }

    public void SwitchPower() {
        isON = !isON;
    }
    public void PrintInfo() {
        System.out.println("----- " + model + " -----");
        System.out.println("Status: " + (isON ? "ON" : "OFF"));
        System.out.printf("Temperature (from %d to %d): %d\n", minT, maxT, currentT);
        System.out.printf("Size: %.2f x %.2f x %.2f\n", length, width, height);
        System.out.println("Power Usage: " + powerUsage);
    }
}
