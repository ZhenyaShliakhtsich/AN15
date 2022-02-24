package com.teachMeSkills.an15.SavitskyRoman.hw2;
/*Задача на циклы
Необходимо, чтоб программа выводила на экран вот такую последовательность:
5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100
Использовать StringBuilder

Есть 30 монет. Одна из них (рандомно заданная) является счастливой.
Найти в цикле счастливую. Если монета не счастливая, выводить в консоль «надеюсь следующая будет счастливая
 + номер монеты». Если дошли до счастливой, вывести «счастливая монета номер n найдена» и завершить цикл

Вывести в цикле числа от 1 до 10.
Вывести в цикле числа от 10 до 0.

Вывести в консоль таблицу умножения для числа 7. Пример 7 * 1 = 7
7 * 2 = 14 и тд до 7 * 10 = 70*/
public class Loop {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        for (int x = 5; x <= 100; x += 5){
            stringBuilder.append(x);
            if (x == 100) continue;
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder + "\n");

        int luckyCent = (int) (Math.random() * 30 + 1);
        for (int x = 1; x <= 30; x++){
            if (x == luckyCent) {
                System.out.println("Счастливая монета номер " + x + " найдена\n");
                break;
            }
                System.out.println("Надеюсь следующая будет счастливая " + x);

        }

        for (int x = 1 ; x <= 10; x++){
            if (x == 10) {
                System.out.println(x + "\n");
                continue;
            }
            System.out.print(x + " ");
        }

        for (int x = 10 ; x >= 0; x--){
            if (x == 0) {
                System.out.println(x + "\n");
                continue;
            }
            System.out.print(x + " ");
        }

        for (int x = 1; x <= 10; x++){
            int y = 7;
            int z = y * x;
            System.out.println(y + " * " + x + " = " + z);
        }

    }
}
