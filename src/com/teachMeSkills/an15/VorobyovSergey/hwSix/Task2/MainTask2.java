package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models.SvInstrument;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models.SvInstrumentDrum;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models.SvInstrumentGuitar;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models.SvInstrumentHorn;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.implementations.SvDrumInstrumentServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.implementations.SvGuitarInstrumentServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.services.implementations.SvHornInstrumentServiceImpl;

import java.util.ArrayList;

class MainTask2 {
    public static void main(String[] args) {
        SvInstrumentDrum drum = new SvInstrumentDrum();
        drum.setParameter(10);
        SvInstrumentGuitar guitar = new SvInstrumentGuitar();
        guitar.setParameter(4);
        SvInstrumentHorn horn = new SvInstrumentHorn();
        horn.setParameter(1);

        ArrayList<SvInstrument> instruments = new ArrayList<>();
        instruments.add(horn);
        instruments.add(guitar);
        instruments.add(drum);

        for (SvInstrument i : instruments) {
            if (i instanceof SvInstrumentHorn) {
                new SvHornInstrumentServiceImpl().play(horn);
            }
            if (i instanceof SvInstrumentDrum) {
                new SvDrumInstrumentServiceImpl().play(drum);
            }
            if (i instanceof SvInstrumentGuitar) {
                new SvGuitarInstrumentServiceImpl().play(guitar);
            }
        }
    }
}
