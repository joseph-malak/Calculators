package com.demo2;

import java.util.Scanner;

public class EMICalculator {
    public static void main(String[] args) {
        double answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount you wish to loan:");
        double p = scanner.nextInt();
        System.out.println("Please enter the amount of interest expected:");
        double r = scanner.nextInt();
        System.out.println("Please enter the amount of years you expect to pay for:");
        double n = scanner.nextInt();
        n*= 12;


        answer = (p*r*(1+r)*n)/((1+r)*n-1);

        System.out.println(answer);

    }
}
