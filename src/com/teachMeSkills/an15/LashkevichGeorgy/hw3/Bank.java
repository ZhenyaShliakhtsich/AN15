package com.teachMeSkills.an15.LashkevichGeorgy.hw3;

import java.util.Scanner;

public class Bank {
    float summa;
    int month;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NachislenieIf nachislenieIf = new NachislenieIf();
        NachislenieWhile nachislenieWhile = new NachislenieWhile();
        System.out.println("Введите начальную сумму");
        float nachSumma = scanner.nextFloat();
        System.out.println("Введите количество месяцев");
        int mes = scanner.nextInt();
        System.out.println("Итоговая сумма через if: " + nachislenieIf.Nachislenie(nachSumma, mes));
        System.out.println("Итоговая сумма через while: " + nachislenieWhile.Nachislenie(nachSumma, mes));


    }

}
