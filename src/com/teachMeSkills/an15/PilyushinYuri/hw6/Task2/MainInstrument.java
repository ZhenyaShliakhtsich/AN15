package com.teachMeSkills.an15.PilyushinYuri.hw6.Task2;


import com.teachMeSkills.an15.PilyushinYuri.hw6.Task2.impl.DrumServiceImp;
import com.teachMeSkills.an15.PilyushinYuri.hw6.Task2.impl.GitarServiceImpl;
import com.teachMeSkills.an15.PilyushinYuri.hw6.Task2.impl.TrumpetServiceImpl;
import com.teachMeSkills.an15.PilyushinYuri.hw6.Task2.service.InstrumentService;

public class MainInstrument {
    public static void main(String[] args) {
        InstrumentService[] array = new InstrumentService[3];
        DrumServiceImp drumServiceImp = new DrumServiceImp();
        drumServiceImp.setSize(10);
        array[0] = drumServiceImp;
        GitarServiceImpl gitarService = new GitarServiceImpl();
        gitarService.setNumberOfStrings(5);
        array[1]= gitarService;
        TrumpetServiceImpl trumpetService = new TrumpetServiceImpl();
        trumpetService.setDiametr(15);
        array[2]= trumpetService;
        for (InstrumentService instrumentService: array){
            instrumentService.play();
        }

    }
}