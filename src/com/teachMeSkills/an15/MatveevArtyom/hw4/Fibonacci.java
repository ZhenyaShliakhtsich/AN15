package com.teachMeSkills.an15.MatveevArtyom.hw4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Через массивы и цикл
        System.out.println("Если вы хотите посчитать через массивы - нажмите 1, если через рекурсию - нажмите 2");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        switch (k){
            case 1:
                long[] arr = new long[91]; // 91, т.к далее выйдем за предел
                arr[0] = 0;
                arr[1] = 1;
                for (int i = 2; i < arr.length; i++) {
                    arr[i] = arr[i-1] + arr[i-2];
                }
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i] + " ");
                }
                break;
            case 2:
                //Через рекурсию
                for (int i = 0; i < 100; i++) {
                    System.out.println(getFibonacci(i ));
                }
                break;
            default:
                System.out.println("Вы нажали не то!");
        }

    }

    public static int getFibonacci(int n){
        if(n == 0){
            return 0;
        } else if (n == 1 || n == 2){
            return 1;
        } else {
            return getFibonacci(n-1) + getFibonacci(n-2);
        }
    }

}
