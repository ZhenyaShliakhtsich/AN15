package com.teachMeSkills.an15.NovikovVadim.hw3;

import java.util.Arrays;
import java.util.Objects;

public class Phone {
//    Создайте класс Phone, который содержит переменные number, model и weight.
//    Создайте три экземпляра этого класса.
//    Выведите на консоль значения их переменных.
//    Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
//    Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//    Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//    Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//    Добавить конструктор без параметров.
//    Вызвать из конструктора с тремя параметрами конструктор с двумя.
//    Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//    Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
//    Метод выводит на консоль номера этих телефонов.

    String number;
    String name;
    float weight;

    public Phone() {
        number = "0";
        name = "";
        weight = 0;
    }

    public Phone(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public Phone(String number, String name, float weight) {
        this(number, name);
        this.weight = weight;
    }

    public String getNumber() {
        return this.number;
    }

    public void sendMessage(String... number) {
        System.out.println("Номера получателей сообщений: " + Arrays.toString(number));
    }

    public void receiveCall(String name) {
        System.out.println("Имя :{" + name + "}");
    }

    public void receiveCall(String name, String number) {
        System.out.println("Имя: {" + name + "} " + " номер {" + number + "}");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number && Float.compare(phone.weight, weight) == 0 && Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, weight);
    }
}
