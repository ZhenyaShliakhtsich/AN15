package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha1;

import com.teachMeSkills.an15.classes.class2.Audi;

import java.util.Scanner;

public class Legkovoy extends Nazemny {
    String tipKuzova;
    int kolPass;
    int vremya;

    public Legkovoy(int power, int maxSpeed, int weight, String brand, int kolKoles, double rashod, String tipKuzova, int kolPass) {
        super(power, maxSpeed, weight, brand, kolKoles, rashod);
        this.tipKuzova = tipKuzova;
        this.kolPass = kolPass;
    }

    public Legkovoy(int power, int maxSpeed, int weight, String brand, int kolKoles, double rashod) {
        super(power, maxSpeed, weight, brand, kolKoles, rashod);
    }

    public Legkovoy() {
    }

    public static void main(String[] args) {
        Legkovoy legkovoy = new Legkovoy();
        double range;
        double rashod;
        legkovoy.power = 200;
        legkovoy.kolPass = 5;
        legkovoy.tipKuzova = "sedan";
        legkovoy.brand = "Audi A6";
        legkovoy.maxSpeed = 250;
        legkovoy.weight = 1900;
        legkovoy.kolKoles = 4;
        legkovoy.rashod = 12;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время, которое легковой автомобиль будет двигаться с максимальной скоростью: ");
        double vremya = scanner.nextDouble();
        range = vremya * legkovoy.maxSpeed;
        rashod = range * legkovoy.rashod / 100;
        System.out.println("За время " + vremya + "ч, автомобиль " + legkovoy.brand + " двигаясь с максимальной скоростью "
                + legkovoy.maxSpeed + "км/ч проедет " + range + " км и израсходует " + rashod + " литров топлива.");

    }


    @Override
    public String toString() {
        return "Legkovoy{" +
                "tipKuzova='" + tipKuzova + '\'' +
                ", kolPass=" + kolPass +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' + ", powerKW = " + power * 0.74 + "kW" +
                '}';
    }
}
// метод для рассчета мощности в кВт имеет коэффициент 0.84 и должен иметь возможность использоваться для всех классов
// в конструкторе класса указано время(int), в рассчете обьявлено по новой с типом double
// зачем все присваивать?
// можно сделать метод для класса
// не используемый импорт из классной работы
// конструктор класса не используется (использован только пустой)