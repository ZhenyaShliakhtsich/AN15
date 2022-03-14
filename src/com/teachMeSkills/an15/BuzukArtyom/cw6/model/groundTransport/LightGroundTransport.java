package com.teachMeSkills.an15.BuzukArtyom.cw6.model.groundTransport;

import com.teachMeSkills.an15.BuzukArtyom.cw6.model.groundTransport.GroundTransport;

public class LightGroundTransport extends GroundTransport {
    private String type;
    private int countPassengers;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }
}
