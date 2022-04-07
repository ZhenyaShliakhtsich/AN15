package com.teachMeSkills.an15.AltievAli.hm10.condition1;

import java.util.Comparator;

public class People implements Comparator<People> {
    private String name;
    private int age;
    private Sex sexEnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSexEnum() {
        return sexEnum;
    }

    public void setSexEnum(Sex sexEnum) {
        this.sexEnum = sexEnum;
    }

    public People(String name, int age, Sex sexEnum) {
        this.name = name;
        this.age = age;
        this.sexEnum = sexEnum;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sexEnum=" + sexEnum +
                '}';
    }

    @Override
    public int compare(People o1, People o2) {
//        if (o1.getSexEnum()..equals(o2.getSex().getItem()))
//            return 0;
//        else if (o1.getSex().getItem().equals("man"))
//            return 1;
//        else
        return -1;
    }
}

