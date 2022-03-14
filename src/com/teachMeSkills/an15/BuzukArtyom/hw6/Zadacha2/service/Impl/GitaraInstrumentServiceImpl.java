package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha2.service.Impl;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha2.service.InstrumentService;

public class GitaraInstrumentServiceImpl implements InstrumentService {
    private int countOfStrings;

    public int getCountOfStrings() {
        return countOfStrings;
    }

    public void setCountOfStrings(int countOfStrings) {
        this.countOfStrings = countOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара,с колиством струн: " + this.countOfStrings);
    }
}
