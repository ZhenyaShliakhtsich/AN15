package com.teachMeSkills.an15.classes.class3;


import java.util.Arrays;
import java.util.Objects;

public class Gruppa {
    Student[] student;
    String name;

    public Gruppa(Student[] student, String name) {
        this.student = student;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gruppa{" +
                "student=" + Arrays.toString(student) +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gruppa gruppa = (Gruppa) o;
        return Arrays.equals(student, gruppa.student) && Objects.equals(name, gruppa.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(student);
        return result;
    }
}
