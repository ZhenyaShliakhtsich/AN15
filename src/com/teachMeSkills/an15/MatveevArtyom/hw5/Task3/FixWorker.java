package com.teachMeSkills.an15.MatveevArtyom.hw5.Task3;

public class FixWorker extends Worker {
    private int fixPayment;

    public FixWorker(String name, int id, int fixPayment) {
        super(name, id);
        this.fixPayment = fixPayment;
    }

    @Override
    public double paymentOfMonth() {
        return fixPayment;
    }

    public int getFixPayment() {
        return fixPayment;
    }

    public void setFixPayment(int fixPayment) {
        this.fixPayment = fixPayment;
    }

    @Override
    public String toString() {
        return super.toString() + " с месячной зп = " + paymentOfMonth();
    }
}
