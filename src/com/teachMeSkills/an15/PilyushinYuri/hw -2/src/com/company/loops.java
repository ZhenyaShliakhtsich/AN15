package com.company;

public class loops {
    public static void main(String[] args) {
        int num = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (num < 100) {
            stringBuilder.append(5 + num + " ");
            num = num + 5;
        }
        System.out.println(stringBuilder);

         // Задача 3.
            int num2 = 0;
            while (num2 < 11) {
                System.out.println(num2 + "*7 =" + 7 * num2);
                num2++;
            }
        // Задача 2.
        int random = 1 + (int) (Math.random() * 31);
            int num3 = 1;
            while (num3 < 31){
                if (num3 == random){
                    System.out.println("Счастливая монета номер " + random + " найдена");
                    break;
                } else {
                    System.out.println("Надеюсь следующая монета будет счастливой " + num3);
                }
                num3 ++;

            }

        }
    }

