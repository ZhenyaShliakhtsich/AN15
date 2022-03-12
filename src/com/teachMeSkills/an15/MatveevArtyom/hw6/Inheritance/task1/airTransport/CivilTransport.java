package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.airTransport;

public class CivilTransport extends AirTransport {
    private int countOfPassengers;
    private boolean isBusinessClass;

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        isBusinessClass = businessClass;
    }
}
