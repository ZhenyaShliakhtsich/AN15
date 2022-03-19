package com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask;

import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.instruments.Baraban;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.instruments.Guitar;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.instruments.Instrument;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.instruments.Truba;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.services.BarabanInstrumentServiceImpl;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.services.InstrumentService;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.services.TrubaInstrumentServiceImpl;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.services.impl.GuitarInstrumentServiceImpl;

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
