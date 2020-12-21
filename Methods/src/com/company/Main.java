package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800,5,100);
        System.out.println("Your final score was " + highScore);
//        calculateScore(true,10000,8,200);
        int position = calculateHighscorePosition(1500);
        displayHighScorePosition("Mark", position);
        position = calculateHighscorePosition(900);
        displayHighScorePosition("frank", position);
        position = calculateHighscorePosition(300);
        displayHighScorePosition("carol", position);
        position = calculateHighscorePosition(50);
        displayHighScorePosition("jim", position);

    }
    // Java kan je de method ook onderaan de main method zetten en oproepen in de main.
    // Je kan parameters geven om code niet te herhalen met de appropiate data type in de parameters.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
//            System.out.println("your final score was " + finalScore);
            return finalScore;
        }
        else
        {
            return -1;
        }
    }

    public static void displayHighScorePosition (String player, int position) {
        System.out.println(player + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighscorePosition(int playerScore) {
        if(playerScore >= 1000)
        {
            return 1;
        }
        else if (playerScore >= 500)
        {
            return 2;
        }
        else if (playerScore >= 100)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }
}
