package com.teachMeSkills.an15.LashkevichGeorgy.hw3;

public class Vichislenie {

    public double Vichislenie(double first, double second, String znak) {
        double vich = 0;
        if (znak.equals("+")) {
            vich = first + second;
        } else if (znak.equals("-")) {
            vich = first - second;
        } else if (znak.equals("*")) {
            vich = first * second;
        } else if (znak.equals("/")) {
            vich = first / second;
        }
        return vich;
    }
}
