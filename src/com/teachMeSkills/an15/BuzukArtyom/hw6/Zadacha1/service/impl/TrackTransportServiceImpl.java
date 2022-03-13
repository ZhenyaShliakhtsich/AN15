package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service.impl;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.groundTransport.TrackGroundTransport;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service.TrackTransportService;

public class TrackTransportServiceImpl implements TrackTransportService {
    @Override
    public void calculateGruz(int capacity, TrackGroundTransport trackGroundTransport) {
        if (capacity <= trackGroundTransport.getCapacity()) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }

    }
}
