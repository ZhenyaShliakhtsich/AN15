package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha1;

import java.util.Scanner;

public class Gruzovoy extends Nazemny {
    int gruzopodyomnost;

    public Gruzovoy(int power, int maxSpeed, int weight, String brand, int kolKoles, double rashod, int gruzopodyomnost) {
        super(power, maxSpeed, weight, brand, kolKoles, rashod);
        this.gruzopodyomnost = gruzopodyomnost;
    }

    public Gruzovoy() {
    }

    public static void main(String[] args) {
        Gruzovoy gruzovoy = new Gruzovoy();
        gruzovoy.gruzopodyomnost = 2000;
        gruzovoy.power = 300;
        gruzovoy.rashod = 16;
        gruzovoy.brand = "MAZ";
        gruzovoy.maxSpeed = 120;
        gruzovoy.weight = 3000;
        gruzovoy.kolKoles = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько груза нужно загрузить? ");
        int gruz = scanner.nextInt();
        if (gruz <= gruzovoy.gruzopodyomnost)
            System.out.println("Грузовик загружен");
        else System.out.println("Вам нужен грузовик побольше");
    }
}
// зачем все присваивать?
// можно сделать метод для класса
// конструктор класса не используется (использован только пустой)
