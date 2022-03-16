package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models.SvInstrument;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.SvInstrumentService;

public class SvGuitarInstrumentServiceImpl implements SvInstrumentService {
    @Override
    public void play(SvInstrument guitar) {
        System.out.println("Guitar play. NumberOfStrings =  " + guitar.getParameter());

    }
}
