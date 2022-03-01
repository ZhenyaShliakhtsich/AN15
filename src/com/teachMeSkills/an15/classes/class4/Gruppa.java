package com.teachMeSkills.an15.classes.class4;

import java.util.Arrays;
import java.util.Objects;

public class Gruppa {
    Student[] students;
    String name;

    public Gruppa(Student[] students, String name) {
        this.students = students;
        this.name = name;
    }

    public Gruppa() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gruppa gruppa = (Gruppa) o;
        return Arrays.equals(students, gruppa.students) && Objects.equals(name, gruppa.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }

    @Override
    public String toString() {
        return "Gruppa{" +
                "students=" + Arrays.toString(students) +
                ", name='" + name + '\'' +
                '}';
    }


    int getCountOfStudents(Gruppa gruppa) throws MyException {
        if (gruppa.students == null) {
            throw new MyException("", 100);
        }

        return gruppa.students.length;
    }
}
