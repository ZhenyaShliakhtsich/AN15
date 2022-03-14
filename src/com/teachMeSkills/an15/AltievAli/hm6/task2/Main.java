package com.teachMeSkills.an15.AltievAli.hm6.task2;

import com.teachMeSkills.an15.AltievAli.hm6.task2.sevice.InstrumentService;
import com.teachMeSkills.an15.AltievAli.hm6.task2.sevice.impl.DrumImpl;
import com.teachMeSkills.an15.AltievAli.hm6.task2.sevice.impl.GuitarImpl;
import com.teachMeSkills.an15.AltievAli.hm6.task2.sevice.impl.SaxophoneImpl;

public class Main {

    public static void main(String[] args) {

        GuitarImpl guitar = new GuitarImpl();
        guitar.setKolichestvoStrun(5);
        SaxophoneImpl saxophone = new SaxophoneImpl();
        saxophone.setDiameter(33.4);
        DrumImpl drum = new DrumImpl();
        drum.setSize(77.7);

        InstrumentService[] instrumentServices = new InstrumentService[3];
        instrumentServices[0] = new GuitarImpl();
        instrumentServices[1] = new SaxophoneImpl();
        instrumentServices[2] = new DrumImpl();

        for (InstrumentService instrumentService : instrumentServices) {
            instrumentService.play();
        }

    }

}
