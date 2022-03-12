package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportGround;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.SvTransport;

public abstract class SvTransportGround extends SvTransport {
    protected int wheelNumber;
    protected double fuelConsumption;

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                "TransportGround{" +
                "wheelNumber=" + wheelNumber +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
