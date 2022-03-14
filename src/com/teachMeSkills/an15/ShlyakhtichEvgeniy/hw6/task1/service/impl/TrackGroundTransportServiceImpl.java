package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.groundTransport.TrackGroundTransport;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service.TrackGroundTransportService;

public class TrackGroundTransportServiceImpl implements TrackGroundTransportService {
    @Override
    public void load(TrackGroundTransport trackGroundTransport, int load) {
        if (load > trackGroundTransport.getCapacity()) {
            System.out.println("Вам нужен грузовик побольше");
        } else {
            System.out.println("Грузовик загружен");
        }
    }
}
