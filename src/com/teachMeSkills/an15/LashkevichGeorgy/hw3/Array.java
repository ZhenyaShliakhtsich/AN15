package com.teachMeSkills.an15.LashkevichGeorgy.hw3;

import java.util.Arrays;

public class Array {


    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + i * 2;
        }
        String abs = Arrays.toString(array);
        System.out.println(abs);
        for (int i = 0; i < (array.length / 2) - 1; i++) {
            int a = array[array.length - i -1];
            array[array.length - i - 1] = array[i];
            array[i] = a;
        }
        String abss = Arrays.toString(array);
        System.out.println(abss);
    }

}

