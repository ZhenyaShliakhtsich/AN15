package com.teachMeSkills.an15.MatveevArtyom.hw5.Task3;

public class HourlyWorker extends Worker {
    private int hourlyPayment;

    public HourlyWorker(String name, int id, int hourlyPayment) {
        this.name = name;
        this.id = id;
        this.hourlyPayment = hourlyPayment;
    }

    @Override
    public double paymentOfMonth() {
        return 20.8 * 8 * hourlyPayment;
    }

    @Override
    public String toString() {
        return super.toString() + " c почасовой зп = " + paymentOfMonth();
    }
}
