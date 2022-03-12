package com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument;

public class Trumpet extends Instrument {
    private int diameter;

    public Trumpet() {
        nameObject = "Труба";
    }

    public Trumpet(int diameter) {
        this.diameter = diameter;
        nameObject = "Труба";
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

}
