package com.teachMeSkills.an15.MatveevArtyom.hw1;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        //1. Создать 3 целочисленные переменные и найти максимальное и минимальное значения. Вывести их в консоль. Два варианта решения

        int per1 = 7;
        int per2 = 12;
        int per3 = 19;
        // Через if
        if(per1 > per2 && per1 > per3)
        {
            System.out.println("Максимальное значение = " + per1);
        }
        else if(per2 > per1 && per2 > per3)
        {
            System.out.println("Максимальное значение = " + per2);
        }
        else if(per3 > per1 && per3 > per2)
        {
            System.out.println("Максимальное значение = " + per3);
        }
        if(per1 < per2 && per1 < per3)
        {
            System.out.println("Минимальное значение = " + per1);
        }
        if(per2 < per1 && per2 < per3)
        {
            System.out.println("Минимальное значение = " + per2);
        }
        if(per3 < per1 && per3 < per2)
        {
            System.out.println("Минимальное значение = " + per3);
        }

        //Через Math
        int max1;
        max1 = Math.max(per1, Math.max(per2,per3));
        System.out.println("Максимальное значение = " + max1);
        int min1;
        min1 = Math.min(per1,Math.min(per2,per3));
        System.out.println("Минимальное значение = " + min1);

        //2. Пользователь вводит число от 1 до 100. Если введенное число равно 5, 10, 17, 47, 77, 93, 99,
        //то вывести в консоль, что вы пользователь выиграл. Если введено было любое другое, то проиграл.
        //Если было введено не из заданного диапазона, вывести ошибку

        System.out.println("Введите число: ");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        if(num == 5 || num == 10 || num == 17 || num == 47 || num == 77 || num == 93 || num ==99)
        {
            System.out.println("Вы выиграли!");
        }
        else
        {
            System.out.println("Вы проиграли!");
        }
        if(num < 1 || num > 100)
        {
            System.out.println("Ошибка!");
        };

        //3. При запуске приложения в консоль выводится "какой сегодня день?" (от 1 до 30).
        //После того как пользователь вводит значение, значение должно сравниться с рандомно сгенерированным значением.
        //Если пользователь не угадал, вывести в консоль "не угадал, (реальный день)". Продолжить работу приложения сначала.
        //Если пользователь угадал, вывести в консоль "Угадал! Хорошего дня!" и завершить выполнение программы.

        System.out.println("Какой сегодня день?");
        Random random = new Random();
        int randomPer = random.nextInt(31);
        if(randomPer == 0) randomPer++;
        int day = console.nextInt();
        while(day != randomPer)
        {
            System.out.println("Не угадал, сейчас - " + randomPer);
            System.out.println("Какой сегодня день?");
            randomPer = random.nextInt(31);
            if(randomPer == 0) randomPer++;
            day = console.nextInt();
        }
        System.out.println("Угадал! Хорошего дня!");

        System.out.println("-------------------------");
        //В переменную записываете количество программистов. В
        //зависимости от количества программистов необходимо вывести правильно
        //окончание. Например:
        //• 2 программиста
        //• 1 программиста
        //• 10 программистов
        int n=525601;
        int ostatok=n%10;
        int ostatok_12 = n%100;
        System.out.println("ost12 = " + ostatok_12);
        if(ostatok_12>4 && ostatok_12<21)
        {
            System.out.println(n + " программистов");
        }
        else if(ostatok == 1)
        {
            System.out.println(n + " программист");
        }
        else if(ostatok == 2 || ostatok ==3 || ostatok == 4)
        {
            System.out.println(n + " программиста");
        }
        else
        {
            System.out.println(n + " программистов");
        }
    }
}


//40 и 41/43 и 44 почему так

// 2 задача неправильно if else 58 и 62 стр

// код стайл