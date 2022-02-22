package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw2;
//Классы и объекты
//
//Создать класс Student с такими параметрами как имя, фамилия, название экзамена, оценка по экзамену.
//Создать 10 объектов с разными именами, оценками и названиями экзаменов
//
//Переопределить toString так, чтобы в консоль выводилась фразу «Студент Иван Иванов сдал экзамен по математике на 8»

public class Student {
    String name;
    String surname;
    String subject;
    int grade;

    public Student(String name, String surname, String subject, int grade) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Студент " + name +
                " " + surname +
                " сдал экзамен по " + subject +
                " на " + grade ;
    }


}
