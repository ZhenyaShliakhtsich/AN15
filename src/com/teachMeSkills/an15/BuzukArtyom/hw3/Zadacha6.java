package com.teachMeSkills.an15.BuzukArtyom.hw3;

import java.util.Random;

public class Zadacha6 {
    public static void main(String[] args) {
//    6. Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
//    Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
//    Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
        int am = 0, a0 = 0, a1 = 0;
        int[] Mas = new int[11];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) (Math.random() * 3) - 1;
            System.out.print(Mas[i] + " ");
            if (Mas[i] < 0) am++;
            if (Mas[i] == 0) a0++;
            if (Mas[i] > 0) a1++;
            if (i == Mas.length - 1) {
                if (am > a0 & am > a1)
                    System.out.println("Чаще всего встречается -1");
                if (a0 > am & a0 > a1)
                    System.out.println("Чаще всего встречается 0");
                if (a1 > am & a1 > a0)
                    System.out.println("Чаще всего встречается 1");
            }
        }
    }
}