package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportAir.SvTransportAirCivil;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.SvTransportAirCivilService;

public class SvTransportAirCivilServiceImp implements SvTransportAirCivilService {
    @Override
    public void showCalculatedPassengers(SvTransportAirCivil transport, int passengers) {
        System.out.println(passengers <= transport.getPassengersNumber() ?
                "Самолет загружен" : "Вам нужен самолет побольше");
    }
}
