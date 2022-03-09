package com.teachMeSkills.an15.TuskalSergey.hw5.Task3;

public class FixPaymentWorkers extends Workers{
    double mounthPayment;

    public FixPaymentWorkers(int id, String name, double mounthPayment) {
        super(id, name);
        this.mounthPayment = mounthPayment;
    }

    @Override
    double calculateAveragePayment() {
        return mounthPayment;
    }

    @Override
    public String toString() {
        return "FixPaymentWorkers{" +
                "mounthPayment=" + mounthPayment +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
