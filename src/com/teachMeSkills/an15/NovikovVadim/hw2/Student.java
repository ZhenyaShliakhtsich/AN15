package com.teachMeSkills.an15.NovikovVadim.hw2;

public class Student {

    //
//        Классы и объекты
//
//        Создать класс Student с такими параметрами как имя, фамилия, название экзамена, оценка по экзамену.
//        Создать 10 объектов с разными именами, оценками и названиями экзаменов
//
//        Переопределить toString так, чтобы в консоль выводилась фразу «Студент Иван Иванов сдал экзамен по математике на 8»

    String name;
    String surname;
    String nameExam;
    int mark;

    public Student(String name, String surname, String nameExam, int mark) {
        this.name = name;
        this.surname = surname;
        this.nameExam = nameExam;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Студент " + name + " " + surname + " сдал(а) экзамен по " + nameExam + " на " + mark;
    }
}
