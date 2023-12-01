package com.GuesserGame;

import com.GuesserGame.PrintThePlayerScoreTable.PrintScore;
import com.GuesserGame.Guesser.Guesser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            System.out.println("_______________________________________________________________________________________________________");
            System.out.println("!......Welcome to Guesser game......!");
            System.out.println("_______________________________________________________________________________________________________");

            System.out.println("Have you ever experienced the thrill of a Guesser Game..?");
            System.out.print("(Yes/No):- ");
            Scanner scanner = new Scanner(System.in);
            String gameIntroduction = null;
            try {
                gameIntroduction = scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }

            if (gameIntroduction.equals("No") || gameIntroduction.equals("no") || gameIntroduction.equals("n")) {
                System.out.println("A Guesser Game is a simple console-based game where the Guesser generates a random number within a \nspecified range(for this game range is 1 to 10), and the players attempt to guess that number.");
            }
            System.out.println("_______________________________________________________________________________________________________");

            System.out.println("\nLet's begin the game!");

            System.out.println("_______________________________________________________________________________________________________");

            System.out.println("Please choose your player number: ");
            int playerCount = scanner.nextInt();
            System.out.println("_______________________________________________________________________________________________________");

            System.out.println("Time to join the game!");
            System.out.println("_______________________________________________________________________________________________________");

            //used to store the player name
            String[] playerName = new String[playerCount];

            //take player name by the user
            for (int i = 0; i < playerCount; i++) {
                System.out.println("What's your players-" + (i + 1) + " names: ");
                Scanner scanner1 = new Scanner(System.in);
                String name = scanner1.nextLine();
                try {
                    playerName[i] = name;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("_______________________________________________________________________________________________________");

            int[] scoreCard = new int[playerCount];

             while (true) {
                System.out.println("Get ready, the Guesser is about to reveal the number!");
                System.out.println("_______________________________________________________________________________________________________");

                int[] playerNumber = new int[playerCount];
                Scanner scanner1 = new Scanner(System.in);
                for (int i = 0; i < playerCount; i++) {
                    System.out.println("It's " + playerName[i] + "'s turn! Guess the number: ");
                    try {
                        playerNumber[i] = scanner1.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("!!...............Enter only number.............!!");
                        break;
                    }
                }

                //for constructor calling
                 Guesser guesser = new Guesser();

                int WinnerID = guesser.compare(playerNumber);

                System.out.println("_______________________________________________________________________________________________________");
                System.out.println("\t\t\t\t\t\t\t\t -:Result:-");

                if (WinnerID == -1) {
                    System.out.println("All player loss the game.");
                    System.out.println("The number is guess by guesser: " + guesser.guesserNumber);
                } else {
                    System.out.println("Congratulations to " + playerName[WinnerID] + " ! They are the winner of the game");
                    scoreCard[WinnerID] += 2;
                }

                System.out.println("_______________________________________________________________________________________________________");

                System.out.println("Do you want to continue playing the game?");
                Scanner scanner2 = new Scanner(System.in);
                String again = null;
                try {
                    again = scanner2.nextLine();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("_______________________________________________________________________________________________________");


                //Out to the loop
                if (again.equals("NO") || again.equals("no") || again.equals("No") || again.equals("n") || again.equals("N")) {
                    break;
                }

        }
        //final result announcement
        System.out.println("_______________________________________________________________________________________________________");
        System.out.println("_______________________________________________________________________________________________________");

        PrintScore.printTheFinalResult(scoreCard, playerName);

        System.out.println("_______________________________________________________________________________________________________");
        System.out.println("_______________________________________________________________________________________________________");

    }
}