package com.teachMeSkills.an15.MatveevArtyom.hw5.Task3;

public abstract class Worker {
    protected String name;
    protected int id;

    @Override
    public String toString() {
        return "id: " + id + " " + name;
    }

    public abstract double paymentOfMonth();
}
