package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw2;

import java.util.Random;

public class cycle {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for (int a = 0; a < 101; a = a + 5) {
            str.append(a + " ");
        }
        System.out.println(str);

        Random random = new Random();
        int num = 1;
        int lucky = random.nextInt(31) + 1;
        boolean found = false;
        while (!found) {
            if (num == lucky) {
                System.out.println("Счастливая монета номер " + lucky + " найдена");
                found = true;
            } else {
                System.out.println("Надеюсь следущая монета будет счастливой, " + num);
                num++;
            }

        }

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println("7 * " + i + " = " + i * 7);
        }
    }
}
