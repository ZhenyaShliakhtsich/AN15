package com.teachMeSkills.an15.PilyushinYuri.hw5.Workers;

public class HourPay extends  Workers{
    double oneHour;


    public HourPay(String firstName, String secondName, double oneHour) {
        super(firstName, secondName);
        this.oneHour = oneHour;

    }

    public double getOneHour() {
        return oneHour;
    }

    public void setOneHour(double oneHour) {
        this.oneHour = oneHour;
    }

    @Override
    double getAveragePayment() {
       double pay = 20.8 * 8 * oneHour;
       return pay;
    }

    @Override
    public String toString() {
        return "HourPay{" +
                "oneHour=" + getAveragePayment() +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
