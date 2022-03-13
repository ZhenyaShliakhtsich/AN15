package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.Instrumenti;

public class Guitar extends Instrument {
    protected int countStrings;

    public int getCountStrings() {
        return countStrings;
    }

    public void setCountStrings(int countStrings) {
        this.countStrings = countStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "countStrings=" + countStrings +
                '}';
    }
}

