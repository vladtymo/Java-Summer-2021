package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args)
    {
        //Lesson1();
        //Lesson2();
        //Lesson3();
        //Lesson4();
        //Lesson5();
        //Lesson6();
        //Lesson7();
        //Lesson8();
        //Lesson9();
        //Lesson10();
        Lesson11();

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

        ////////// Directions
//        final short north = 1;
//        final short south = 2;
//        final short west = 3;
//        final short east = 4;

        enum Directions {
            north, south, west, east
        }

        Directions dir = Directions.north; // direction of the ship
        System.out.printf("1 - north\n2 - south\n3 - west\n4 - east\n" +
                "Enter the direction of a ship: ");
        // dir = Directions.;n TODO

        // if else if ...

        if (dir == Directions.north) System.out.println("After command 'back': south");
        else if (dir == Directions.south) System.out.println("After command 'back': north");
        else if (dir == Directions.west) System.out.println("After command 'back': east");
        else if (dir == Directions.east) System.out.println("After command 'back': west");
        else System.out.println("Invalid direction!");

        // switch
        switch (dir)
        {
            case north: System.out.println("After command 'back': south");
                break;
            case south: System.out.println("After command 'back': north");
                break;
            case west: System.out.println("After command 'back': east");
                break;
            case east: System.out.println("After command 'back': west");
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
    public static void Lesson5()
    {
        int count = scanner.nextInt(); // 5

//        int i = 0;
//        while (i < count) // condition = true
//        {
//            // code
//            System.out.println("Hello");
//
//            ++i;
//        }

        // for (variables; condition; expression) { code... }
        // 1 - create variables
        // 2 - check condition
        // 3 - do code
        // 4 - do expression
        for (int i = 0; i < count; ++i)
        {
            System.out.println(i+1 + " - Hello");
        }

        System.out.print("Continue... Press [0] to exit: ");

        while(scanner.nextInt() != 0)
        {
            System.out.print("Try again: ");
        }
        System.out.println("Bye!");
    }
    public static void Lesson6()
    {
//        float speed;
//        System.out.print("Enter speed: ");

        // 0...220
        //speed = scanner.nextFloat();

//        while (speed > 220 || speed < 0)
//        {
//            speed = scanner.nextFloat();
//        }

//        do
//        {
//            speed = scanner.nextFloat();
//        } while (speed > 220 || speed < 0);

//        for (int i = 1, k = 10; i <= 10; i++, --k) {
//            System.out.print(i + "/" + k + " - ");
//        }

//        System.out.println("The end!");


//        int w = 9, h = 6;
//        char filler = '#';
//        filler = scanner.next().charAt(0);
//
//        // **********
//        for (int k = 0; k < h; k++)
//        {
//            for (int i = 0; i < w; i++)
//            {
//                if (i == w / 2)
//                {
//                    System.out.print('-');
//                    continue;
//                }
//                System.out.print(filler);
//            }
//            System.out.println();
//        }

        final int maxCount = 5;
        int counter = 0;

        for (int i = 0; i < 100; i++)
        {
            if (i >= 20 && i <= 50) continue; // skip current iteration
            if (i % 7 == 0)
            {
                System.out.print(i + ", ");
                ++counter;
                if (counter == maxCount) break; // close cycle
            }
        }
    }
    public static void Lesson7()
    {
        //Array - collection of elements
        //int[] arr = new int[] { 7, 9, 3, 5, 6, 1 }; // 0 0 0 0 0

//        for (int i = 0; i < arr.length; ++i)
//        {
//            arr[i] = i+1;
//        }

//        System.out.println("Array Length: " + arr.length);
//        for (int i = 0; i < arr.length; i++)
//        {
//            System.out.print(arr[i] + ", ");
//        }

        int count = 0;
        System.out.print("Enter marks count: ");
        count = scanner.nextInt();

        float[] marks = new float[count]; // 0 0 0 0

        double markSumma = 0;
        for (int i = 0; i < marks.length; i++)
        {
            System.out.print("Enter mark: ");
            marks[i] = scanner.nextFloat();
            markSumma += marks[i];
        }

        System.out.println("Summa of mark: " + markSumma);
        System.out.printf("Average mark: %.2f\n", markSumma / marks.length);
        for (int i = 0; i < marks.length; i++)
        {
            System.out.print(marks[i] + " - ");
        }

        // Bubble Sort
        for (int k = 0; k < marks.length - 1; ++k)
        {
            for (int i = 0; i < marks.length - 1 - k; i++)
            {
                if (marks[i] > marks[i + 1])
                {
                    float temp = marks[i];
                    marks[i] = marks[i + 1];
                    marks[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < marks.length; i++)
        {
            System.out.print(marks[i] + " - ");
        }
    }
    public static void Lesson8()
    {
        int[] ratings = new int[20];

        Random rnd = new Random();

        for (int i = 0; i < ratings.length; i++)
        {
            // Math.random() - 0...<1
            ratings[i] = (int)(Math.random() * 11);

            // Random().nextInt(10) - 0...<10;
            ratings[i] = rnd.nextInt(10 + 1);

            System.out.print(ratings[i] + ", ");
        }
        System.out.println();
        PrintLine('#', 50);

        SortArray(ratings, true);

        for (int i = 0; i < ratings.length; i++) {
            System.out.print(ratings[i] + ", ");
        }

        System.out.println();
        PrintLine('@', 50);
    }
    public static void PrintLine(char symbol, int length) // '#', 5 - #####
    {
        if (length <= 0) return;

        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println("...end!");
    }
    public static void SortArray(int[] arr, boolean isAcs)
    {
        // condition ? expression_if_true : expression_if_false
        //System.out.println(10 > 5 ? "Bigger" : "Less");

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && (isAcs ? arr[j] > key : arr[j] < key)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void Lesson9()
    {
        int a = GetStepin(3, 3);

        System.out.println("Stepin = " + a);
        if (a % 2 == 0) System.out.println("Result is even number!");

        PrintLine('%', 20);

        int[] intArr = new int[8];
        InitializeArray(intArr);
        PrintArray(intArr);

        double[] doubleArr = new double[8];
        InitializeArray(doubleArr);
        PrintArray(doubleArr);

        char[] charArr = new char[50];
        InitializeArray(charArr);
        PrintArray(charArr);
    }
    public static int Login(int code)
    {
       if (code == 123) return 200;
       else if (code == 0) return 500;
       else if (code == -1) return 404;
       else return 0;
    }
    public static int GetStepin(int number, int step)
    {
        int result = number;
        for (int i = 0; i < step - 1; ++i)
        {
            result *= number;
        }

        // System.out.println("Result: " + result);
        return result; // close method
    }

    public static void PrintArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public static void PrintArray(double[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public static void PrintArray(char[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public static void InitializeArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }
    public static void InitializeArray(double[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + random.nextDouble();
        }
    }
    public static void InitializeArray(char[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(random.nextInt(90 - 65 + 1) + 65);
        }
    }

    public static void Lesson10()
    {
        PrintStars(10);
        System.out.println();
        //PrintStarsRecursiv(10);

        final int length = 6;
        int[][] field = new int[length][length];

        FindPathOnChessboard(field, 2, 2);

        for (int r = 0; r < length; r++) {
            for (int c = 0; c < length; c++) {
                System.out.print(field[r][c] + "\t");
            }
            System.out.println();
        }
    }
    public static void PrintStars(int num) // 10
    {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
    public static void PrintStarsRecursiv(int num)
    {
        if (num <= 0) return;

        System.out.print("*");
        PrintStarsRecursiv(num - 1);
    }

    // filed cell: true - was the knight
    //             false - was not the knight
    public static boolean FindPathOnChessboard(int[][] field, int y, int x) {

        final int nextStep = field[y][x] + 1;
        if (nextStep > field.length * field.length)
            return true;

        final int length = field.length;

        if (y - 2 >= 0 && x + 1 < length && field[y - 2][x + 1] == 0) {
            // try this cell
            field[y - 2][x + 1] = nextStep;
            if (FindPathOnChessboard(field, y - 2, x + 1) == false)
                field[y - 2][x + 1] = 0;
            else return true;
        }
        if (y - 1 >= 0 && x + 2 < length && field[y - 1][x + 2] == 0) {
            field[y - 1][x + 2] = nextStep;
            if (FindPathOnChessboard(field, y - 1, x + 2) == false)
                field[y - 1][x + 2] = 0;
            else return true;
        }
        if (y + 1 < length && x + 2 < length && field[y + 1][x + 2] == 0) {
            field[y + 1][x + 2] = nextStep;
            if (FindPathOnChessboard(field, y + 1, x + 2) == false)
                field[y + 1][x + 2] = 0;
            else return true;
        }
        if (y + 2 < length && x + 1 < length && field[y + 2][x + 1] == 0) {
            field[y + 2][x + 1] = nextStep;
            if (FindPathOnChessboard(field, y + 2, x + 1) == false)
                field[y + 2][x + 1] = 0;
            else return true;
        }
        //------------------------
        if (y + 2 < length && x - 1 >= 0 && field[y + 2][x - 1] == 0) {
            field[y + 2][x - 1] = nextStep;
            if (FindPathOnChessboard(field, y + 2, x - 1) == false)
                field[y + 2][x - 1] = 0;
            else return true;

        }
        if (y + 1 < length && x - 2 >= 0 && field[y + 1][x - 2] == 0) {
            field[y + 1][x - 2] = nextStep;
            if (FindPathOnChessboard(field, y + 1, x - 2) == false)
                field[y + 1][x - 2] = 0;
            else return true;
        }
        if (y - 1 >= 0 && x - 2 >= 0 && field[y - 1][x - 2] == 0) {
            field[y - 1][x - 2] = nextStep;
            if (FindPathOnChessboard(field, y - 1, x - 2) == false)
                field[y - 1][x - 2] = 0;
            else return true;
        }
        if (y - 2 >= 0 && x - 1 >= 0 && field[y - 2][x - 1] == 0) {
            field[y - 2][x - 1] = nextStep;
            if (FindPathOnChessboard(field, y - 2, x - 1) == false)
                field[y - 2][x - 1] = 0;
            else return true;
        }

        return false;
    }

    public static void Lesson11() {
        System.out.println("Product Type: " + Refrigerator.GetType());

        Refrigerator ref1 = new Refrigerator("Samsung", 100, 100, 210, 1);
        Refrigerator ref2 = new Refrigerator("LG", 120, 90, 210, 1.5F);
        //ref1.Initializer("Samsung", 100, 100, 210, 1);

        ref1.SwitchPower();
        ref1.SetMinMaxT(-6, 2);

        //ref1.currentT = -20; // error (private access)
        ref1.SetUpT();
        ref1.SetUpT();
        ref1.SetUpT();
        ref1.SetUpT();

        System.out.println("Product Count: " + Refrigerator.GetCount());

        ref1.PrintInfo();
        ref2.PrintInfo();
    }

}

