package com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask;

import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.instruments.Baraban;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.instruments.Guitar;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.instruments.Instrument;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.instruments.Truba;
import com.teachMeSkills.an15.TuskalSergey.hw6.InstrumentsTask.services.InstrumentService;

public class Main {

    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        guitar.setCountStrun(5);
        Instrument baraban = new Baraban();
        baraban.setRazmer(10);
        Instrument truba = new Truba();
        truba.setDiametr(4);

        Instrument[] instruments = {guitar, baraban, truba};

        for (int i = 0; i < instruments.length; i++) {
            InstrumentService.play(instruments[i]);
        }
    }

}





