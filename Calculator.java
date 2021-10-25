package com.demo2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        double a = scanner.nextInt();
        System.out.println("Please enter a second number:");
        double b = scanner.nextInt();

        System.out.println("Please select one of the following options:\n1/Adding---2/Subtract---3/Multiply--4/Divide");
        double input = scanner.nextInt();

            if (input == 1) System.out.println(a + b);
            else if (input == 2) System.out.println(a - b);
            else if (input == 3) System.out.println(a * b);
            else if (input == 4) System.out.println(a / b);
            else System.out.println("Entry is invalid");

    }
}
