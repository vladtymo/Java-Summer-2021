package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        Lesson1();
        Lesson2();
        Lesson3();
        Lesson4();
    }

    public static void Lesson1()
    {
        System.out.print("Hello world!");   // write value
        System.out.println("Hello world!"); // write value with new line

        // variables
        // create a var: type name;
        // name can contains: 0-9 a-z A-Z _ $ (do not start with digit)

        int number = 10; // initialize
        number = 20;

        System.out.println(number);

        // %d - integer number
        System.out.printf("This number equals %d !!!", number);

        System.out.println("\n\tJava - Programming Language\n\t\tThe end!");
    }
    public static void Lesson2()
    {
        /////////////// Data Types
        // byte     1 byte  -128...127
        // short    2 bytes -32768...32767
        // int      4 bytes
        // long     8 bytes

        // float    4 bytes
        // double   8 bytes

        // boolean

        // Variables
        byte redChannel = 56;
        redChannel = 10;

        System.out.printf("Channel: %d\n", redChannel);

        double koef = 1.5;
        int salary = 2300;

        // Console input
        Scanner scanner = new Scanner(System.in);

        int months = scanner.nextInt();
        System.out.printf("Salary (%d months): %d\n", months, salary * months);

        // Calculate rectangle area
        System.out.print("Enter rectangle width: ");
        float width = scanner.nextFloat();
        System.out.print("Enter rectangle length: ");
        float length = scanner.nextFloat();

        double area = width * length;
        System.out.println("Area = " + area);
    }
    public static void Lesson3()
    {
        //////// Type Conversions
        short a = 10;
        int b = 20;

        b = a;          // implicit conversion
        a = (short) b;   // explicit conversion

        long c = a;

        double salary = 5600;
        float bonus = 800;

        // += -= *= /=
        salary = salary + bonus;    // 6400
        salary += bonus;            // 7200
        System.out.println(salary);

        // ++ --
        int k = 1;
        ++k; // 2
        --k; // 1

        int k2 = k--;
        System.out.println(k2); // 1

        //////////// Logical Operators
        // > < >= <= == !=
        int left = 20, right = 30;
        boolean result = left < right;

        System.out.println(result);

        if (result)
        {
            System.out.println("This is true!!!");
        }
        else
        {
            System.out.println("This is wrong!!!");
        }

        System.out.print("Enter your age: ");
        short age = scanner.nextShort();

        //boolean isAdult = age >= 18;
        if (age >= 18)
        {
            if (age < 50)
                System.out.println("Hello adult. Come in!!!");
            else
                System.out.println("Sorry( Goodbye!");
        }
        else
        {
            System.out.println("Sorry( Goodbye!");
        }

        // && - logical 'and'
        // || - logical 'or'

        if (age >= 18 && age < 50)
        {
            System.out.println("Hello adult. Come in!!!");
        }
        else
        {
            System.out.println("Sorry( Goodbye!");
        }
    }
    public static void Lesson4()
    {
        int a = 9;
        int b = 2;

        // %
        System.out.println(a % b);

        int number = scanner.nextInt();

        if (number % 7 == 0)
            System.out.println("Number complete divide by 7");

        int lastDigit = number % 10;
        System.out.println("The last digit of the number: " + lastDigit);

        number -= lastDigit;
        number /= 10;

        System.out.println("The number without last digit: " + number);


        int dir = 0;
        System.out.print("1 - north\n2 - south\n3 - west\n4 - east\n" +
                "Enter the direction of a ship: ");
        dir = scanner.nextInt();

        // if else if ...

        if (dir == 1) System.out.println("After command 'back': south");
        else if (dir == 2) System.out.println("After command 'back': north");
        else if (dir == 3) System.out.println("After command 'back': east");
        else if (dir == 4) System.out.println("After command 'back': west");
        else System.out.println("Invalid direction!");

        // switch
        switch (dir)
        {
            case 1: System.out.println("After command 'back': south");
                break;
            case 2: System.out.println("After command 'back': north");
                break;
            case 3: System.out.println("After command 'back': east");
                break;
            case 4: System.out.println("After command 'back': west");
                break;

            default: System.out.println("Invalid direction!"); break;
        }

        System.out.print("Enter a mark (1-12): ");
        short mark = scanner.nextShort();

        switch (mark)
        {
            case 12: case 11: case 10:
            System.out.println("Successfully!");
            break;
            case 7: case 8: case 9:
            System.out.println("Good!");
            break;
            // ...
        }
    }
}
