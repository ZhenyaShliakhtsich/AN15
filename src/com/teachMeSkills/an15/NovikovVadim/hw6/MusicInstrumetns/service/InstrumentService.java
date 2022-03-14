package com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.service;

import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Drum;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Guitar;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Trumpet;

public interface InstrumentService {
    String KEY = "До мажор";

    void play(Guitar guitar);

    void play(Drum drum);

    void play(Trumpet trumpet);

}
