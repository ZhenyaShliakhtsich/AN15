package com.teachMeSkills.an15.MatveevArtyom.hw5.Task3;

public class HourlyWorker extends Worker{
    private int hourlyPayment;

    public HourlyWorker(String name, int id, int hourlyPayment) {
        super(name, id);
        this.hourlyPayment = hourlyPayment;
    }

    @Override
    public double paymentOfMonth() {
        return 20.8 * 8 * hourlyPayment;
    }

    public int getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(int hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    @Override
    public String toString() {
        return super.toString() + " c почасовой зп = " + paymentOfMonth();
    }
}
