package com.teachMeSkills.an15.VorobyovSergey.hwThree.TaskFrom4to7;

import java.util.Arrays;
import java.util.Random;

class Task5 {
    //Create random array from 0 to 9 of user size
    void zeroNineGeneratorAndOddCounter(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        int oddNumberInArray = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
            if (arr[i] % 2 == 0) {
                oddNumberInArray++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Четных чисел - " + oddNumberInArray);
    }
}
