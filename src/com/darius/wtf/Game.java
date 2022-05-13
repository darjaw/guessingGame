package com.darius.wtf;

import java.util.Random;
import java.util.Scanner;

public class Game {

    static Scanner scanner = new Scanner(System.in);
    static int score = 1;

    public static void easyGame() {
        Random rand = new Random();
        int randNum = rand.nextInt(10);
        //easy game code
        System.out.println("Enter your Guess! (1-10):");
        while (true) {
            int playerGuess = scanner.nextInt();
            if (playerGuess == randNum) {
                System.out.println("You Win!");
                System.out.println("Score: "+score);
                break;
            }
            else if (playerGuess > randNum) {
                System.out.println("Go Lower ⬇️ ");
                score++;
            }
            else {
                System.out.println("Go Higher ⬆️");
                score++;
            }
        }

    }
    public static void medGame() {
        Random rand = new Random();
        int randNum = rand.nextInt(50);

        //med game code
        System.out.println("Enter your Guess! (1-50):");
        while (true) {
            int playerGuess = scanner.nextInt();
            if (playerGuess == randNum) {
                System.out.println("You Win!");
                System.out.println("Score: "+score);
                break;
            } else if (playerGuess > randNum) {
                System.out.println("Go Lower ⬇️ ");
                score++;
            }
            else {
                System.out.println("Go Higher ⬆️");
                score++;
            }
            }
        }
    public static void hardGame() {
        Random rand = new Random();
        int randNum = rand.nextInt(100);

        //hard game code
        System.out.println("Enter your Guess! (1-100):");
        while (true) {
            int playerGuess = scanner.nextInt();
            if (playerGuess == randNum) {
                System.out.println("You Win!");
                System.out.println("Score: "+score);
                break;
            } else if (playerGuess > randNum) {
                System.out.println("Go Lower ⬇️ ");
                score++;
            }
            else {
                System.out.println("Go Higher⬆️");
                score++;
            }
        }
    }
    public static void randGame(int randGameNum) {
        Random rand = new Random();
        int randNum = rand.nextInt(randGameNum);

        //rand game code
        System.out.println("Enter your Guess! "+"(" +
                "\uD83D\uDD2E"+")");
        while (true) {
            int playerGuess = scanner.nextInt();
            if (playerGuess == randNum) {
                System.out.println("You Win!");
                System.out.println("Score: "+score);
                break;
            } else if (playerGuess > randNum) {
                System.out.println("Go Lower ⬇️ ");
                score++;
            }
            else {
                System.out.println("Go Higher ⬆️");
                score++;
            }
        }
    }

}

