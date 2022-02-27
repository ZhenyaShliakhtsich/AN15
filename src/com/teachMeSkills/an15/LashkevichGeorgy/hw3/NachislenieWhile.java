package com.teachMeSkills.an15.LashkevichGeorgy.hw3;

public class NachislenieWhile {

    public float Nachislenie(float summa, int mes) {
        while (mes != 0) {
            summa = (float) (summa * 1.07);
            mes--;
        }
        return summa;
    }
}