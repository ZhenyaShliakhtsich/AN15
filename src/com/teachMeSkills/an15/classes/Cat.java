package com.teachMeSkills.an15.classes;

import java.util.Objects;

public class Cat {
    String name;
    int age;
    double weight;

    Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.age = 10;
    }

    Cat(String name) {
        this.name = name;
    }

    Cat() {
        this.name = "No name";
        this.age = 0;
        this.weight = 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age + " лет" +
                ", weight=" + weight + " кг" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }
}
