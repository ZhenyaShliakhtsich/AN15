package com.teachMeSkills.an15.AltievAli.hm2;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        ///Version 1

//        StringBuilder stringBuilder = new StringBuilder();
//        int i = 5;
//
//        do {
//            i += 5;
//            System.out.println(stringBuilder.append(i).append(","));
//        } while (i < 100);


        /////// Version 2

        StringBuilder newStringBuilder = new StringBuilder();

        for (int i1 = 5; i1 <= 100; i1 += 5) {
            newStringBuilder.append(i1).append(" ");

        }
        System.out.println(newStringBuilder);


        ///Task with Coins

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


    }


}


