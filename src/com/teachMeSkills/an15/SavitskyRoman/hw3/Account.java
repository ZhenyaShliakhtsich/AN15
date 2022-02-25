package com.teachMeSkills.an15.SavitskyRoman.hw3;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        int account = sc.nextInt();
        System.out.println("Введите на какое количество месяцев вклад:");
        int month = sc.nextInt();
        sc.close();
        Deposit myDeposit = new Deposit(account, month);
        System.out.println(myDeposit.getAmount());

    }
}
