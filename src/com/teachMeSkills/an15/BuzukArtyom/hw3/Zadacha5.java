package com.teachMeSkills.an15.BuzukArtyom.hw3;

import java.util.Random;

public class Zadacha5 {
    public static void main(String[] args) {
//    5. Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//    Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
//    и выведете это количество на экран на отдельной строке.
        int b = 0;
        int[] Mass = new int[15];
        for (int i = 0; i < Mass.length; i++) {
            Random random = new Random();
            Mass[i] = random.nextInt(10);
            System.out.print(Mass[i] + " ");
            if (Mass[i] > 0 & Mass[i] % 2 == 0) b++;
        }

        System.out.println(" ");
        System.out.println("В массиве " + b + " чётных");

    }
}
