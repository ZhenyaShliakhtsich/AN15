package com.teachMeSkills.an15.PilyushinYuri.hw6.model.AirTransport;

public class MilitaryAirTransport extends  AirTransport{
    private boolean catapult;
    private int launch;

    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public int getLaunch() {
        return launch;
    }

    public void setLaunch(int launch) {
        this.launch = launch;
    }
}
