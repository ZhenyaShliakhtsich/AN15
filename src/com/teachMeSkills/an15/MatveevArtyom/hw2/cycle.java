package com.teachMeSkills.an15.MatveevArtyom.hw2;

import java.util.Random;

public class cycle {
    public static void main(String[] args) {
        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100
        //Использовать StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 5; i < 101; i += 5) {
            stringBuilder.append(i + " ");
        }
        System.out.println(stringBuilder);
        //Есть 30 монет. Одна из них (рандомно заданная) является счастливой.
        //Найти в цикле счастливую. Если монета не счастливая,
        //выводить в консоль «надеюсь следующая будет счастливая + номер монеты».
        //Если дошли до счастливой, вывести «счастливая монета номер n найдена» и завершить цикл
        Random random = new Random();
        int randomCoin = random.nextInt(31);
        if (randomCoin == 0) randomCoin++;
        for (int i = 1; i < 31; i++) {
            if (i != randomCoin) System.out.println("Надеюсь следующая будет счастливая " + i);
            else if (i == randomCoin){
                System.out.println("Счастливая монета номер " + i + " найдена!");
                break;
            }
        }
        //Вывести в цикле числа от 1 до 10.
        //Вывести в цикле числа от 10 до 0.
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Вывести в консоль таблицу умножения для числа 7.
        // Пример 7 * 1 = 7
        //7 * 2 = 14 и тд до 7 * 10 = 70
        for (int i = 1; i < 11; i++) {
            System.out.println("7 * " + i + " = " + 7 * i);
        }
    }
}
