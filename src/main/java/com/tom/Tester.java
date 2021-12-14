package com.tom;

public class Tester {
    public static void main(String[] args) {
        //          0123456
        String s = "abcdefghijk";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf("g"));
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (s.charAt(i) == 'g' || s.charAt(i)=='o' || s.charAt(i)=='d') {
                System.out.print("*");
            }
            System.out.println();
        }

        int a = 3;
        int b = 5;
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
