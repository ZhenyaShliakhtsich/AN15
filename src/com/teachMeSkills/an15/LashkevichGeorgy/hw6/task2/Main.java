package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2;

//Создать интерфейс ИнструментСервис и реализующие его классы ГитараИнтструментСервисИмпл,
// БарабанИнтструментСервисИмпл и ТрубаИнтструментСервисИмпл.
//Интерфейс ИнструментСервис содержит метод play() и переменную String KEY ="До мажор".
//Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
//Создать массив типа Инструмент, содержащий инструменты разного типа.
//В цикле вызвать метод play() для каждого инструмента, который должен выводить строку "Играет такой-то инструмент,
// с такими-то характеристиками".


import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.Instrumenti.Baraban;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.Instrumenti.Guitar;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.Instrumenti.Instrument;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.Instrumenti.Tube;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.BarabanInstrumentService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.GuitarInstrumentService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.TubeInstrumentService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.impl.BarabanInstrumentImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.impl.GuitarInstrumentImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task2.service.impl.TubeInstrumentImpl;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw3.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Instrument[] instrument = new Instrument[4];
        Guitar guitar1 = new Guitar();
        guitar1.setCountStrings(12);
        Guitar guitar2 = new Guitar();
        guitar2.setCountStrings(6);
        Tube tube1 = new Tube();
        tube1.setDiameter(4);
        Baraban baraban = new Baraban();
        baraban.setSize(10);
        GuitarInstrumentService guitarInstrumentService = new GuitarInstrumentImpl();
        BarabanInstrumentService barabanInstrumentService = new BarabanInstrumentImpl();
        TubeInstrumentService tubeInstrumentService = new TubeInstrumentImpl();

        instrument[0] = guitar1;
        instrument[1] = guitar2;
        instrument[2] = tube1;
        instrument[3] = baraban;
        for (int i = 0; i < instrument.length; i++) {
            if (Arrays.toString(new Instrument[]{instrument[i]}).startsWith("[Guitar")) {
                guitarInstrumentService.play((Guitar) instrument[i]);
            } else if (Arrays.toString(new Instrument[]{instrument[i]}).startsWith("[Tube")) {
                tubeInstrumentService.play((Tube) instrument[i]);
            } else if (Arrays.toString(new Instrument[]{instrument[i]}).startsWith("[Baraban")) {
                barabanInstrumentService.play((Baraban) instrument[i]);
            }


        }
    }
}