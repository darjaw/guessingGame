package com.darius.wtf.Game;

import java.util.Random;
import java.util.Scanner;

public class MediumGame extends Game {
    public MediumGame(){
        Random randomNumber = new Random();
        int randNum = randomNumber.nextInt(50);
        int score = getScore();

        System.out.println("Enter your Guess! (0-50)");

        while (true) {
//            System.out.println("debug: "+randNum);
            System.out.println();

            //getting player guess and tracking score
            Scanner scanner = getScanner();
            int playerGuess = scanner.nextInt();
            score++;

            //logic for determining correct guess
            if (playerGuess == randNum) {
                System.out.println("You Win!");
                System.out.println("Score: "+ score);
                break;
            }
            else if (playerGuess > randNum) {
                System.out.println("Go Lower ⬇️ ");
            }
            else {
                System.out.println("Go Higher ⬆️");
            }
        }
    }

}
