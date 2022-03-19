package com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service.impl;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service.TrackTransportService;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.groundTransport.TrackGroundTransport;

public class TrackTransportServiceImpl implements TrackTransportService {
    @Override
    public boolean isTransportLoaded(int cargo, TrackGroundTransport trackGroundTransport) {
        if (cargo <= trackGroundTransport.getCapacity()) {
            System.out.println("Грузовик загружен");
        } else System.out.println("Вам нужен грузовик побольше");
    return true;
    }

}
