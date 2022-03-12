package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Service.Impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Instruments.Guitar;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Instruments.Instrument;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Service.InstrumentService;

public class GuitarInstrumentServiceImpl implements InstrumentService {
    @Override
    public void play() {

    }
    public void play(Guitar guitar){
        System.out.println("Играет гитара с " + guitar.getCountOfStrings() + " струнами");
    }

}
