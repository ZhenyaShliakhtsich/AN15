package com.teachMeSkills.an15.SavitskyRoman.hw3.task4n5n6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class GoLittleArray {
    public static void main(String[] args) {
        //task4
        StringBuilder directSequence = new StringBuilder();
        StringBuilder reverseSequence = new StringBuilder();
        int[] littleArray = new int[99];
        for (int x = 0; x < littleArray.length; x++) {
            littleArray[x] = x + 1;
            directSequence.append(littleArray[x]).append(" ");
        }
        System.out.println(directSequence);
        for (int x = littleArray.length - 1; x >= 0; x--) {
            reverseSequence.append(littleArray[x]).append(" ");
        }
        System.out.println(reverseSequence + "\n");

        //task5
        Random random = new Random();
        int[] midArray = new int[15];
        StringBuilder randomArray = new StringBuilder("Рандомный массив [0; 9]: ");
        StringBuilder evenInt = new StringBuilder("Четные элементы массива: ");
        for (int x : midArray) {
            midArray[x] = random.nextInt(10);
            randomArray.append(midArray[x]).append(" ");
            if (midArray[x] % 2 == 0) evenInt.append(midArray[x]).append(" ");
        }
        System.out.println(randomArray + "\n" + evenInt + "\n");

        //task6
        int[] midArray1 = new int[11];
        int[] counter = new int[3]; // т.к. 3 цифры только в массиве
        StringBuilder randomArray1 = new StringBuilder("Рандомный массив [-1; 1]: ");
        for (int x : midArray1) {
            midArray1[x] = random.nextInt(3) - 1;
            randomArray1.append(midArray1[x]).append(" ");
            counter[midArray1[x] + 1] = counter[midArray1[x] + 1] + 1;
        }
        System.out.println(randomArray1);
        first:
        {
            int z = 0;
            for (int i = 0; i < counter.length; i++) {
                for (int j = i + 1; j < counter.length; j++) {
                    if (counter[i] == counter[j]) {
                        break first;
                    }
                    if (j == 1) {
                        z = counter[i] > counter[j] ? i - 1 : j - 1;
                        continue;
                    }
                    if (counter[i] > counter[j] && counter[i] > counter[z + 1]) z = i - 1;
                    else if (counter[i] < counter[j] && counter[j] > counter[z + 1]) z = j - 1;
                }
            }
            System.out.println("Чаще всего встречается элемент массива: " + z);
        }
    }
}
