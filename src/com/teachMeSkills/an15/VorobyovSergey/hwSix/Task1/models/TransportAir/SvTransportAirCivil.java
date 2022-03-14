package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportAir;

public class SvTransportAirCivil extends SvTransportAir {
    private int passengersNumber;
    private boolean businessClass;

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return super.toString() +
                "TransportAirCivil{" +
                "passengersNumber=" + passengersNumber +
                ", businessClass=" + businessClass +
                '}';
    }
}
