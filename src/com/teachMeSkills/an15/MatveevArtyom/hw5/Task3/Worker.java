package com.teachMeSkills.an15.MatveevArtyom.hw5.Task3;

public abstract class Worker {
    private String name;
    private int id;

    public Worker(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + " " + name;
    }

    public abstract double paymentOfMonth();
}
