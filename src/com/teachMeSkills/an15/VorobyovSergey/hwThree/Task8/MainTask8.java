package com.teachMeSkills.an15.VorobyovSergey.hwThree.Task8;

//8. Создайте класс Phone, который содержит переменные number, model и weight.
//        Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных.
//        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//        Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//        Вызвать эти методы для каждого из объектов.
//        Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//        Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//        Добавить конструктор без параметров.
//        Вызвать из конструктора с тремя параметрами конструктор с двумя.
//        Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//        Создать метод sendMessage с аргументами переменной длины.
//        Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
public class MainTask8 {
    public static void main(String[] args) {
        Phone iphone = new Phone(34567, "iphone", 121.1);
        Phone samsung = new Phone(12876, "samsung", 141.5);
        Phone huawei = new Phone(96574, "huawei", 100.4);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);

        iphone.receiveCall("Misha");
        samsung.receiveCall("Masha");
        huawei.receiveCall("Dasha");

        samsung.receiveCall("Grisha", 66666);

        System.out.println("Method sendMessage is working:");
        samsung.sendMessage(12345, 98765, 66665);
    }
}
