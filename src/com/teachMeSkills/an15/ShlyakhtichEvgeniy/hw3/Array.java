package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[50];//Задание 4
        int i = 0;
        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 1) {
                array[i] = a;
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
        int zam;
        for (int b = 0; b <= 24; b++) {
            zam = array[b];
            array[b] = array[array.length - b - 1];
            array[array.length - b - 1] = zam;
        }
        System.out.println(Arrays.toString(array));

        System.out.println("=====================================");

        Random random = new Random();//Задание 5
        int[] array1 = new int[15];
        int chet = 0;
        for (int a = 0; a < 15; a++) {
            array1[a] = random.nextInt(10);
            if (array1[a] % 2 == 0) {
                chet++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("Количество чётных чисел равняется " + chet);

        System.out.println("=================================");

        int[] array2 = new int[11];//Задание 6
        int a = 0;
        int b = 0;
        int c = 0;
        for (int a1 = 0; a1 < 11; a1++) {
            array2[a1] = random.nextInt(3) - 1;
            if (array2[a1] == -1) {
                a++;
            } else if (array2[a1] == 0) {
                b++;
            } else {
                c++;
            }
        }
        System.out.println(Arrays.toString(array2));
        int max = Math.max(a, b);
        int max1 = Math.max(max, c);
        if (max1 == a && max1 == b || max1 == b && max1 == c || max1 == a && max1 == c) {
            System.out.println("============");
        } else if (max1 == a) {
            System.out.println("Чаще всего встречается -1");
        } else if (max1 == b) {
            System.out.println("Чаще всего встречается 0");
        } else System.out.println("Чаще всего встречается 1");

        System.out.println("==========");

        Scanner sc = new Scanner(System.in);//Задание 7
        String slovo = new String();
        System.out.println("Введите слово");
        slovo = sc.next();
        char[] slovo1 = slovo.toCharArray();
        boolean p = false;


        for (i = 0; i <= slovo.length() / 2 - 1; i++) {
            if (Character.compare(slovo1[i], slovo1[slovo1.length - 1 - i]) == 0) {
                p = true;
            } else {
                p = false;
                break;
            }
        }
        if (p) {
            System.out.println("Это слово- палиндром");
        } else System.out.println("Это слово не палиндром");
    }
}



