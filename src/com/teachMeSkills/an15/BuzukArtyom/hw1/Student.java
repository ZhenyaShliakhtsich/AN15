package com.teachMeSkills.an15.BuzukArtyom.hw1;

public class Student {
//    Классы и объекты
//
//    Создать класс Student с такими параметрами как имя, фамилия, название экзамена, оценка по экзамену.
//            Создать 10 объектов с разными именами, оценками и названиями экзаменов
//
//    Переопределить toString так, чтобы в консоль выводилась фразу «Студент Иван Иванов сдал экзамен по математике на 8»
    String name;
    String subname;
    String exam;
    int mark;

    @Override
    public String toString() {
        return  "Студент " + name +  " " + subname +
               " сдал экзамен по предмету " + exam +
               " на " + mark ;
    }

    Student(String name, String subname, String exam, int mark){
        this.name = name;
        this.subname = subname;
        this.exam = exam;
        this.mark = mark;


    }
}
