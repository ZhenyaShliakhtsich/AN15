package com.teachMeSkills.an15.TuskalSergey.hw4;

public class Task3 {

    public static void main(String[] args) {

        int[] array = new int[12];
        for (int i = 0; i <= 11; i++) {
            array[i] = i;
        }
        System.out.print(array[0] + " " + array[1] + " ");

        for (int i = 2; i <= 11; i++) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.print(array[i] + " ");
        }

    }
}


