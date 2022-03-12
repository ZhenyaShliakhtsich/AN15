package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Service.Impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Instruments.Instrument;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Instruments.Trumpet;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Service.InstrumentService;

public class TrumpetInstrumentServiceImpl implements InstrumentService {
    @Override
    public void play() {

    }
    public void play(Trumpet trumpet){
        System.out.println("Играет труба с диаметром " + trumpet.getDiameter());
    }
}
