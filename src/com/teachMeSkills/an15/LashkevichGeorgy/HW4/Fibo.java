package com.teachMeSkills.an15.LashkevichGeorgy.HW4;

public class Fibo {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        while (num1 < 200){
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;

        }
    }
}
