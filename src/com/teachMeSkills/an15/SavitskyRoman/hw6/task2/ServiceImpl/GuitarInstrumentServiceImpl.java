package com.teachMeSkills.an15.SavitskyRoman.hw6.task2.ServiceImpl;

import com.teachMeSkills.an15.SavitskyRoman.hw6.task2.Instrument;
import com.teachMeSkills.an15.SavitskyRoman.hw6.task2.InstrumentService;

public class GuitarInstrumentServiceImpl implements InstrumentService {
    @Override
    public void play(Instrument instrument) {
        System.out.println("Играет: " + instrument.getName() + ". В гитаре количесвто струн: "
                + instrument.getCharacteristic());
    }
}
