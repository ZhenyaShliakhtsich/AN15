package com.teachMeSkills.an15.classes;

public class Dog {
    String name;
    int age;
    double weight;

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
