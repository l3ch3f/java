package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 5000;
	    int levelCompleted = 5;
	    int bonus = 100;

	    if (score < 5000)
        {
            System.out.println("Your score was less 5000");
        }
	    else
        {
            System.out.println("got here");
        }

	    if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        if (newGameOver)
        {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
}
