package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task0;

abstract class AirTransport extends Transport {
    int stripLength;
    double wingSpan;

    @Override
    String showTransportCharacteristics() {
        return super.showTransportCharacteristics() +
                "\n   stripLength = " + stripLength +
                "\n   wingSpan = " + wingSpan;
    }
}
