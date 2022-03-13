package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha2.service.Impl;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha2.service.InstrumentService;

public class BarabanInstrumentServiceImpl implements InstrumentService {
    private int sizeDrum;

    public int getSizeDrum() {
        return sizeDrum;
    }

    public void setSizeDrum(int sizeDrum) {
        this.sizeDrum = sizeDrum;
    }


    @Override
    public void play() {
        System.out.println("Играет барабан,с размером " + this.sizeDrum + " см ");

    }
}
