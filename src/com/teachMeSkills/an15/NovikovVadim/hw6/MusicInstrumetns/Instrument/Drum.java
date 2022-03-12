package com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument;

public class Drum extends Instrument {
    private int size;

    public Drum() {
        nameObject = "Барабаны";
    }

    public Drum(int size) {
        this.size = size;
        nameObject = "Барабаны";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
