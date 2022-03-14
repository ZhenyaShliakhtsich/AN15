package com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.services.impl;

import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.instruments.Instrument;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.services.InstrumentService;

public class GuitarInstrumentServiceImpl implements InstrumentService {
    @Override
    public void play(Instrument instrument) {
        System.out.println("Играет гитара с количеством струн " + instrument.getCountStrun());
    }
}
