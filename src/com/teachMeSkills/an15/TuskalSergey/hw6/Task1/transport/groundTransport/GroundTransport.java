package com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.groundTransport;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.Transport;

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
