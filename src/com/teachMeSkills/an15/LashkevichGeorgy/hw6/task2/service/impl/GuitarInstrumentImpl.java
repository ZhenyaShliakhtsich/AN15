package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.Instrumenti.Guitar;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.GuitarInstrumentService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.TubeInstrumentService;

public class GuitarInstrumentImpl implements GuitarInstrumentService {


    @Override
    public void play() {

    }

    @Override
    public void play(Guitar guitar) {
        System.out.println("Играет гитара с характеристикой: " + guitar.getCountStrings() + " струн в " + key);
    }
}
