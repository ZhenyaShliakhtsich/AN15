package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha3;

import java.text.NumberFormat;
import java.util.Locale;

public class OnTimeZP extends Worker {
    double onTimeZP;
    static final double i = 8.0 * 20.8;

    double hourPayment;

    public OnTimeZP(int id, String firstName, String secondName, double hourPayment) {
        super(firstName, secondName, id);
        this.onTimeZP = onTimeZP;
        this.hourPayment = hourPayment;
    }

    @Override
    double getAveragePayment() {
        return hourPayment * i;
    }

    @Override
    public String toString() {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        return super.toString() + " зп с почасовой оплатой " + format.format(getAveragePayment());
    }
}
// onTimeZP не используется