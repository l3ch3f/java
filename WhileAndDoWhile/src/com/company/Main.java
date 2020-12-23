package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        // Same output but in a for loop.

//	    for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }


        // while loop with a true statement with a infinite loop. With a test if a expression is true.
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }


        // will run 1 time and then test de statement. its garantee to perfome once. keep in mind to check your init variable.
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6) ;


        // Its going to start at number 5 due to increment on line 42. And finish up to 20.
        // We are testing if the number is an even number.

//        int number = 4;
//        int finishNumber = 20;
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        // Modify the while code:
        // Make it also record the total number of even numbers it has found
        // And break once 5 are found
        // and at the end, display the total number of even numbers found

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if((number %2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
