package com.teachMeSkills.an15.PilyushinYuri.hw6.model.AirTransport;

public class CivilAirTransport extends AirTransport {
    private int passenger;
    private boolean bissnesClass;

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public boolean isBissnesClass() {
        return bissnesClass;
    }

    public void setBissnesClass(boolean bissnesClass) {
        this.bissnesClass = bissnesClass;
    }
}
