package com.teachMeSkills.an15.LashkevichGeorgy.hw3;

public class Phone {

    int number;
    String model;
    int weight;

    // Добавить конструктор, который принимает на вход два параметра
    // для инициализации переменных класса - number, model.
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    // Добавить конструктор в класс Phone, который принимает на вход
    // три параметра для инициализации переменных класса - number, model и weight.
    // +
    // Вызвать из конструктора с тремя параметрами конструктор с двумя.
    public Phone(int number, String model, int weight) {
        this(number, model);
        this.model = model;
        this.weight = weight;
    }

    //Добавить конструктор без параметров.
    public Phone() {
    }

    // Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
// Выводит на консоль сообщение “Звонит {name}”.
    public void receiveCall(String name) {

        System.out.println("Звонит " + name);
    }

    //Добавьте перегруженный метод receiveCall, который принимает два параметра
    // - имя звонящего и номер телефона звонящего. Вызвать этот метод.
    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name);
        System.out.println(number);
    }

    //Метод getNumber – возвращает номер телефона.
    public void getNumber() {
        System.out.println(number);
    }


    // Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
// которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    public void sendMessage(int i, int... arg) {
        int numbers = i;
        for (int x : arg) {
            System.out.println(x);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }


    public static void main(String[] args) {
        Phone first = new Phone(2020327, "Nokia", 2);
        System.out.println(first);
        first.receiveCall("Andy");
        first.getNumber();
        first.receiveCall("Vasya", 202235234);

        Phone second = new Phone(5555222, "Sony", 3);
        System.out.println(second);
        second.receiveCall("Tony");
        second.getNumber();
        second.sendMessage(29038423, 123123, 123567, 67845632, 2346234);

        Phone third = new Phone(6789456, "LG", 4);
        System.out.println(third);
        third.receiveCall("Mickel");
        third.getNumber();


    }
}
