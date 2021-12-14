package com.tom;

public class Person {
    float height;
    float weight;
    public Person(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }
    public float bmi() {
        return weight/(height*height);
    }

    public void hello() {
        System.out.println("viva, boss!! Hello~");
    }
    public void goodBye() {

    }
}
