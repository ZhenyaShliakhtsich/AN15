package com.teachMeSkills.an15.TuskalSergey.hw2;

public class Cycles {
    public static void main(String[] args) {
    //Необходимо, чтоб программа выводила на экран вот такую последовательность:
    //5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100
    //Использовать StringBuilder
        System.out.println("Task 1");
        StringBuilder stringBuilder = new StringBuilder();
        for (int a = 5; a <= 100; a = a + 5) {
            stringBuilder.append(" " + a);
        }
            System.out.println(stringBuilder);

    //Есть 30 монет. Одна из них (рандомно заданная) является счастливой. Найти в цикле счастливую.
    //Если монета не счастливая, выводить в консоль «надеюсь следующая будет счастливая + номер монеты».
    //Если дошли до счастливой, вывести «счастливая монета номер n найдена» и завершить цикл
        System.out.println("Task 2");
        int random_number = 1 + (int) (Math.random() * 30);
        int nextCoin = 1;
        for (int i = 1; i <=30; i++) {
            if (i == random_number) {
                System.out.println("Счастливая монета номер " + i + " найдена");
                break;
            } else nextCoin++;
                System.out.println("Надеюсь, следующая будет счастливая - номер " + nextCoin);
        }
        //Вывести в цикле числа от 1 до 10.
        //Вывести в цикле числа от 10 до 0.
        System.out.println("Task 3");

        StringBuilder stringBuilder1 = new StringBuilder();
        for (int b = 1; b <= 10; b++) {
            stringBuilder1.append(" " + b);
        }
        System.out.println(stringBuilder1);

        StringBuilder stringBuilder2 = new StringBuilder();
        for (int c = 10; c >= 0; c--) {
            stringBuilder2.append(" " + c);
        }
        System.out.println(stringBuilder2);

        //Вывести в консоль таблицу умножения для числа 7. Пример 7 * 1 = 7
        //7 * 2 = 14 и тд до 7 * 10 = 70
        System.out.println("Task 4");

        for (int d = 1; d <= 10; d++) {
            System.out.println("7 * "+ d + " = " + 7*d);
        }


        }
}
