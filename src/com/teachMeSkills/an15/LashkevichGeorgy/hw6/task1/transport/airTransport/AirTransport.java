package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.transport.airTransport;

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.transport.Transport;

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
