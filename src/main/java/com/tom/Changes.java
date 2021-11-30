package com.tom;

public class Changes {
    public static void main(String[] args) {
        int total = 28;
        System.out.println("10x" + (total/10));
        System.out.println("5x" + (total-10*(total/10)-(total%5))/5);
        System.out.println("1x" + (total%5));

    }
}
