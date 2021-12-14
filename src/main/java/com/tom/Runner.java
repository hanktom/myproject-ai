package com.tom;

public class Runner {
    public static void main(String[] args) {
        float h = 1.7f;
        float w = 65.5f;
        float bmi = w/(h*h);
        System.out.println("Your BMI is " + bmi);

        Person person = new Person(1.7f, 65.5f);
        System.out.println("Your BMI is " + person.bmi());
//        person.
    }
}
