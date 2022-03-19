package com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service.impl;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service.CivilAirTransportService;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.airTransport.CivilAirTransport;

public class CivialAirTransportServiceImpl implements CivilAirTransportService {

    @Override
    public boolean isTransportLoaded(int numberOfPassengers, CivilAirTransport civilAirTransport) {
        if (numberOfPassengers <= civilAirTransport.getCountPassengers()) {
            System.out.println("Самолет загружен");
        } else System.out.println("Вам нужен самолет побольше");
        return true;
    }
}
