package com.teachMeSkills.an15.TuskalSergey.hw6.Task2;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.instruments.Baraban;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.instruments.Guitar;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.instruments.Instrument;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.instruments.Truba;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.services.BarabanInstrumentServiceImpl;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.services.InstrumentService;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.services.TrubaInstrumentServiceImpl;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task2.services.impl.GuitarInstrumentServiceImpl;

public class Main {

    public static void main(String[] args) {
        InstrumentService guitarService = new GuitarInstrumentServiceImpl();
        InstrumentService barabanService = new BarabanInstrumentServiceImpl();
        InstrumentService trubaService = new TrubaInstrumentServiceImpl();

        InstrumentService[] instrumentServices = {guitarService, barabanService, trubaService};


        Instrument guitar = new Guitar();
        guitar.setCountStrun(5);
        Instrument baraban = new Baraban();
        baraban.setRazmer(10);
        Instrument truba = new Truba();
        truba.setDiametr(4);

        Instrument[] instruments = {guitar, baraban, truba};

        for (int i = 0; i < instrumentServices.length; i++) {
            instrumentServices[i].play(instruments[i]);
        }
    }

}
