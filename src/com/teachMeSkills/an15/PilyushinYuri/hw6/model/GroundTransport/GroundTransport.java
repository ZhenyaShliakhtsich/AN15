package com.teachMeSkills.an15.PilyushinYuri.hw6.model.GroundTransport;

import com.teachMeSkills.an15.PilyushinYuri.hw6.model.Transport;

public abstract class GroundTransport extends Transport {
    protected int wheel;
    protected int averageFuel;

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getAverageFuel() {
        return averageFuel;
    }

    public void setAverageFuel(int averageFuel) {
        this.averageFuel = averageFuel;
    }
}
