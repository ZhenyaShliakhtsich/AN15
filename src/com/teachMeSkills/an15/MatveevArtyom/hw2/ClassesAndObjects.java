package com.teachMeSkills.an15.MatveevArtyom.hw2;

public class ClassesAndObjects {
    public static void main(String[] args) {
        //Создать класс Student с такими параметрами как имя, фамилия, название экзамена, оценка по экзамену.
        //Создать 10 объектов с разными именами, оценками и названиями экзаменов
        //Переопределить toString так, чтобы в консоль выводилась фразу «Студент Иван Иванов сдал экзамен по математике на 8»
        Student student1 = new Student("Артём", "Матвеев", "по математике",8);
        System.out.println(student1);
        Student student2 = new Student("Лионеля", "Месси", "по футболу",10);
        System.out.println(student2);
        Student student3 = new Student("Никита", "Лолкин", "по алгебре",4);
        System.out.println(student3);
        Student student4 = new Student("Александр", "Пушкин", "по литературе",2);
        System.out.println(student4);
        Student student5 = new Student("Дмитрий", "Менделеев", "по химии",3);
        System.out.println(student5);
        Student student6 = new Student("Билл", "Гейтс", "по программированию",2);
        System.out.println(student6);
        Student student7 = new Student("Анатолий", "Вассерман", "по истории",4);
        System.out.println(student7);
        Student student8 = new Student("Карл", "Маркс", "по филисофии",10);
        System.out.println(student8);
        Student student9 = new Student("Игорь", "Дубков", "по BM дабл ю",1);
        System.out.println(student9);
        Student student10 = new Student("Пеп", "Гвардиола", "по тики таке",8);
        System.out.println(student10);
    }
}
