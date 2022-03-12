package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2ForNormalPeoples;

public class MyGuitare implements MyInstrumentService{
    final String NAME = "GUITARE";
    int parameter;

    public MyGuitare(int parameter) {
        this.parameter = parameter;
    }

    @Override
    public void play() {
        System.out.println(this.NAME + " струн - " + parameter);
    }
}
