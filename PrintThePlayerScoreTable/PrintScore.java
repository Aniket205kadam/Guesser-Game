package com.GuesserGame.PrintThePlayerScoreTable;

public class PrintScore {
    //this method task is to print the score table
    public static void printTheFinalResult(int[] scoreCard, String[] playerName) {
        System.out.println("\t\t\t\t\t\t\t\t----------------------------------------");

        System.out.println("\t\t\t\t\t\t\t\t|  Rank  |   Player Name   |   Points  |");

        System.out.println("\t\t\t\t\t\t\t\t----------------------------------------");

        for (int i = 0; i < scoreCard.length; i++) {
            //The (i+1) is indicated that the rank of the player
            System.out.print("\t\t\t\t\t\t\t\t|   " + (i + 1) + "    |");

            int id = DefinedRanks.sequenceOfRanks(scoreCard);

            System.out.print("   " + playerName[id]);
            for (int j = 0; j < 14 - playerName[id].length(); j++) {
                System.out.print(" ");
            }
            System.out.print("|");

            //this control statement is used to find zero point player
            if (scoreCard[id] < -100) {
                System.out.println("\t  " + 0 + "    |");
            } else {
                System.out.println("\t  " + Math.abs(scoreCard[id]) + "    |");
            }

            System.out.println("\t\t\t\t\t\t\t\t----------------------------------------");
        }
    }
}