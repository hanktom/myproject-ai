package com.tom;

import java.util.Random;

public class Dice {
    int point = 1;
    public Dice() {
        Random random = new Random();
        point = random.nextInt(9)+1;
    }
}
