package com.tom;

import java.util.Scanner;

public class UsingSwitch {
    //Drink a) 25
    //Drink b) 15
    //Drink c) 20
    public static void main(String[] args) {
        int total = 0;
        int aPrice = 25;
        int bPrice = 15;
        int cPrice = 20;
        int[] prices = {25, 15, 20};
        System.out.println(prices.length);
        for (int i=0; i<prices.length; i++) {
            System.out.println(prices[i]);
        }

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while(!exit) {
            System.out.println("Please put your coin(1/5/10): total:" + total);
            String s = scanner.next();
            switch (s) {
                case "1":
                case "5":
                case "10":
                    int m = Integer.parseInt(s);
                    total+=m;
                    break;
                case "a":
                    if (total>=aPrice) {
                        System.out.println("DON!");
                        //total = total - aPrice;
                        total-=aPrice;
                    } else {
                        System.out.println("BEEP!");
                    }
                    break;
                case "b":
                    if (total>=bPrice) {
                        System.out.println("DON!");
                        //total = total - aPrice;
                        total-=bPrice;
                    } else {
                        System.out.println("BEEP!");
                    }
                    break;
                case "c":
                    if (total>=cPrice) {
                        System.out.println("DON!");
                        //total = total - aPrice;
                        total-=cPrice;
                    } else {
                        System.out.println("BEEP!");
                    }
                    break;
                default:
                    break;
            }
            /*
            try {
                int coin = Integer.parseInt(s);
                switch (coin) {
                    case 1:
                    case 5:
                    case 10:
                        total = total + coin;
                        break;
                    case 0:
                        System.out.println("Returning your coins...");
                        exit = true;
                        break;
                    default:
                        System.out.println("other");
                        break;
                }
                System.out.println("total:" + total);
            } catch (NumberFormatException e) {
                System.out.println("Exp!!");

            }
            */


        }

    }
}
