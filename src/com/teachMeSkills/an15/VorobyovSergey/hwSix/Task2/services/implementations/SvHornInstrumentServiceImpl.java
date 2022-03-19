package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models.SvInstrument;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.SvInstrumentService;

public class SvHornInstrumentServiceImpl implements SvInstrumentService {
    @Override
    public void play(SvInstrument horn) {
        System.out.println("Horn play. Diameter = " + horn.getParameter());
    }
}
