package com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.airTransport;

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
