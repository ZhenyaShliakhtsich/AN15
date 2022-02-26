package com.teachMeSkills.an15.MatveevArtyom.hw3;

public class MainPhone {
    public static void main(String[] args) {
        //8. Создайте класс Phone, который содержит переменные number, model и weight.
        //Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
        // Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
        //Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
        //Вызвать эти методы для каждого из объектов. Добавить конструктор в класс Phone,
        //который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
        // Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
        //Добавить конструктор без параметров. Вызвать из конструктора с тремя параметрами конструктор с двумя.
        //Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
        //Вызвать этот метод.
        //Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
        //которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
        Phone phone1 = new Phone();
        phone1.weight = 214;
        phone1.number = 1753;
        phone1.name = "Иван";
        Phone phone2 = new Phone();
        phone2.weight = 196;
        phone2.number = 225356;
        phone2.name = "Артур";
        Phone phone3 = new Phone();
        phone3.weight = 275;
        phone3.number = 311;
        phone3.name = "Рустам";
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall(phone1.name);
        phone2.receiveCall(phone2.name);
        phone3.receiveCall(phone3.name);
        phone1.getNumber(phone1.number);
        phone2.getNumber(phone2.number);
        phone3.getNumber(phone3.number);
        phone1.receiveCall(phone1.name, phone1.number);
        phone2.receiveCall(phone2.name, phone2.number);
        phone3.receiveCall(phone3.name, phone3.number);
        phone1.sendMessage(phone1.number);
        phone2.sendMessage(phone2.number);
        phone3.sendMessage(phone3.number);
    }
}
