package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportAir.SvTransportAirMilitary;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.SvTransportAirMilitaryService;

public class SvTransportAirMilitaryServiceImp implements SvTransportAirMilitaryService {
    @Override
    public void makeRocketShot(SvTransportAirMilitary transport) {
        if (transport.getRocketNumber() > 0) {
            System.out.println("Ракета пошла.");
            int rocketNumber = transport.getRocketNumber();
            transport.setRocketNumber(rocketNumber - 1);
            System.out.println("Ракет осталось - " + rocketNumber);
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    @Override
    public boolean isEjectionSystemExists(SvTransportAirMilitary transport) {
        return transport.isEjectionSystem();
    }
}
