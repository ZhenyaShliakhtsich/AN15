package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2ForNormalPeoples;

public class MyHorn implements MyInstrumentService{
    final String NAME = "HORN";
    int parameter;

    public MyHorn(int parameter) {
        this.parameter = parameter;
    }

    @Override
    public void play() {
        System.out.println(this.NAME + " диаметр - " + parameter);
    }
}
