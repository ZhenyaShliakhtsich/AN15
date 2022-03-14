package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.CivilAirService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.transport.airTransport.CivilAirTransport;

public class CivilAirImpl implements CivilAirService {

    @Override
    public void civilAirService(int countOfPassages, CivilAirTransport civilAirTransport) {
        if (countOfPassages <= civilAirTransport.getCountPassengers()) {
            System.out.println("Самолет загружен");
        } else System.out.println("Вам нужен самолет побольше");
    }



}
