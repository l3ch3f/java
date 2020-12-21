package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable=50;
        if (myVariable ==50) {
            System.out.println("Printed");
        }


        // statements
        myVariable++;
        myVariable--;
        // statement + expression between the ""
        System.out.println("This is a test");
        // Whitespace is cool with java
        System.out.println("This is" +
                "another" +
                "still more.");
        // Statements can go on the same line but not preferable.
        int anotherVariable = 50; myVariable--;
    }
}
