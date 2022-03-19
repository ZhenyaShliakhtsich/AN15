package com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service.impl;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.airTransport.MilitaryAirTransport;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service.MilitaryAirTransportService;

public class MilitaryAirTransportServiceImpl implements MilitaryAirTransportService {
    @Override
    public void shoot(int numberOfRockets, MilitaryAirTransport militaryAirTransport) {
        for (int i = 1; i <= numberOfRockets; i++) {
            if (i <= militaryAirTransport.getCountRockets()) {
                System.out.println(i + "-я ракета пошла");
            } else {System.out.println("Боеприпасы отсутствуют");
                break;}
        }
    }

    @Override
    public void isCatapultOk(MilitaryAirTransport militaryAirTransport) {
        if (militaryAirTransport.isCatapultSystemExists()) {
            System.out.println("Катапультирование прошло успешно");
        } else System.out.println("У вас нет такой системы");
    }
}
