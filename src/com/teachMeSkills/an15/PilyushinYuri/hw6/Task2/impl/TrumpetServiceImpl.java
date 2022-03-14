package com.teachMeSkills.an15.PilyushinYuri.hw6.Task2.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw6.Task2.service.InstrumentService;

public class TrumpetServiceImpl implements InstrumentService {
    private int diametr;

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("играет труба диаметром " + getDiametr() + " см");
    }
}
