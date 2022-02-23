package com.teachMeSkills.an15.LashkevichGeorgy.hw2;

import org.w3c.dom.ls.LSOutput;

public class Student {
    String name;
    String lastName;
    String examsName;
    int ocenka;

    public Student(String name, String lastName, String examsName, int ocenka) {
        this.name = name;
        this.lastName = lastName;
        this.examsName = examsName;
        this.ocenka = ocenka;
    }
    public static void main(String[] args) {
        Student stud1 = new Student("Петя", "Иванов", "русский язык", 1);
        Student stud2 = new Student("Коля", "Петров", "русский язык", 2);
        Student stud3 = new Student("Вася", "Сидоров", "русский язык", 3);
        Student stud4 = new Student("Гоша", "Петухов", "русский язык", 4);
        Student stud5 = new Student("Тоша", "Курочкин", "русский язык", 5);
        Student stud6 = new Student("Аня", "Иванова", "история", 5);
        Student stud7 = new Student("Катя", "Глухарева", "история", 4);
        Student stud8 = new Student("Юля", "Юдовна", "история", 3);
        Student stud9 = new Student("Вова", "Рудовна", "история", 2);
        Student stud10 = new Student("Тоня", "Куровна", "история", 1);

    }

    @Override
    public String toString() {
        return
                "Студент " + name + " " + lastName + " сдал экзамен по предмету " + "\"" + examsName +  "\"" + " на " + ocenka;
    }
}
