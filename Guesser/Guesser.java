package com.GuesserGame.Guesser;

import java.util.Random;

public class Guesser {
    public int guesserNumber;
    public Guesser() {
        Random random = new Random();
        guesserNumber = random.nextInt(1 , 10);
    }

    public int compare(int[] playerNumber) {
        int n = playerNumber.length;

        for (int i = 0; i < n; i++) {
            if (guesserNumber == playerNumber[i]) {
                return i;
            }
        }
        return -1;
    }
}