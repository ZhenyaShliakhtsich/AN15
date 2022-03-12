package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.airTransport.CivilAirTransport;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service.CivilAirTransportService;

public class CivilAirTransportServiceImpl implements CivilAirTransportService {
    @Override
    public void civilLoad(CivilAirTransport civilAirTransport, int civilLoad) {
        if (civilLoad > civilAirTransport.getCountPassengers()) {
            System.out.println("Вам нужен самолёт побольше");
        } else {
            System.out.println("Самолёт загружен");
        }

    }
}
