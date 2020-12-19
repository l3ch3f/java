package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 10;
        short shorValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shorValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shorValue + intValue));

    }
}