package com.tom;

public class UsingSwitch {
    public static void main(String[] args) {
        int n = 1;
        switch (n) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("other");
                break;
        }
        System.out.println("end");
    }
}
