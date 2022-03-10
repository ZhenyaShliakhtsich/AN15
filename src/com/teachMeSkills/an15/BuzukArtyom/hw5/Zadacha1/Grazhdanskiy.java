package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha1;

import java.util.Scanner;

public class Grazhdanskiy extends Vozdushniy {
    int kolPass;
    boolean biznesKlass;

    public static void main(String[] args) {
        Grazhdanskiy grazhdanskiy = new Grazhdanskiy();
        grazhdanskiy.biznesKlass = false;
        grazhdanskiy.kolPass = 50;
        grazhdanskiy.power = 500;
        grazhdanskiy.brand = "SSJ 100";
        grazhdanskiy.maxSpeed = 950;
        grazhdanskiy.weight = 24250;
        grazhdanskiy.minDlinaVPP = 12200;
        grazhdanskiy.razmahKriliev = 27.8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скалько пассажиров полетит? "); //*Сколько
        int pass = scanner.nextInt();
        if (pass <= grazhdanskiy.kolPass)
            System.out.println("Самолёт загружен, взлетаем)");
        else System.out.println("Вам нужен самолёт побольше");
    }

    public Grazhdanskiy() {
    }

    public Grazhdanskiy(int power, int maxSpeed, int weight, String brand, int razmahKriliev, int minDlinaVPP, int kolPass, boolean biznesKlass) {
        super(power, maxSpeed, weight, brand, razmahKriliev, minDlinaVPP);
        this.kolPass = kolPass;
        this.biznesKlass = biznesKlass;
    }


}
// зачем все присваивать?
// можно сделать метод ля класса( строки 22-25)
// отсутствует проверка на бизнес- класс
// конструктор класса не используется (использован только пустой)