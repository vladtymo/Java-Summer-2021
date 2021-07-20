package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ////////// Type Conversions
//        short a = 10;
//        int b = 20;
//
//        b = a;          // implicit conversion
//        a = (short) b;   // explicit conversion
//
//        long c = a;
//
//        double salary = 5600;
//        float bonus = 800;
//
//        // += -= *= /=
//        salary = salary + bonus; // 6400
//        salary += bonus;         // 7200
//        System.out.println(salary); //
//
//        // ++ --
//        int k = 1;
//        ++k; // 2
//        --k; // 1
//
//        int k2 = k--;
//        System.out.println(k2); // 1
//
//        //////////// Logical Operators
//        // > < >= <= == !=
//        int left = 20, right = 30;
//        boolean result = left == right;
//        System.out.println(result);
//
//        if (result)
//        {
//            System.out.println("This is true!!!");
//        }
//        else
//        {
//            System.out.println("This is wrong!!!");
//        }
//
//        System.out.print("Enter your age: ");
//        short age = scanner.nextShort();
//
//        //boolean isAdult = age >= 18;
//        if (age >= 18)
//        {
//            if (age < 50)
//                System.out.println("Hello adult. Come in!!!");
//            else
//                System.out.println("Sorry( Goodbye!");
//        }
//        else
//        {
//            System.out.println("Sorry( Goodbye!");
//        }
//
//        // && - logical 'and'
//        // || - logical 'or'
//
//        if (age >= 18 && age < 50)
//        {
//            System.out.println("Hello adult. Come in!!!");
//        }
//        else
//        {
//            System.out.println("Sorry( Goodbye!");
//        }

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
