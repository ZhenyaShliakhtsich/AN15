package com.teachMeSkills.an15.classes.class6.model.transport.groundTransport;

import com.teachMeSkills.an15.classes.class6.model.transport.Transport;

public abstract class GroundTransport extends Transport {
    protected int countWheels;
    protected double rashod;

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public double getRashod() {
        return rashod;
    }

    public void setRashod(double rashod) {
        this.rashod = rashod;
    }
}
