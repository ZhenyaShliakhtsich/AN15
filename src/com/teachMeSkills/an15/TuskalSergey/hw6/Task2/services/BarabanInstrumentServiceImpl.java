package com.teachMeSkills.an15.TuskalSergey.hw6.Task2.services;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.instruments.Instrument;

public class BarabanInstrumentServiceImpl implements InstrumentService {
    @Override
    public void play(Instrument instrument) {
        System.out.println("Играет барабан с размером " + instrument.getRazmer());
    }
}
