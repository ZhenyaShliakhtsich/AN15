package com.teachMeSkills.an15.LashkevichGeorgy.hw3;

import java.util.Arrays;
//4. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку,
// но в обратном порядке (99 97 95 93 … 7 5 3 1).

public class Array {


    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + i * 2;
        }

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < (array.length / 2) - 1; i++) {
            int a = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = a;
        }
        System.out.println(Arrays.toString(array));
    }

}

