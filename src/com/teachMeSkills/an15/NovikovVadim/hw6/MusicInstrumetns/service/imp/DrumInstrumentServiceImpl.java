package com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.service.imp;

import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Drum;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Guitar;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Trumpet;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.service.InstrumentService;

public class DrumInstrumentServiceImpl implements InstrumentService {
    @Override
    public void play(Guitar guitar) {

    }

    @Override
    public void play(Drum drum) {
        System.out.format("Играет барабан размером %s\n",
                drum.getNumber(drum.getSize(),
                        new String[]{"сантиметр", "сантиметра", "сантиметров"}));
    }

    @Override
    public void play(Trumpet trumpet) {

    }
}
