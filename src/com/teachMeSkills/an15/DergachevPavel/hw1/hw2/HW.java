package com.company;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class HW {

    public static void main(String[] args) {
        //Задание 2 НЕТ
        //задание3
        for (int i = 0; i < 100; ) {
            i = i + 5;
            System.out.println(i);
        }

        //Задание4
        //Есть 30 монет. Одна из них (рандомно заданная) является счастливой.
        // Найти в цикле счастливую.Если монета не счастливая,
        // выводить в консоль «надеюсь следующая будет счастливая + номер монеты».
        // Если дошли до счастливой, вывести «счастливая монета номер n найдена» и завершить цикл
        int a = (int) ( Math.random() * 31);
        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Угадайте счасливую монету:");
        int b = scanner.nextInt();
        if (a == b){
            System.out.println("счастливая монета номер " + a + " найдена!");}
        if (b > 30 ){
            System.out.println("Нужно было выбрать с 1 до 30");
        }
        else {
            System.out.println("надеюсь следующая будет счастливая, " + a);
        }


//Задание5
        for (int i=1; i <= 10; ++i)
            System.out.println(i);

        for (int i = 10 ; i > 0; --i)
            System.out.println(i);



        //Задание6
        for (int i=1; i < 11; i++)
            System.out.println("7 * " + i + " = " + i * 7);







    }}