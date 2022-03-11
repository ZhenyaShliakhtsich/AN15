package com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.airTransport.CivilTransport;
import com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.service.CivilTransportMethods;

public class CivilTransportMethodsImpl implements CivilTransportMethods {
    @Override
    public void printResult(int someCountOfPassengers, CivilTransport civilTransport) {
        if (someCountOfPassengers >= civilTransport.getCountOfPassengers()) {
            System.out.println("Вам нужен самолёт побольше!");
        } else {
            System.out.println("Самолёт загружен пассажирами!");
        }
    }
}
