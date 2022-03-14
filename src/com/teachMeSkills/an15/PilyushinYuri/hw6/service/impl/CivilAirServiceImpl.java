package com.teachMeSkills.an15.PilyushinYuri.hw6.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw6.model.AirTransport.CivilAirTransport;
import com.teachMeSkills.an15.PilyushinYuri.hw6.service.CivilAirService;

public class CivilAirServiceImpl implements CivilAirService {
    @Override
    public void toSeat(int passenger, CivilAirTransport civilAirTransport) {
        if (passenger < civilAirTransport.getPassenger()) {
            System.out.println("Самолет загружен.");
        } else {
            System.out.println("Нужен самолет побольше.");
        }
    }


    @Override
    public void isBisnessClassPresent(CivilAirTransport civilAirTransport) {
        if (civilAirTransport.isBissnesClass() == true) {
            System.out.println("есть бизнесс-класс");
        } else {
            System.out.println("бизнесс-класс отсутствует ");
        }

    }
}


