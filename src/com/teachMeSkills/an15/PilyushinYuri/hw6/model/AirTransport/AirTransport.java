package com.teachMeSkills.an15.PilyushinYuri.hw6.model.AirTransport;

import com.teachMeSkills.an15.PilyushinYuri.hw6.model.Transport;

public abstract class AirTransport extends Transport {
    protected int wingspan;
    protected int minRunway;

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinRunway() {
        return minRunway;
    }

    public void setMinRunway(int minRunway) {
        this.minRunway = minRunway;
    }
}
