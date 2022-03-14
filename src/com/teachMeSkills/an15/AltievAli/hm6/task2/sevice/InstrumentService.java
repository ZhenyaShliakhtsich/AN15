package com.teachMeSkills.an15.AltievAli.hm6.task2.sevice;

public interface InstrumentService {
    String KEY = "СМ";
    void play();

    default void playInstrument(){ //Java8
        System.out.println("Plays instrument: " );
    }
}
