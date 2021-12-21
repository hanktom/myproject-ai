package com.tom;

import java.util.Random;

public class DiceCounter {
    //rolling dice 10 times
    //counting points
    public static void main(String[] args) {

        int[] counters = new int[6];
        for (int i = 0; i < 10; i++) {
            Dice dice = new Dice();

            System.out.println(dice.point);
            counters[dice.point-1]++;
        }
        int max = 0;
        int point = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1) + " " + counters[i] + " times");
            if (counters[i] > max) {
                max = counters[i];
                point = i;
            }
        }
        System.out.println((point+1) + " " + max + " times");
    }
}
