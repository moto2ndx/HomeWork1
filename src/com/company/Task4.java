package com.company;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Enter the first number:");
        a = scanner.nextInt();
        System.out.println("Enter the second number:");
        b = scanner.nextInt();


        Operations operations = new Operations();

        int result = operations.plus(a,b);
        System.out.println("Operation plus: " + result);

        int result1 = operations.minus(a,b);
        System.out.println("Operation minus: " + result1);

        int result2 = operations.multiply(a,b);
        System.out.println("Operation multiply: " + result2);

        double result3 = operations.division(a,b);
        System.out.println("Operation division: " + result3);


    }
}

class Operations {

    public int plus(int a, int b) {

        int s = a + b;
        return s;
    }

    public int minus(int a, int b) {

        int m = a - b;
        return m;
    }

    public int multiply(int a, int b) {

        int mult = a * b;
        return mult;
    }

    public double division(double a, double b) {

        double d = a / b;
        return d;
    }
}



