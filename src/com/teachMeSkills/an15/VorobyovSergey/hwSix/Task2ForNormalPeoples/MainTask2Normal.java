package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task2ForNormalPeoples;

import java.util.ArrayList;

class MainTask2Normal {
    public static void main(String[] args) {
        ArrayList<MyInstrumentService> list = new ArrayList<>();
        list.add(new MyDrum(2));
        list.add(new MyHorn(1));
        list.add(new MyGuitare(6));

        list.stream().forEach(e -> e.play());
    }
}
