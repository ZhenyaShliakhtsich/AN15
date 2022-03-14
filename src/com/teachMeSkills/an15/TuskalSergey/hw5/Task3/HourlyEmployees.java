package com.teachMeSkills.an15.TuskalSergey.hw5.Task3;

public class HourlyEmployees extends Workers {
    final double overallWorkingHours = 20.8 * 8;
    double hourRate;

    public HourlyEmployees(int id, String name, double hourPayment) {
        super(id, name);
        this.hourRate = hourPayment;
    }

    @Override
    double calculateAveragePayment() {
        return overallWorkingHours * hourRate;
    }

    @Override
    public String toString() {
        return super.toString() + " per hour " + calculateAveragePayment();
    }
}
