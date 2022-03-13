package com.teachMeSkills.an15.AltievAli.hm6.task2.sevice.impl;

import com.teachMeSkills.an15.AltievAli.hm6.task2.sevice.InstrumentService;

public class DrumImpl implements InstrumentService {
    private static double size;


    public void setSize(double size) {
        DrumImpl.size = size;
    }

    @Override
    public void play() {
        System.out.println("Plays instrument Drum with size: " + size + InstrumentService.KEY);
    }


}
