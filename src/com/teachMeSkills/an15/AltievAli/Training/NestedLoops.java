package com.teachMeSkills.an15.AltievAli.Training;

import java.security.PublicKey;

public class NestedLoops {

    public static void main(String[] args) {

        nestedLoop();
    }

    public static void nestedLoop() {

        for (int i = 0; i <= 23; i++) {//outer loop
            System.out.println("Start of outer loop is here......");
            for (int e = 0; e <= 59; e++) {
                System.out.println(i + " : " + e);

            }
            System.out.println("End of outer loop is here......");


        }



    }

}


