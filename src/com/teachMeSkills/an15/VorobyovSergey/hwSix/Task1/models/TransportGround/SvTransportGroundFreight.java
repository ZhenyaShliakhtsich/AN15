package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportGround;

public class SvTransportGroundFreight extends SvTransportGround {
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "TransportGroundFreight{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
