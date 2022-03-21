package com.teachMeSkills.an15.TuskalSergey.hw6.Task2.instruments;


public abstract class Instrument {
    protected int countStrun;
    protected int razmer;
    protected int diametr;

    public Instrument() {
    }

    public Instrument(int countStrun) {
        this.countStrun = countStrun;
        this.razmer = razmer;
        this.diametr = diametr;
    }

    public int getCountStrun() {
        return countStrun;
    }

    public void setCountStrun(int countStrun) {
        this.countStrun = countStrun;
    }

    public int getRazmer() {
        return razmer;
    }

    public void setRazmer(int razmer) {
        this.razmer = razmer;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }
}
