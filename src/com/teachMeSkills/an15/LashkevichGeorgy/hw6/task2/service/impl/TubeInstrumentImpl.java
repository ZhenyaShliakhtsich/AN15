package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.Instrumenti.Tube;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.TubeInstrumentService;

public class TubeInstrumentImpl implements TubeInstrumentService {

    @Override
    public void play(Tube tube) {
        System.out.println("Играет труба с характеристикой: " + tube.getDiameter() + " диаметра в " + key);
    }
}
