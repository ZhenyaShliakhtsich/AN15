package com.teachMeSkills.an15.AltievAli.Training;

import java.time.Period;

public class Encapsulation {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setAge(-9);
        System.out.println(p1.getAge());//We will get default value - 0/Because age can not be minus
        p1.setAge(50);
        System.out.println(p1.getAge());
        p1.setFirstName("Jake");
        p1.setSecondName("Paul");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(p1.getFirstName()).append(" ")
                .append(p1.getSecondName()).append(" ")
                .append(p1.getAge());
        System.out.println(stringBuilder);
    }
}

class Person {

    private String firstName;
    private String secondName;
    private int age;
    private double height;
    private double weight;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;

    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
}
