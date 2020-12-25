package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.in = buildin user input. new creates a new object.
        Scanner scanner = new Scanner(System.in);

        // scanner works also with integers you need to set the datatype.
        // the reason why its above the String: it is recommende to call nextline or else it is gonna skip the next call.
        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            // retrieve input from user and store it in a String.
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            // calculate for how old a person is.
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                // print outs to user.
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }
        // it needs to be closed.
        scanner.close();
    }
}
