package com.teachMeSkills.an15.PilyushinYuri.hw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class bank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        double summa = input.nextDouble();
        System.out.println("Введите количество месяцев: ");
        int mounth = input.nextInt();
        for (int i = 0; i < mounth; i++) {
            summa = 1.07d * summa;

        }
        System.out.println(summa);

        System.out.println("//////////////////////");
        System.out.println("Введите сумму вклада: ");
        double summa2 = input.nextDouble();
        System.out.println("Введите количество месяцев: ");
        int mounth2 = input.nextInt();
        int i = 0;
        while (i < mounth2) {
            summa2 = 1.07d * summa2;
            i++;
        }
        System.out.println(summa2);

        System.out.println("/////////////////////");


        System.out.println("Введите число 1: ");
        int num1 = input.nextInt();
        System.out.println("Введите число 2: ");
        int num2 = input.nextInt();
        System.out.println("Выберите действие: ");
        System.out.println("+  -  *  /");
        String operation = input.next();
        if (operation.contains("+")) {
            System.out.println(num1 + num2);
        } else if (operation.contains("-")) {
            System.out.println(num1 - num2);
        } else if (operation.contains("*")) {
            System.out.println(num1 * num2);
        } else if (operation.contains("/")) {
            System.out.println(num1 / num2);
        }
        input.close();

        System.out.println("///////////////////");
        int[] array;
        int a = 1;
        array = new int[99];
        for (int j = 0; j < array.length; j++) {
            boolean b = a % 2 == 1;
            if (b) {
                array[j] = a;
                System.out.print(array[j] + " ");
            }
            a++;
        }


        System.out.println("///////////////////////");
        int[] array1;
        array1 = new int[15];
        int k;
        int count = 0;
        for (k = 0; k < array1.length; k++) {
            array1[k] = new Random().nextInt(10);
            Boolean b = array1[k] % 2 == 0;
            if (b) {
                count++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("Количество четных элементов = " + count);


        System.out.println("//////////////////////////");
        int[] array2;
        array2 = new int[11];

        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int c = 0; c < array1.length+1; c++) {
            array2[c] =  new Random().nextInt();
            if (array2[c] == -1) {
                count2++;
            } else if (array2[c] == 0) {
                count3++;
            } else if (array2[c] == 1) {
                count4++;
            }
        }
        int num3 = Math.max(count2, count3);
        int max = Math.max(num3, count4);
        if (max == count2) {
            System.out.println("Самый частый элемент = -1. Встречается " + count2 + " раз");
        }
        if (max == count3) {
            System.out.println("Самый частый элемент = 0. Встречается " + count3 + " раз");
        }
        if (max == count2) {
            System.out.println("Самый частый элемент = 1. Встречается " + count4 + " раз");
        }


    }
}


