package com.teachMeSkills.an15.SavitskyRoman.hw4.task3;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int[] x = new int[47];
        x[0] = 0;
        x[1] = 1;
        for (int i = 2; i < x.length; ++i) {
            x[i] = x[i - 1] + x[i - 2];
        }
        System.out.println(Arrays.toString(x));
    }
}
