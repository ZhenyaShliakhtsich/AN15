package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2ForNormalPeoples;

public class MyDrum  implements MyInstrumentService{
    final String NAME = "DRUM";
    int parameter;

    public MyDrum(int parameter) {
        this.parameter = parameter;
    }

    @Override
    public void play() {
        System.out.println(this.NAME + " размер - " + parameter);
    }
}
