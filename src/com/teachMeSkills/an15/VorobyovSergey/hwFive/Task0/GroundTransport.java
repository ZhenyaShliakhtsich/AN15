package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task0;

abstract class GroundTransport extends Transport {
    protected int wheelNumber;
    protected double fuelConsumption;

    @Override
    String showTransportCharacteristics() {
        return super.showTransportCharacteristics() +
                "\n   wheelNumber = " + wheelNumber +
                "\n   fuelConsumption = " + fuelConsumption;
    }

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
}
