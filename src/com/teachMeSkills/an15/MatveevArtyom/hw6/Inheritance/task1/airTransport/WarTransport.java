package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.airTransport;

public class WarTransport extends AirTransport {
    private boolean isEjectionSystem;
    private int countOfRockets;

    public boolean isEjectionSystem() {
        return isEjectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        isEjectionSystem = ejectionSystem;
    }

    public int getCountOfRockets() {
        return countOfRockets;
    }

    public void setCountOfRockets(int countOfRockets) {
        this.countOfRockets = countOfRockets;
    }
}
