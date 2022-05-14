package com.darius.wtf.Game;

import java.util.Random;
import java.util.Scanner;

abstract class Game {

    private final Scanner scanner = new Scanner(System.in);
    private int score = 0;
    private int guess;

//getters and setters
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public Scanner getScanner() {
        return scanner;
    }
}


