package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.implementations.SvHornInstrumentServiceImp;

public class SvInstrumentHorn extends SvInstrument {
    int diameter;
    SvHornInstrumentServiceImp impl;

    public SvInstrumentHorn() {
        impl = new SvHornInstrumentServiceImp();
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println(impl.play() + "диаметром " + diameter);
    }
}
