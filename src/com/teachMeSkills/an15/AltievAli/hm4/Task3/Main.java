package com.teachMeSkills.an15.AltievAli.hm4.Task3;

public class Main {

    public static void main(String[] args) {


        int a = 1;
        int b = 1;
        int c;


        for (int i = 1; i <= 60; i++) {

            c = a + b;
            a = b;
            b = c;
            System.out.print(b + " ");


        }


    }


}


