package com.teachMeSkills.an15.LashkevichGeorgy.hw3;


import java.util.Arrays;

//6. Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
// Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

public class ArraySix {
    public static void main(String[] args) {
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (java.lang.Math.random() * 4 - 2);
        }
        System.out.println(Arrays.toString(array));
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int abs : array) {
            if (abs == -1) {
                count1++;
            } else if (abs == 0) {
                count2++;
            } else if (abs == 1) {
                count3++;
            }
        }
        int[] subArray = new int[]{count1, count2, count3};
        int num = 0;
        int count4 = 0;
        int max = (java.lang.Math.max(count1, java.lang.Math.max(count2, count3)));
        for (int i = 0; i < subArray.length; i++) {
            if (subArray[i] == max) {
                count4++;
                num = i;
            }
        }
        if (count4 == 1) {
            if (num == 0) num = -1;
            else if (num == 1) num = 0;
            else if (num == 2) num = 1;
            System.out.println("Цифра " + num + " повторяется " + max + " раз");
        }


    }

}

