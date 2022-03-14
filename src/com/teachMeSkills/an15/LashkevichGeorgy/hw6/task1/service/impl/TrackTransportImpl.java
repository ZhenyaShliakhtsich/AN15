package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.TrackGroundService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.transport.groundTransport.TrackGroundTransport;

public class TrackTransportImpl implements TrackGroundService {
    @Override
    public void mognoLiZagruzit(int massaGruza, TrackGroundTransport trackGroundTransport) {
        if (massaGruza >= trackGroundTransport.getCapacity()){
            System.out.println("Грузовик загружен");
        } else System.out.println("Вам нужен грузовик побольше");
    }
}
