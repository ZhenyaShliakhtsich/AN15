package com.teachMeSkills.an15.LashkevichGeorgy.hw3;

public class NachislenieIf {

    public float Nachislenie(float summa, int month) {
        for (int i = 0; i < month; i++) {
            summa = (float) (summa * 1.07);
        }
        return summa;
    }
}
