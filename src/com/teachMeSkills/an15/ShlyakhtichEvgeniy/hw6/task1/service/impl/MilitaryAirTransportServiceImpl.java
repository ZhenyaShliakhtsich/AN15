package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.airTransport.MilitaryAirTransport;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service.MilitaryAirTransportService;

public class MilitaryAirTransportServiceImpl implements MilitaryAirTransportService {
    @Override
    public void fire(MilitaryAirTransport militaryAirTransport) {
        if (militaryAirTransport.getCountRockets() > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы закончились");
        }
    }

    @Override
    public void catapult(MilitaryAirTransport militaryAirTransport) {
        if (militaryAirTransport.isCatapultSystemExists()) {
            System.out.println("Катапультированеи прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }

    }
}
