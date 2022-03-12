package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.implementations.SvGuitarInstrumentServiceImp;

public class SvInstrumentGuitar extends SvInstrument {
    int numberOfStrings;
    SvGuitarInstrumentServiceImp impl;

    public SvInstrumentGuitar() {
        impl = new SvGuitarInstrumentServiceImp();
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println(impl.play() + "а струн у нее " + numberOfStrings);
    }
}
