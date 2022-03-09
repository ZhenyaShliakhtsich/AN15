package com.teachMeSkills.an15.TuskalSergey.hw5.Task3;

public abstract class Workers {
    int id;
    String name;

    public Workers(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    abstract double calculateAveragePayment();

    @Override
    public String toString() {
        return "Workers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public double getAveragePayment() {
        return calculateAveragePayment();
    }
}
