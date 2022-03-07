package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha3;

import java.text.NumberFormat;
import java.util.Locale;

public class FixZP extends Worker {
    double fixZP;

    public FixZP(int id, String firstName, String secondName, double fixZP) {
        super(firstName, secondName, id);
        this.fixZP = fixZP;
    }

    @Override
    double getAveragePayment() {
        return fixZP;
    }

    @Override
    public String toString() {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        return super.toString() + " фиксированное зп " + format.format(getAveragePayment());
    }
}
