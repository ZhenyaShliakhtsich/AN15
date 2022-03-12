package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.implementations.SvDrumInstrumentServiceImp;

public class SvInstrumentDrum extends SvInstrument {
    int size;
    SvDrumInstrumentServiceImp impl;

    public SvInstrumentDrum() {
        impl = new SvDrumInstrumentServiceImp();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println(impl.play() + "размером " + size);
    }
}
