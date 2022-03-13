package com.teachMeSkills.an15.BuzukArtyom.cw6.model.airTranport;

public class MilitaryAirTranport extends AirTransport{
    private boolean isCatapult;
    private  int countRocket;

    public boolean isCatapult() {
        return isCatapult;
    }

    public void setCatapult(boolean catapult) {
        isCatapult = catapult;
    }

    public int getCountRocket() {
        return countRocket;
    }

    public void setCountRocket(int countRocket) {
        this.countRocket = countRocket;
    }
}
