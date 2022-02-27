package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw3;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Задание 1
        System.out.println("Введите размер вклада");
        double dep = sc.nextDouble();
        System.out.println("Введите срок");
        int term = sc.nextInt();
        for (int i = 1; i <= term; i++) {
            dep = dep * 1.07;
        }
        int i = 0;
        while (i != term) {//Задание 2
            dep = dep * 1.07;
            i++;
        }
        System.out.println("Итоговая сумма: " + dep);
    }
}
