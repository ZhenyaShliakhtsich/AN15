package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task1;

abstract class AirTransport extends Transport {
    protected int stripLength;
    protected double wingSpan;

    @Override
    String showTransportCharacteristics() {
        return super.showTransportCharacteristics() +
                "\n   stripLength = " + stripLength +
                "\n   wingSpan = " + wingSpan;
    }

    public int getStripLength() {
        return stripLength;
    }

    public void setStripLength(int stripLength) {
        this.stripLength = stripLength;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
