package com.teachMeSkills.an15.TuskalSergey.hw3;

public class CallsTask {
    public static void main(String[] args) {
        //8. Создайте класс Phone, который содержит переменные number, model и weight.
// Создайте три экземпляра этого класса.
// Выведите на консоль значения их переменных.
// Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
// Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
// Вызвать эти методы для каждого из объектов.
// Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных
// класса - number, model и weight.
// Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
// number, model.
// Добавить конструктор без параметров.
// Вызвать из конструктора с тремя параметрами конструктор с двумя.
// Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер
// телефона звонящего. Вызвать этот метод.
// Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
// телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.

        Phone phone1 = new Phone(5555555, "Samsung", 105);
        System.out.println(phone1);

        Phone phone2 = new Phone(3333333, "LG", 110);
        System.out.println(phone2);

        Phone phone3 = new Phone(4444444, "Nokia", 100);
        System.out.println(phone3);

        phone1.receiveCall();
        phone2.receiveCall();
        phone3.receiveCall();
        System.out.println("phone1 - " + phone1.getNumber());
        System.out.println("phone2 - " + phone2.getNumber());
        System.out.println("phone3 - " + phone3.getNumber());

        Phone phone4 = new Phone(phone1.number, phone3.model);
        System.out.println(phone4);

        phone1.receiveCall(phone1.model, phone1.number);

        phone1.sendMessage();
        phone2.sendMessage();
        phone3.sendMessage();

    }

}
