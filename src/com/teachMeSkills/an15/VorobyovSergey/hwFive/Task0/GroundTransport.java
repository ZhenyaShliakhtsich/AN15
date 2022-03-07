package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task0;

abstract class GroundTransport extends Transport {
    int wheelNumber;
    double fuelConsumption;

    @Override
    String showTransportCharacteristics() {
        return super.showTransportCharacteristics() +
                "\n   wheelNumber = " + wheelNumber +
                "\n   fuelConsumption = " + fuelConsumption;
    }
}
