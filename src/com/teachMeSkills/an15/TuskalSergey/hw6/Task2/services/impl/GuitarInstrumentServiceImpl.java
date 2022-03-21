package com.teachMeSkills.an15.TuskalSergey.hw6.Task2.services.impl;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.instruments.Instrument;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.services.InstrumentService;

public class GuitarInstrumentServiceImpl implements InstrumentService {
    @Override
    public void play(Instrument instrument) {
        System.out.println("Играет гитара с количеством струн " + instrument.getCountStrun());
    }
}
