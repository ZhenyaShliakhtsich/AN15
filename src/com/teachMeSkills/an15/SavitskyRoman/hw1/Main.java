package com.teachMeSkills.an15.SavitskyRoman.hw1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //first task

        int x[] = {1, 10, 99}; // int[] x
        int y = 0;
        int q = 0;
        for (int z : x) {
            //if (z == x[0]) { Лишнее
                y = z;
                q = z;
            }
            y = Math.max(y, z);
            q = Math.min(q, z);
        }
        System.out.println("Максимальное значение через Math: " + y + "\n" + "Минимальное значение через Math: " + q + "\n");
        if (x[0] > x [1] && x[0] > x [2]){
            System.out.println("Максимальное значение через if: " + x[0]);
        }else if (x[1] > x [0] && x[1] > x [2]){
            System.out.println("Максимальное значение через if: " + x[1]);
        }else {
            System.out.println("Максимальное значение через if: " + x[2]);
        }
        if (x[0] < x [1] && x[0] < x [2]){
            System.out.println("Минимальное значение через if: " + x[0] + "\n");
        }else if (x[1] < x [0] && x[1] < x [2]){
            System.out.println("Минимальное значение через if: " + x[1] + "\n");
        }else {
            System.out.println("Минимальное значение через if: " + x[2] + "\n");
        }

        //second task
        int winScore[] = {5, 10, 17, 47, 77, 93, 99};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100");
        int a = sc.nextInt();
        if (a < 1 || a > 100) {
            System.out.println("Ошибка\n");
        } else {
            first: // зачем first? где second?
            {
                for (int z : winScore) {
                    if (z == a) {
                        System.out.println("Ты выиграл\n");
                        break first;
                    }
                }
                System.out.println("Ты проиграл\n");
            }
        }

        //third task
        int machineChoice;
        int yourChoice;
        do {
            machineChoice = (int) (Math.random()*30+1);
            System.out.println("Какой сегодня день");
            yourChoice = sc.nextInt();
            if (yourChoice == machineChoice) continue;
            System.out.println("Не угадал, " + machineChoice+"\n");
        } while(yourChoice != machineChoice);
        sc.close();
        System.out.println("Угадал! Хорошего дня!");
    }
}


// 1 через Math сложно