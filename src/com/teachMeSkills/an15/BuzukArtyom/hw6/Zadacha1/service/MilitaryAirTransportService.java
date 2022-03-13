package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.airTransport.MilitaryAirTransport;

public interface MilitaryAirTransportService {
    void isCountRockets(int countRockets, MilitaryAirTransport militaryAirTransport);

    void isCatapultSystemExists(boolean catapultSystemExists, MilitaryAirTransport militaryAirTransport);
}
