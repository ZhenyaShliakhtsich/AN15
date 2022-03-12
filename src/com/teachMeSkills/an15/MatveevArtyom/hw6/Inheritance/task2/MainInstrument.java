package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task2;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task2.service.DrumInstrumentServiceImpl;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task2.service.GuitarInstrumentServiceImpl;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task2.service.InstrumentService;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task2.service.TrumpetInstrumentServiceImpl;

public class MainInstrument {
    public static void main(String[] args) {
        InstrumentService[] array = new InstrumentService[3];
        GuitarInstrumentServiceImpl guitarInstrumentService = new GuitarInstrumentServiceImpl();
        guitarInstrumentService.setCountOfStrings(6);
        array[0] = guitarInstrumentService;
        DrumInstrumentServiceImpl drumInstrumentService = new DrumInstrumentServiceImpl();
        drumInstrumentService.setSize(396);
        array[1] = drumInstrumentService;
        TrumpetInstrumentServiceImpl trumpetInstrumentService = new TrumpetInstrumentServiceImpl();
        trumpetInstrumentService.setDiameter(10);
        array[2] = trumpetInstrumentService;
        for (InstrumentService instrumentService : array) {
            instrumentService.play();
        }
    }
}
