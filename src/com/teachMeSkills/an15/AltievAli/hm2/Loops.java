package com.teachMeSkills.an15.AltievAli.hm2;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        Задача на циклы
//
//        Необходимо, чтоб программа выводила на экран вот такую последовательность:
//        5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100
//        Использовать StringBuilder

        StringBuilder newStringBuilder = new StringBuilder();

        for (int i1 = 5; i1 <= 100; i1 += 5) {
            newStringBuilder.append(i1).append(" ");

        }
        System.out.println(newStringBuilder);


        System.out.println("/////////////////////////////////////////////////////////////////////");


//        Есть 30 монет. Одна из них (рандомно заданная) является счастливой. Найти в цикле счастливую.
//        Если монета не счастливая, выводить в консоль «надеюсь следующая будет счастливая + номер монеты».
//        Если дошли до счастливой, вывести «счастливая монета номер n найдена» и завершить цикл

        Random random = new Random();
        int num = 17;
        while (true) {
            int rNumber = random.nextInt(31);
            System.out.println("надеюсь следующая будет счастливая  " + rNumber);
            if (rNumber == num) {
                System.out.println("счастливая монета номер " + rNumber + " найдена");
                break;

            }

        }

        //полностю

        System.out.println("/////////////////////////////////////////////////////////////////////");


        //        Вывести в цикле числа от 1 до 10.

        for (int num1 = 1; num1 <= 10; num1++) {
            System.out.println(num1);
        }


        System.out.println("/////////////////////////////////////////////////////////////////////");


        //        Вывести в цикле числа от 10 до 0.
        for (int num2 = 10; num2 >= 0; num2--) {
            System.out.println(num2);


        }


        System.out.println("//////////////////////////////////////////////////////////////");
        // Version With StringBuilder

        StringBuilder bestStringBuilder = builder(7, 1);
        System.out.println(bestStringBuilder);
        StringBuilder bestStringBuilder1 = builder(7, 2);
        System.out.println(bestStringBuilder1);
        StringBuilder bestStringBuilder2 = builder(7, 3);
        System.out.println(bestStringBuilder2);
        StringBuilder bestStringBuilder3 = builder(7, 4);
        System.out.println(bestStringBuilder3);
        StringBuilder bestStringBuilder4 = builder(7, 5);
        System.out.println(bestStringBuilder4);
        StringBuilder bestStringBuilder5 = builder(7, 6);
        System.out.println(bestStringBuilder5);
        StringBuilder bestStringBuilder6 = builder(7, 7);
        System.out.println(bestStringBuilder6);
        StringBuilder bestStringBuilder7 = builder(7, 8);
        System.out.println(bestStringBuilder7);
        StringBuilder bestStringBuilder8 = builder(7, 9);
        System.out.println(bestStringBuilder8);
        StringBuilder bestStringBuilder9 = builder(7, 10);
        System.out.println(bestStringBuilder9);


        System.out.println("////////////////////////////////////////////////");

        //Version with Loop for

        int i2 = 7;
        for (int i = 1; i <= 10; i++) {


            System.out.println(i2 + " * " + i + " = " + i * i2);


        }


    }


    /// Method
    public static StringBuilder builder(int a, int b) {

        StringBuilder Str = new StringBuilder();
        Str.append(a).append(" * ").append(b).append(" = ").append(a * b);

        return Str;


    }


}



