package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.airTransport;

public class MilitaryAirTransport extends AirTransport {
    private boolean isCatapultSystemExists;
    private int countRockets;

    public boolean isCatapultSystemExists() {
        return isCatapultSystemExists;
    }

    public void setCatapultSystemExists(boolean catapultSystemExists) {
        isCatapultSystemExists = catapultSystemExists;
    }

    public int getCountRockets() {
        return countRockets;
    }

    public void setCountRockets(int countRockets) {
        this.countRockets = countRockets;
    }
}
