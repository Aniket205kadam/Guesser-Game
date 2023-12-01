package com.GuesserGame.PrintThePlayerScoreTable;

public class DefinedRanks {
    public static int sequenceOfRanks(int[] scoreCard) {
        int max_idx = 0;
        for (int i = 0; i < scoreCard.length; i++) {
            if (scoreCard[max_idx] < scoreCard[i]) {
                max_idx = i;
            }
        }

        //for when the player points in zero
        int zero = 1;

        //after using make the point zero but there is one problem. print the point in scores table.
        if (scoreCard[max_idx] > 0) {
            scoreCard[max_idx] *= -1;
        }
        else {
            zero++;
            scoreCard[max_idx] = Integer.MIN_VALUE + zero;
        }
        return max_idx;
    }
}