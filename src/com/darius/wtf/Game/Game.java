package com.darius.wtf.Game;

import java.util.Scanner;

abstract class Game {

    private final Scanner scanner = new Scanner(System.in);

    //getters and setters
    public int getScore() {
        return 0;
    }

    public Scanner getScanner() {
        return scanner;
    }
}


