package com.teachMeSkills.an15.BuzukArtyom.hw3;

import java.math.BigDecimal;

public class Raschet {
    double summa;
    int mes;

    public Raschet(double summa, int mes) {
        this.summa = summa;
        this.mes = mes;
    }

    public BigDecimal procent() {
        BigDecimal raschet = new BigDecimal(summa);
        for (int i = 1; i <= mes; i++) {
            raschet = raschet.add(raschet.multiply(BigDecimal.valueOf(0.07)));
        }
        return raschet;
    }

    public double toWhile() {
        BigDecimal rachet = new BigDecimal(summa);
        int x = 0;
        while (x != mes) {
            summa += summa * 0.07;
            x++;
        }
        return summa;
    }

}
