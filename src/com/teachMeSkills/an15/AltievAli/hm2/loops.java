package com.teachMeSkills.an15.AltievAli.hm2;

import java.util.Random;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        int i = 5;

        do {
            i += 5;
            System.out.println(stringBuilder.append(i).append(","));
        } while (i < 100);


///Task with coins

        // Random random = new Random(30);
        // Scanner scanner = new Scanner(System.in);


        int i1 = 5;
        for (i1 = 5; i1 < 100; i1++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }
        stringBuilder.append(" , ");
        System.out.println(stringBuilder);

    }


}
