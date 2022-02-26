package com.teachMeSkills.an15.BuzukArtyom.hw3;

public class Zadacha4 {
    public static void main(String[] args) {
//    4. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
//    а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
        int x = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0)
                x++;
        }
        int[] Mass = new int[x];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                Mass[b] = i;
                System.out.print(Mass[b] + " ");
                b++;
            }

        }
        for (int i = Mass.length - 1; i >= 0; i--) {
            System.out.print(Mass[i] + " ");
        }
    }
}
