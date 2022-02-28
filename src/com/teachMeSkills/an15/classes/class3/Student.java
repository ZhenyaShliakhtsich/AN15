package com.teachMeSkills.an15.classes.class3;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    String firstName;
    String secondName;
    int age;
    Posechaemost[] posechaemost;

    public Student(String firstName, String secondName, int age, Posechaemost[] posechaemost) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.posechaemost = posechaemost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(secondName, student.secondName) && Arrays.equals(posechaemost, student.posechaemost);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, secondName, age);
        result = 31 * result + Arrays.hashCode(posechaemost);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", posechaemost=" + Arrays.toString(posechaemost) +
                '}';
    }
}
