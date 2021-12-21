package com.tom;

public class Poker {
    public static void main(String[] args) {
        //store data!
        String tt = "cdhs";
        char[] types = {'c', 'd', 'h', 's'};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print((j+1)+""+ tt.charAt(i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
