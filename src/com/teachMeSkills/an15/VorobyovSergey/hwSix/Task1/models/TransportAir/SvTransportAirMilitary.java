package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportAir;

public class SvTransportAirMilitary extends SvTransportAir {
    private int rocketNumber;
    private boolean ejectionSystem;

    public int getRocketNumber() {
        return rocketNumber;
    }

    public void setRocketNumber(int rocketNumber) {
        this.rocketNumber = rocketNumber;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    @Override
    public String toString() {
        return super.toString() +
                "TransportAirMilitary{" +
                "rocketNumber=" + rocketNumber +
                ", ejectionSystem=" + ejectionSystem +
                '}';
    }
}
