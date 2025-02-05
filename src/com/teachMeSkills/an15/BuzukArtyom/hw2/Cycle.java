package com.teachMeSkills.an15.BuzukArtyom.hw2;

public class Cycle {
    public static void main(String[] args) {
//    Задача на циклы
//
//    Необходимо, чтоб программа выводила на экран вот такую последовательность:
//            5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100
//    Использовать StringBuilder


        StringBuilder stringBuilder = new StringBuilder();
        for (int five = 5; five <= 100; five += 5) {
            stringBuilder.append(five + " ");
        }
        System.out.println(stringBuilder);
        System.out.println("---------------------------------");
//    Есть 30 монет. Одна из них (рандомно заданная) является счастливой. Найти в цикле счастливую.
//    Если монета не счастливая, выводить в консоль «надеюсь следующая будет счастливая + номер монеты».
//    Если дошли до счастливой, вывести «счастливая монета номер n найдена» и завершить цикл
        int i = 1;
        int x = (int) (1 + Math.random() * 30);
        while (i < 31) {

            if (i == x) {
                System.out.println("Счастливая монета номер " + i + " найдена");
                break;
            }
            System.out.println("надеюсь следующая будет счастливая " + i);
            i++;
        }
//    Вывести в цикле числа от 1 до 10.
//    Вывести в цикле числа от 10 до 0.
        System.out.println("----------------------------");
        for (int i1 = 1; i1 < 11; i1++) {
            System.out.println(i1);
        }
        System.out.println("----------------------------");
        for (int i2 = 10; i2 > -1; i2--) {
            System.out.println(i2);
        }
        System.out.println("----------------------------");
//    Вывести в консоль таблицу умножения для числа 7. Пример 7 * 1 = 7
//            7 * 2 = 14 и тд до 7 * 10 = 70

        for (int i3 = 1; i3 < 11; i3++) {
            System.out.println("7 * " + i3 + " = " + 7 * i3);
        }
    }
}
