package com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.services;

import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.instruments.Instrument;

public class TrubaInstrumentServiceImpl implements InstrumentService {
    @Override
    public void play(Instrument instrument) {
        System.out.println("Играет труба с диаметром " + instrument.getDiametr());
    }
}
