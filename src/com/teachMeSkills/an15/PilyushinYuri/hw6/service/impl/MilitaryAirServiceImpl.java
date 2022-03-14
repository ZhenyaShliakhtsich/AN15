package com.teachMeSkills.an15.PilyushinYuri.hw6.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw6.model.AirTransport.MilitaryAirTransport;
import com.teachMeSkills.an15.PilyushinYuri.hw6.service.MilitaryAirService;

public class MilitaryAirServiceImpl implements MilitaryAirService {

    @Override
    public void toCatapult(MilitaryAirTransport militaryAirTransport) {
        if (militaryAirTransport.isCatapult() == true){
            System.out.println("катапультирование успешно.");
        } else {
            System.out.println("система отсутсвует.");
        }
    }


    @Override
    public void toLaunchRockets(MilitaryAirTransport militaryAirTransport) {
        if (militaryAirTransport.getLaunch() > 0){
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют.");
        }

    }
}
