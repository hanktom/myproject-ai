package com.tom;

public class Sorting {
    public static void main(String[] args) {
        int[] n = {12, 5, 6, 3, 15};
        System.out.println(n.length);
        for (int i=0; i<n.length-1; i++) {
            //System.out.println(i);
            for (int j=i+1; j<n.length; j++) {
                if (n[i] < n[j]) {
                    int tmp = n[i];
                    n[i] = n[j];
                    n[j] = tmp;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ",");
        }


    }
}
