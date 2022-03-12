package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models.SvInstrument;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models.SvInstrumentDrum;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models.SvInstrumentGuitar;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2.models.SvInstrumentHorn;

import java.util.ArrayList;

class MainTask2 {
    public static void main(String[] args) {
        SvInstrumentDrum drum = new SvInstrumentDrum();
        drum.setSize(10);
        SvInstrumentGuitar guitar = new SvInstrumentGuitar();
        guitar.setNumberOfStrings(4);
        SvInstrumentHorn horn = new SvInstrumentHorn();
        horn.setDiameter(1);
        ArrayList<SvInstrument> instruments = new ArrayList<>();
        instruments.add(horn);
        instruments.add(guitar);
        instruments.add(drum);

        instruments.forEach(e -> e.play());
    }
}
