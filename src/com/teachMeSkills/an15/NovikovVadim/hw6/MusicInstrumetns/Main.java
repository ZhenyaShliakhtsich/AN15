package com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns;

import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Drum;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Guitar;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument.Trumpet;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.service.InstrumentService;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.service.imp.DrumInstrumentServiceImpl;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.service.imp.GuitarInstrumentServiceImpl;
import com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.service.imp.TrumpetInstrumentServiceImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        Object[] objects = new Object[3];
        objects[0] = new Drum(1);
        objects[1] = new Guitar(2);
        objects[2] = new Trumpet(5);

        InstrumentService instrumentServiceTrump = new TrumpetInstrumentServiceImpl();
        InstrumentService instrumentServiceGuitar = new GuitarInstrumentServiceImpl();
        InstrumentService instrumentServiceDrum = new DrumInstrumentServiceImpl();

        for (Object i : objects) {
            if (i.getClass() == Drum.class) {
                instrumentServiceDrum.play((Drum) i);
            } else if (i.getClass() == Trumpet.class) {
                instrumentServiceTrump.play((Trumpet) i);
            } else if (i.getClass() == Guitar.class) {
                instrumentServiceGuitar.play((Guitar) i);
            }
        }

    }
}
