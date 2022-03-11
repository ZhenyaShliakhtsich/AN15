package com.teachMeSkills.an15.MatveevArtyom.hw5.Task3;

public class FixWorker extends Worker {
    private int fixPayment;

    public FixWorker(String name, int id, int fixPayment) {
        this.name = name;
        this.id = id;
        this.fixPayment = fixPayment;
    }

    @Override
    public double paymentOfMonth() {
        return fixPayment;
    }

    @Override
    public String toString() {
        return super.toString() + " с месячной зп = " + paymentOfMonth();
    }
}
