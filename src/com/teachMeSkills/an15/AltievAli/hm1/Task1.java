package com.teachMeSkills.an15.AltievAli.hm1;

public class Task1 {

    public static void main(String[] args) {


        /// Solution with if Statement

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;


        int minNumber = number3;
        int maxNumber = number1;

        if (minNumber > number2) {
            minNumber = number2;
        }
        if (minNumber > number1) {
            minNumber = number1;
        }
        System.out.println("Minimum Number" + " " + minNumber);


        if (maxNumber < number2) {
            maxNumber = number2;
        }
        if (maxNumber < number3) {
            maxNumber = number3;
        }
        System.out.println("Maximum Number" + " " + maxNumber);




        ///Solution with  Method Math

        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        int mathMin = Math.min(Math.min(n1, n2), n3);
        int mathMax = Math.max(Math.max(n1, n2), n3);

        System.out.println(mathMin);
        System.out.println(mathMax);


    }

}

