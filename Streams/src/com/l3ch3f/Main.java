package com.l3ch3f;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF123Ghhiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));

        String secondString = "abcDeeeF123Ghhiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF123Ghhiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("ijkl99z","THE END"));
        System.out.println(alphanumeric.replaceAll("a", "hello"));
    }
}
