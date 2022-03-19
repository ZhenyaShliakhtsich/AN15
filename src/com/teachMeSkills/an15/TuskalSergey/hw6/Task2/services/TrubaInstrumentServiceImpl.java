package com.teachMeSkills.an15.TuskalSergey.hw6.Task2.services;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.instruments.Instrument;

public class TrubaInstrumentServiceImpl implements InstrumentService {
    @Override
    public void play(Instrument instrument) {
        System.out.println("Играет труба с диаметром " + instrument.getDiametr());
    }
}
