package com.teachMeSkills.an15.AltievAli.hm10.condition1;

public class People {
    private String name;
    private int age;
    private Enum sexEnum;

    public People(String name, int age, Enum sexEnum) {
        this.name = name;
        this.age = age;
        this.sexEnum = sexEnum;
    }

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

    public Enum getSexEnum() {
        return sexEnum;
    }

    public void setSexEnum(Enum sexEnum) {
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
}
