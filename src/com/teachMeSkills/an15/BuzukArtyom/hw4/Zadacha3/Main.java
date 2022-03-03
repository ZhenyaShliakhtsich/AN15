package com.teachMeSkills.an15.BuzukArtyom.hw4.Zadacha3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//в цикле вывести все числа фибоначи
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько получить первых чивел Фибоначи: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;//можно было сделать через один for
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]+" ");
        }
    }
}
