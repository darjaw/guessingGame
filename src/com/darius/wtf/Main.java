package com.darius.wtf;

import com.darius.wtf.Game.*;

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
                    new EasyGame();
                }
                case 2 -> {
                    scanner.nextLine();
                    new MediumGame();
                }
                case 3 -> {
                    scanner.nextLine();
                    new HardGame();
                }
                case 4 -> {
                    scanner.nextLine();
                    new RandomGame();
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
