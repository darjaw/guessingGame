package com.darius.wtf;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // difficulty selection
        System.out.println("Select your difficulty! (Easy, Medium, Hard, Random)");
        String difficulty = scanner.nextLine().toLowerCase(Locale.ROOT);
        if (difficulty.equals("easy")) Game.easyGame();
        if (difficulty.equals("medium"))Game.medGame();
        if (difficulty.equals("hard"))Game.hardGame();
        if (difficulty.equals("random")) {
            int randGameNum = rand.nextInt(100000);
            Game.randGame(randGameNum);
            scanner.close();
        }
    }
}
