package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.Instrumenti.Baraban;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.BarabanInstrumentService;


public  class BarabanInstrumentImpl implements BarabanInstrumentService {


    @Override
    public void play(Baraban baraban){
        System.out.println("Играет барабан, с характеристикой: " + baraban.getSize() + " размером в " + key);
    }
}
