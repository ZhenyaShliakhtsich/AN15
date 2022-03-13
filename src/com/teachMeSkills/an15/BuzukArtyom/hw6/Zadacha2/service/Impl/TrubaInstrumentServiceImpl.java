package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha2.service.Impl;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha2.service.InstrumentService;

public class TrubaInstrumentServiceImpl implements InstrumentService {
    private int sizeOfDiametr;

    public int getSizeOfDiametr() {
        return sizeOfDiametr;
    }

    public void setSizeOfDiametr(int sizeOfDiametr) {
        this.sizeOfDiametr = sizeOfDiametr;
    }

    @Override
    public void play() {
        System.out.println("Играет труба,с диаметром " + this.sizeOfDiametr + " см");
    }
}
