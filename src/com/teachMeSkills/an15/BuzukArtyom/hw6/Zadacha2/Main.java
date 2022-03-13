package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha2;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha2.service.Impl.BarabanInstrumentServiceImpl;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha2.service.Impl.GitaraInstrumentServiceImpl;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha2.service.Impl.TrubaInstrumentServiceImpl;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha2.service.InstrumentService;

public class Main {
    public static void main(String[] args) {
        InstrumentService[] array = new InstrumentService[3];
        GitaraInstrumentServiceImpl gitaraInstrumentService = new GitaraInstrumentServiceImpl();
        gitaraInstrumentService.setCountOfStrings(5);
        array[0] = gitaraInstrumentService;
        BarabanInstrumentServiceImpl barabanInstrumentService = new BarabanInstrumentServiceImpl();
        barabanInstrumentService.setSizeDrum(20);
        array[1] = barabanInstrumentService;
        TrubaInstrumentServiceImpl trubaInstrumentService = new TrubaInstrumentServiceImpl();
        trubaInstrumentService.setSizeOfDiametr(12);
        array[2] = trubaInstrumentService;

        for (InstrumentService instrumentService : array) {
            instrumentService.play();
        }
    }
}
