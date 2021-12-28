package com.tom;

import java.util.Random;
import java.util.Scanner;

public class OneCardGame {
    public static void main(String[] args) {
        //club/diamond/heart/spade
        // 0  / 1     /2    /3
        char[] types = {'c', 'd', 'h', 's'};
        Random random = new Random();
        //prepare card deck
        int[] cards = new int[52];
        for (int i = 0; i < 52; i++) {
            cards[i] = i;
            System.out.print(cards[i] + " ");
        }
        System.out.println();
        //shuffle
        for (int i = 0; i < 52; i++) {
            int r = random.nextInt(52);
            int tmp = cards[i];
            cards[i] = cards[r];
            cards[r] = tmp;
        }
        for (int i = 0; i < 52; i++) {
            System.out.print(cards[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        //Computer's card
        int computer = cards[0];
        //10 => 11c
        //16 => 4d
        System.out.println("Computer has choose his/her card");
        System.out.println("Press enter to choose your card");
        String s = scanner.next();
        //Player's card
        int player = cards[1];
        //comparing
        int point = computer%13+1;
        int type = computer/13;
        System.out.println("Computer's card: " + point + "" + types[type] + "("+computer+")");
        //player
//        player = 38;
        int playerPoint = player%13 + 1;
        int playerType = player/13;
        System.out.println("Player's card: " + playerPoint + "" + types[playerType] + "("+player+")");
        if (playerPoint> point || (playerPoint==point && playerType > type)) {
            System.out.println("You win!");
        } else {
            System.out.println("You loose!");
        }
    }
}
