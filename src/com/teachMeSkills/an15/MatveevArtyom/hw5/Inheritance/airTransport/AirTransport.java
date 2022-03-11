package com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.airTransport;

import com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.Transport;

public abstract class AirTransport extends Transport {
    protected double wingspan;
    protected double minLength;

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getMinLength() {
        return minLength;
    }

    public void setMinLength(double minLength) {
        this.minLength = minLength;
    }
}
