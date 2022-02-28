package com.teachMeSkills.an15.BuzukArtyom.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("первое число");
        int num1 = scanner.nextInt();
        System.out.println("второе число");
        int num2 = scanner.nextInt();

       // int num3 = (num1+num2)%2==0? num1+num2:num1+num2+1;
//тернарный оператор        условие? true:else
    int num3 = calculateSum(num1,num2);
    int num4 = calculateDiff(num1,num2);
        System.out.println(num3);
        System.out.println(num4);

    }

    private static int calculateDiff(int num1, int num2) {
        int num3 = (num1-num2)%2==0? num1-num2:num1-num2-1;
        return num3;
    }

    private static int calculateSum(int num1, int num2) {
        int num3 = (num1+num2)%2==0? num1+num2:num1+num2+1;
        return num3;
    }


}
