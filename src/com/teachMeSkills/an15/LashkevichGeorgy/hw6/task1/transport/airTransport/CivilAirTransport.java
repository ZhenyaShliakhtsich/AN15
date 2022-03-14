package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.transport.airTransport;

public class CivilAirTransport extends AirTransport {
    private int countPassengers;
    private boolean isBusinessClassExists;

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public boolean isBusinessClassExists() {
        return isBusinessClassExists;
    }

    public void setBusinessClassExists(boolean businessClassExists) {
        isBusinessClassExists = businessClassExists;
    }
}
