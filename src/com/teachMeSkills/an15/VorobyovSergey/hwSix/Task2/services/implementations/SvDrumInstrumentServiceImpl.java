package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models.SvInstrument;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.SvInstrumentService;

public class SvDrumInstrumentServiceImpl implements SvInstrumentService {

    @Override
    public void play(SvInstrument drum) {
        System.out.println("Drum play. Size = " + drum.getParameter());
    }
}