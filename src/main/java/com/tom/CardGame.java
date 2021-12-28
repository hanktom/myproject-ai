package com.tom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CardGame {
    public static void main(String[] args) {
        List<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            cards.add(i);
        }
        System.out.println(cards);
        Collections.shuffle(cards);
        System.out.println(cards);
        int r = new Random().nextInt(52);
        int computer = cards.remove(r);
        System.out.println(computer);
        System.out.println(cards);
        int p = new Random().nextInt(51);
        int player = cards.remove(p);
        System.out.println(player);
        System.out.println(cards);

    }
}
