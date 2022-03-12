package com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.service.imp;

import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Drum;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Guitar;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Trumpet;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.service.InstrumentService;

public class GuitarInstrumentServiceImpl implements InstrumentService {
    @Override
    public void play(Guitar guitar) {
        System.out.format("Играет гитара с %s\n",
                guitar.getNumber(guitar.getNumberOfStrings(),
                        new String[]{"струной", "струнами", "струнами"}));
    }

    @Override
    public void play(Drum drum) {

    }

    @Override
    public void play(Trumpet trumpet) {

    }
}
