package com.tom;

public class VendingMachine {
    //a) 25
    //b) 15
    //c) 20
    //total
    public static void main(String[] args) {
        Drink a = new Drink(25);
        Drink b = new Drink(15);
        Drink c = new Drink(20);
        int total = 16;
        int change = a.get(total);
        if (change >= 0) {
            System.out.println("DON!");
            total = change;
        } else {
            System.out.println("BEEP!");
        }
    }

}
