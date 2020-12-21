package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800,5,100);

        calculateScore(true,10000,8,200);

    }
    // Java kan je de method ook onderaan de main method zetten en oproepen in de main.
    // Je kan parameters geven om code niet te herhalen met de appropiate data type in de parameters.
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
    }
}
