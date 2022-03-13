package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.Instrumenti;

public class Tube extends Instrument {
    protected int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "diameter=" + diameter +
                '}';
    }
}
