package com.teachMeSkills.an15.PilyushinYuri.hw5.Workers;

public class FixPay extends Workers{
    double pay;

    public FixPay(String firstName, String secondName, double pay) {
        super(firstName, secondName);
        this.pay = pay;
    }


    public void setPay(double pay) {
        this.pay = pay;
    }
    @Override
    double getAveragePayment() {
        return pay;
    }

    @Override
    public String toString() {
        return "FixPay{" +
                "pay=" + pay +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
