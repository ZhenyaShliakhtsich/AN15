package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service.impl;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.airTransport.MilitaryAirTransport;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service.MilitaryAirTransportService;

public class MilitaryAirTransportImpl implements MilitaryAirTransportService {
    @Override
    public void isCountRockets(int countRockets, MilitaryAirTransport militaryAirTransport) {
        if (countRockets > 0) {
            System.out.println("Ракета пошла");
        } else System.out.println("Боеприпасы отсутствуют");
    }

    @Override
    public void isCatapultSystemExists(boolean catapultSystemExists, MilitaryAirTransport militaryAirTransport) {
        if (catapultSystemExists == true) {
            System.out.println("Катапультирование прошло успешно");
        } else System.out.println("У вас нет такой системы");
    }
}
