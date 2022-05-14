package com.darius.wtf;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //menu
        while (true) {
            int difficulty = 0;
            System.out.println("""
                    Select your difficulty!
                    1.Easy
                    2.Medium
                    3.Hard
                    4.Random
                    9.Exit
                    """);
            Scanner scanner = new Scanner(System.in);
        try {
            //catching an invalid menu option
            difficulty = scanner.nextInt();
            } catch (NoSuchElementException e) {
            System.out.println("Please enter a number!");
            }
            //game difficulties
            switch (difficulty) {
                case 1 -> {
                    scanner.nextLine();
                    Game.easyGame();
                }
                case 2 -> {
                    scanner.nextLine();
                    Game.medGame();
                }
                case 3 -> {
                    scanner.nextLine();
                    Game.hardGame();
                }
                case 4 -> {
                    scanner.nextLine();
                    Random rand = new Random();
                    int randGameNum = rand.nextInt(100000);
                    Game.randGame(randGameNum);
                }
                case 5 -> {
                    //chaos mode     (not implemented)
                    System.out.println("Chaos isn't here yet! \uD83E\uDD2B");
                    System.out.println();
                }
                case 9 -> {
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                }
                default -> {
                    System.out.println();
                    scanner.nextLine();
                }
            }

        }
    }
}
