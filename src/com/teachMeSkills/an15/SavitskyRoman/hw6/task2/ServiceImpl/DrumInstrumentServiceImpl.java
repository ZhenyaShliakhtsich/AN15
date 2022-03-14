package com.teachMeSkills.an15.SavitskyRoman.hw6.task2.ServiceImpl;

import com.teachMeSkills.an15.SavitskyRoman.hw6.task2.Instrument;
import com.teachMeSkills.an15.SavitskyRoman.hw6.task2.InstrumentService;

public class DrumInstrumentServiceImpl implements InstrumentService {

    @Override
    public void play(Instrument instrument) {
        System.out.println("Играет: " + instrument.getName() + ". Барабан размером: "
                + instrument.getCharacteristic());

    }
}
