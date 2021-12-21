package com.tom;

public class Person {
    int age;
    float height;
    float weight;
    public void print() {
        System.out.println(age + "\t" + height + "\t" + weight);
    }
    public float bmi() {
        float bmi = weight/(height*height);
        return bmi;
    }
}
