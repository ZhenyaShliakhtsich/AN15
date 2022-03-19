package com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.airTransport;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.Transport;

public abstract class AirTransport extends Transport {
    protected int wingSize;
    protected int length;

    public int getWingSize() {
        return wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
