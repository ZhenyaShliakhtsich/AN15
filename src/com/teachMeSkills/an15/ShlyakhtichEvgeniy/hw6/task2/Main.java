package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Instruments.Drum;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Instruments.Guitar;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Instruments.Instrument;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Instruments.Trumpet;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Service.Impl.DrumInstrumentServiceImpl;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Service.Impl.GuitarInstrumentServiceImpl;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task2.Service.Impl.TrumpetInstrumentServiceImpl;


public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[5];
        Drum drum1 = new Drum();
        Drum drum2 = new Drum();
        Guitar guitar = new Guitar();
        Trumpet trumpet1 = new Trumpet();
        Trumpet trumpet2 = new Trumpet();
        drum1.setSize(10);
        drum2.setSize(13);
        guitar.setCountOfStrings(6);
        trumpet1.setDiameter(13.5);
        trumpet2.setDiameter(18);
        instruments[0] = drum1;
        instruments[1] = drum2;
        instruments[2] = guitar;
        instruments[3] = trumpet1;
        instruments[4] = trumpet2;
        DrumInstrumentServiceImpl drumInstrumentService = new DrumInstrumentServiceImpl();
        TrumpetInstrumentServiceImpl trumpetInstrumentService = new TrumpetInstrumentServiceImpl();
        GuitarInstrumentServiceImpl guitarInstrumentService = new GuitarInstrumentServiceImpl();
        for (int i = 0; i < instruments.length; i++) {
            if (instruments[i].getClass() == Drum.class) {
                drumInstrumentService.play((Drum) instruments[i]);
            } else if (instruments[i].getClass() == Trumpet.class) {
                trumpetInstrumentService.play((Trumpet) instruments[i]);
            } else {
                guitarInstrumentService.play((Guitar) instruments[i]);

            }
        }

    }


}
