package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportGround;

public class SvTransportGroundPassenger extends SvTransportGround {
    private String bodyType;
    private int passengersNumber;

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                "TransportGroundPassenger{" +
                "bodyType='" + bodyType + '\'' +
                ", passengersNumber=" + passengersNumber +
                '}';
    }
}
