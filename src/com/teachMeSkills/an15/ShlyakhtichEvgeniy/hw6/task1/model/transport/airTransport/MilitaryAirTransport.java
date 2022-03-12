package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.airTransport;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.airTransport.AirTransport;

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
