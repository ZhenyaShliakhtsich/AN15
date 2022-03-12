package com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument;

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar() {
        nameObject = "Гитара";
    }

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        nameObject = "Гитара";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

}
