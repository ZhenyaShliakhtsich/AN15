package com.teachMeSkills.an15.SavitskyRoman.hw6.task2;

import com.teachMeSkills.an15.SavitskyRoman.hw6.task2.ServiceImpl.DrumInstrumentServiceImpl;
import com.teachMeSkills.an15.SavitskyRoman.hw6.task2.ServiceImpl.GuitarInstrumentServiceImpl;
import com.teachMeSkills.an15.SavitskyRoman.hw6.task2.ServiceImpl.TrumpetInstrumentServiceImpl;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar();
        instruments[1] = new Drum();
        instruments[2] = new Trumpet();

        InstrumentService guitarService = new GuitarInstrumentServiceImpl();
        InstrumentService drumService = new DrumInstrumentServiceImpl();
        InstrumentService trumpetService = new TrumpetInstrumentServiceImpl();

        instruments[0].setName("Gibson Les Paul");
        instruments[0].setCharacteristic("6");

        instruments[1].setName("Alesis");
        instruments[1].setCharacteristic("10 дюймов");

        instruments[2].setName("Yamaha");
        instruments[2].setCharacteristic("20 mm");

        ArrayList<InstrumentService> ob = new ArrayList<>();
        ob.add(guitarService);
        ob.add(drumService);
        ob.add(trumpetService);

        int x = 0;
        for (InstrumentService a : ob) {
            a.play(instruments[x]);
            x++;
        }
    }
}
