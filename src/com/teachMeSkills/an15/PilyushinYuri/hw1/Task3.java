package com.teachMeSkills.an15.PilyushinYuri.hw1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        for (; true;) {
            Scanner input = new Scanner(System.in);
            System.out.println("Какой сегодня день?");
            int num = input.nextInt();
            int random =1+ (int) (Math.random() * 31);
            if (num == random) {
                System.out.println("Вы выйграли, хорошего дня");
                break;
            } else {
                System.out.println("Вы проиграли, реальная дата " + random);
                continue;
            }
        }
    }
}

// почему такой странный цикл и зачем здесь цикл
//Вы проиграли, реальная дата 0 ?