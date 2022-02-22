package com.teachMeSkills.an15.MatveevArtyom.hw2;

public class Student {
    String name;
    String surname;
    String exam;
    int grade;

    public Student(String name, String surname, String exam, int grade) {
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Студент " + name + " " + surname + " сдал экзамен " + exam + " на " + grade;
    }
}


