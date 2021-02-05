package com.l3ch3f;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String aplhanumeric = "abcDeeeF123Ghhiiijkl99z";
        System.out.println(aplhanumeric.replaceAll(".", "Y"));

        System.out.println(aplhanumeric.replaceAll("^abcDeee","YYY"));

        String secondString = "abcDeeeF123Ghhiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));

        System.out.println(aplhanumeric.matches("^hello"));
        System.out.println(aplhanumeric.matches("^abcDeee"));
        System.out.println(aplhanumeric.matches("abcDeeeF123Ghhiiijkl99z"));

        System.out.println(aplhanumeric.replaceAll("ijkl99z","THE END"));
    }
}
