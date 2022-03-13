package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service.impl;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.airTransport.CivilAirTransport;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service.CivilAirTransportService;

public class CivilTransportImpl implements CivilAirTransportService {

    @Override
    public void calculateCountPassengers(int countPassengers, CivilAirTransport civilAirTransport) {
        if (countPassengers <= civilAirTransport.getCountPassengers()) {
            System.out.println("Мест хватило на всех, самолёт загружен ");
        } else System.out.println("Вам нужен самолёт побольше");
    }
}
