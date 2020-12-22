package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInerest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInerest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInerest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInerest(10000.0, 5.0));

        for (double i=0.0;i<10;i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInerest(10000.0, i));
        }
    }

    public static double calculateInerest(double amount, double interestRate) {
        return (amount *(interestRate/100));
    }
}
