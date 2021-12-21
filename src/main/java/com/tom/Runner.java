package com.tom;

public class Runner {
    public static void main(String[] args) {
        float h = 1.7f;
        float w = 65.5f;
        float bmi = w/(h*h);
        System.out.println("Your BMI is " + bmi);

        Person p = new Person();
        Person p2 = new Person();
        p.age = 18;
        p.print();
        System.out.println(p.age);
        System.out.println(p2.age);
    }
}
