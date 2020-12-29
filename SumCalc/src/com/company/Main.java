package com.company;

import java.util.Set;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(1);
        calc.setSecondNumber(2);

        System.out.println("2 + 1 = " + calc.getAdditionResult());
        calc.setFirstNumber(6);
        System.out.println("6 / 2 = " + calc.getDivisionResult());



    }
}
