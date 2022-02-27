package com.teachMeSkills.an15.BuzukArtyom.hw3.zadacha8;

public class Main {
    public static void main(String[] args) {
//        Создайте класс Phone, который содержит переменные number, model и weight.
// Создайте три экземпляра этого класса.
// Выведите на консоль значения их переменных.
// Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
// Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
// Вызвать эти методы для каждого из объектов.
// Добавить конструктор в класс Phone, который принимает на вход три параметра
// для инициализации переменных класса - number, model и weight.
// Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
// Добавить конструктор без параметров.
// Вызвать из конструктора с тремя параметрами конструктор с двумя.
// Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
// Вызвать этот метод.
// Создать метод sendMessage с аргументами переменной длины.
// Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.

        Phone phone1 = new Phone(1234567, "Apple", 120);

        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);
        System.out.println();

        Phone phone2 = new Phone(4864567, "Samsung");
        phone2.setNumber(4864567);
        phone2.model = "Samsung";
        //  phone2.weight = 123;

        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);
        System.out.println();

        Phone phone3 = new Phone();
//        phone3.number = 1298467;
//        phone3.model = "Nokia";
//        phone3.weight = 132;

        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);
        System.out.println();

        phone1.receiveCall("Ivan");
        phone2.receiveCall("Petr");
        phone3.receiveCall("Sergei");

        phone1.receiveCall("Ivan", 1234567);

        phone1.sendMessage("Сообщение 1 ", phone1.getNumber(), phone2.getNumber());
        phone1.sendMessage("Сообщение 2 ", 54661516);
    }
}
