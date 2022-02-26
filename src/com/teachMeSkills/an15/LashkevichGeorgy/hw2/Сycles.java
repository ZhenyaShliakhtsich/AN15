package com.teachMeSkills.an15.LashkevichGeorgy.hw2;


import java.util.Scanner;

public class Сycles {
    public static void main(String[] args) {

        // Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100
        //Использовать StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        int a = 0;
        do {
            a += 5;
            stringBuilder.append(a + " ");
        }
        while (a < 100);
        System.out.println(stringBuilder);

        System.out.println("-----------------");

        // Есть 30 монет. Одна из них (рандомно заданная) является счастливой. Найти в цикле счастливую.
        // Если монета не счастливая, выводить в консоль «надеюсь следующая будет счастливая + номер монеты».
        // Если дошли до счастливой, вывести «счастливая монета номер n найдена» и завершить цикл

        int rand = (int) (Math.random() * 30) + 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Первая попытка: ");

        while (true) {
            int moneta = scan.nextInt();
            if (moneta == rand) {
                System.out.println("Счастливая монета номер " + rand + " найдена");
                break ;
            } else {
                System.out.println("Надеюсь, следующая будет счастливая " + rand);
            }
        }



        //Вывести в цикле числа от 1 до 10.
        //Вывести в цикле числа от 10 до 0.
        System.out.println("-----------------");
        System.out.println("Вывести от 1 до 10: ");

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Вывести от 10 до 0: ");
        System.out.println();
        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        //Вывести в консоль таблицу умножения для числа 7.
        for (int i = 0; i <= 10; i++) {
            System.out.println(7 + " * " + i + " = " + i * 7 );
        }





    }
}
