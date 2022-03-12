package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportAir;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.SvTransport;

public abstract class SvTransportAir extends SvTransport {
    protected int stripLength;
    protected double wingSpan;

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

    @Override
    public String toString() {
        return super.toString() +
                "TransportAir{" +
                "stripLength=" + stripLength +
                ", wingSpan=" + wingSpan +
                '}';
    }
}
