package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Service.Impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Instruments.Drum;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Service.InstrumentService;

public class DrumInstrumentServiceImpl implements InstrumentService {
    @Override
    public void play() {

    }
    public void play(Drum drum){
        System.out.println("Играет барабан размера " + drum.getSize());
    }
}
