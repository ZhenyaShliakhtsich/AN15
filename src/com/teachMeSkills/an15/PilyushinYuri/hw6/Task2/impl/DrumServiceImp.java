package com.teachMeSkills.an15.PilyushinYuri.hw6.Task2.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw6.Task2.service.InstrumentService;

public class DrumServiceImp implements InstrumentService {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("играет барабан размером " + getSize() + " см");
    }
}
