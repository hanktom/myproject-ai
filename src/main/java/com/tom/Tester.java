package com.tom;

public class Tester {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(s.length());
        System.out.println(s.charAt(7));
        int a = 3;
        int b = 5;
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
