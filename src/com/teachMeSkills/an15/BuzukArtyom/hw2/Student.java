package com.teachMeSkills.an15.BuzukArtyom.hw2;

public class Student {
    //    Классы и объекты
//
//    Создать класс Student с такими параметрами как имя, фамилия, название экзамена, оценка по экзамену.
//            Создать 10 объектов с разными именами, оценками и названиями экзаменов
//
//    Переопределить toString так, чтобы в консоль выводилась фразу «Студент Иван Иванов сдал экзамен по математике на 8»
    String name;
    String subName;
    String exam;
    int mark;

    @Override
    public String toString() {
        return "Студент " + name + " " + subName +
                " сдал экзамен по предмету " + exam +
                " на " + mark;
    }

    Student(String name, String subName, String exam, int mark) {
        this.name = name;
        this.subName = subName;
        this.exam = exam;
        this.mark = mark;


    }
}
