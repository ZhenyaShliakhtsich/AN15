package com.teachMeSkills.an15.LashkevichGeorgy.hw3;

import java.util.Arrays;

//5. Создайте массив из 15 случайных целых чисел из отрезка [0;9].
// Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

public class ArrayFive {


    public static void main(String[] args) {
        int[] array = new int[15];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (java.lang.Math.random() * 9);
        }
        System.out.println(Arrays.toString(array));
        for (int abs : array) {
            if (abs % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

    }

}

