package com.tom;

import java.util.Scanner;

public class UsingSwitch {
    public static void main(String[] args) {
        int total = 0;
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while(!exit) {
            System.out.println("Please put your coin(1/5/10):");
            String s = scanner.next();
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



        }

    }
}
