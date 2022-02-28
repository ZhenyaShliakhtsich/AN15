package com.teachMeSkills.an15.MatveevArtyom.hw2;

import com.teachMeSkills.an15.AltievAli.hm2.StudentsOfAli;

public class ClassesAndObjects {
    public static void main(String[] args) {
        //Создать класс Student с такими параметрами как имя, фамилия, название экзамена, оценка по экзамену.
        //Создать 10 объектов с разными именами, оценками и названиями экзаменов
        //Переопределить toString так, чтобы в консоль выводилась фразу «Студент Иван Иванов сдал экзамен по математике на 8»
        StudentsOfAli student1 = new StudentsOfAli("Артём", "Матвеев", "по математике",8);
        System.out.println(student1);
        StudentsOfAli student2 = new StudentsOfAli("Лионеля", "Месси", "по футболу",10);
        System.out.println(student2);
        StudentsOfAli student3 = new StudentsOfAli("Никита", "Лолкин", "по алгебре",4);
        System.out.println(student3);
        StudentsOfAli student4 = new StudentsOfAli("Александр", "Пушкин", "по литературе",2);
        System.out.println(student4);
        StudentsOfAli student5 = new StudentsOfAli("Дмитрий", "Менделеев", "по химии",3);
        System.out.println(student5);
        StudentsOfAli student6 = new StudentsOfAli("Билл", "Гейтс", "по программированию",2);
        System.out.println(student6);
        StudentsOfAli student7 = new StudentsOfAli("Анатолий", "Вассерман", "по истории",4);
        System.out.println(student7);
        StudentsOfAli student8 = new StudentsOfAli("Карл", "Маркс", "по филисофии",10);
        System.out.println(student8);
        StudentsOfAli student9 = new StudentsOfAli("Игорь", "Дубков", "по BM дабл ю",1);
        System.out.println(student9);
        StudentsOfAli student10 = new StudentsOfAli("Пеп", "Гвардиола", "по тики таке",8);
        System.out.println(student10);
    }
}
