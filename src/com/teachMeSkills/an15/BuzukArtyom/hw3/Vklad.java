package com.teachMeSkills.an15.BuzukArtyom.hw3;

import java.util.Scanner;

public class Vklad {
    public static void main(String[] args) {
//        1. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//           Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
//           А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//           Вывести в консоль конечную сумму.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вашего вклада: ");
        int summa = scanner.nextInt();
        System.out.println("Введите количество месяцев: ");
        int mes = scanner.nextInt();
        Raschet raschet = new Raschet(summa, mes);
        System.out.println(raschet.procent());
        System.out.println("---------------------------------");
        System.out.println("Через while ");
        System.out.println(raschet.toWhile());

    }
}
