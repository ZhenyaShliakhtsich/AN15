package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.airTransport;

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
