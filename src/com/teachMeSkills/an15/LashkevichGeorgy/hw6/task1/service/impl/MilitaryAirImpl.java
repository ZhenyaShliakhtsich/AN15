package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.MilitaryAirService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.transport.airTransport.MilitaryAirTransport;

public class MilitaryAirImpl implements MilitaryAirService {

    @Override
    public void rocketShoot(MilitaryAirTransport militaryAirTransport) {
        if (militaryAirTransport.getCountRockets() != 0){
            int a = militaryAirTransport.getCountRockets();
            while (a != 0){
                System.out.println("Ракета пошла...");
                a--;
            }
            System.out.println("Ракеты закончились");
        } else System.out.println("Боеприпасы отсутствуют");
    }

    @Override
    public void capitul(MilitaryAirTransport militaryAirTransport) {
        if (militaryAirTransport.isCatapultSystemExists()){
            System.out.println("Капитулирование прошло успешно");
        } else System.out.println("У вас не такой системы");

    }
}
