package com.teachMeSkills.an15.PilyushinYuri.hw1;

public class Task1 {

    public static void main(String[] args) {
        int num1 = 70;//70
        int num2 = 20;
        int num3 = 30;
        if (num1>num2 && num1>num3) {
            System.out.println("наибольшее значение num1=" + num1);
        }else if (num3>num1 && num3>num1 ) {
            System.out.println("наибольшее значение num3=" + num3);
        } else if (num2>num3 && num2>num1){
            System.out.println("наибольшее значение num2=" + num2);
        }
        if ( num1<num2 && num1<num3){
            System.out.println("минимальное значение num1 = " + num1);
        } else if (num2<num1 && num2<num3){
            System.out.println("минимальное значение num2 = " + num2);
        } else if (num3<num1 && num3<num2){
            System.out.println("минимальное значение num3 = " + num3);
        }
    }
}

// что будет если в нам1 = 70?
// где минимальное?

