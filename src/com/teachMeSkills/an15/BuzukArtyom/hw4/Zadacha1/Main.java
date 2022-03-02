package com.teachMeSkills.an15.BuzukArtyom.hw4.Zadacha1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//1. Создать собственное исключение
//- Создать класс Car c полями (марка, скорость, цена), конструкторы (с
//параметрами и default).
//Создать метод старт в котором пытаетесь завести автомобиль. В методе старт
//генерируете случайное число от 0 до 20, если полученное число оказалось
//четным, то выбрасываете созданное ранее вами исключение и передаете его к
//месту откуда вызывали метод старт. Если все хорошо и исключение не
//вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой
//завелся.
//В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете
//исключение которое может вылететь при старте автомобиля
        Scanner scanner = new Scanner(System.in);
        Car nissan = new Car("Nissan Almera", 120, 12000);
        Car renault = new Car("Renault Logan", 125);
        Car lada = new Car("Lada vesta");

        try {
            nissan.start();
        } catch (StartException e) {
            System.out.println(" Машина " + nissan.marka + " не завелась ");
        }
        try {
            renault.start();
        } catch (StartException e) {
            System.out.println(" Машина " + renault.marka + " не завелась ");
        }
        try {
            lada.start();
        } catch (StartException e) {
            System.out.println(" Машина " + lada.marka + " не завелась ");
        }
    }
}
