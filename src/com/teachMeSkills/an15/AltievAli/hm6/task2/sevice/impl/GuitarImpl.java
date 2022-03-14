package com.teachMeSkills.an15.AltievAli.hm6.task2.sevice.impl;

import com.teachMeSkills.an15.AltievAli.hm6.task2.sevice.InstrumentService;

public class GuitarImpl implements InstrumentService {
    private static int kolichestvoStrun;


    public void setKolichestvoStrun(int kolichestvoStrun) {
        GuitarImpl.kolichestvoStrun = kolichestvoStrun;
    }

    @Override
    public void play() {
        System.out.println("Plays guitar with cord quantity: " + kolichestvoStrun);
    }
}
