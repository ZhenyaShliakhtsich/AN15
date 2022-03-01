package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw4;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите, сколько чисел из последовательности вывести");
        int n = sc.nextInt();
        StringBuilder str = new StringBuilder();
        str.append(a).append(" ").append(b).append(" ");
        for (int i = 0; i <= n - 2; i++){
            c = a + b;
            str.append(c).append(" ");
            a = b;
            b = c;
        }
        System.out.println(str);
    }
}
