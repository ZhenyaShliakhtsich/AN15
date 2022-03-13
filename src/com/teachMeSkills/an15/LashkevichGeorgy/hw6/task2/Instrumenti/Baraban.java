package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.Instrumenti;

public class Baraban extends Instrument {
    protected int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Baraban{" +
                "size=" + size +
                '}';
    }
}
