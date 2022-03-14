package com.teachMeSkills.an15.BuzukArtyom.cw6.model.airTranport;

public class CivilAirTransport extends AirTransport{
    private int countPassengers;
    private boolean isBissnes;

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public boolean isBissnes() {
        return isBissnes;
    }

    public void setBissnes(boolean bissnes) {
        isBissnes = bissnes;
    }
}
