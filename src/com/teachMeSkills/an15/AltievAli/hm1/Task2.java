package com.teachMeSkills.an15.AltievAli.hm1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {


        while (true) {
            System.out.println("Введите число от 1 до 100");
            Scanner scanner = new Scanner(System.in);
            int enteredNum = scanner.nextInt();

            if (enteredNum < 1 || enteredNum > 100) {

                System.out.println("Ошибка");
            } else if (enteredNum == 5 || enteredNum == 10 || enteredNum == 17 ||
                    enteredNum == 47 || enteredNum == 77 || enteredNum == 93 || enteredNum == 99) {

                System.out.println("Вы выиграли..... :)");


            } else System.out.println("Вы проиграли...!");
        }


    }
}


// где брейк, когда мы выйдем из цикла?
