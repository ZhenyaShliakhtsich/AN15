package com.teachMeSkills.an15.AltievAli.hm6.task2.sevice.impl;

import com.teachMeSkills.an15.AltievAli.hm6.task2.sevice.InstrumentService;

public class SaxophoneImpl implements InstrumentService {

    private static double diameter;

    public void setDiameter(double diameter) {
        SaxophoneImpl.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Plays Instrument Saxophone with diameter: " + diameter + InstrumentService.KEY);
    }


}
