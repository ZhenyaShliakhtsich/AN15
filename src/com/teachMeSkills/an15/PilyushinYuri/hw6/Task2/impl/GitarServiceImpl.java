package com.teachMeSkills.an15.PilyushinYuri.hw6.Task2.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw6.Task2.service.InstrumentService;

public class GitarServiceImpl implements InstrumentService {
    private int numberOfStrings;

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("играет гитара с " + getNumberOfStrings() + " струнами");

    }
}
