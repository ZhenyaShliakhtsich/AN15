package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.SvTransport;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.SvTransportService;

public class SvTransportServiceImp implements SvTransportService {

    @Override
    public void showCalculatedPower(SvTransport transport) {
        System.out.println("Мощность в лошадиных сила = " + transport.getHorsPower());
        System.out.println("Мощность в киловатах = " + convertPower(transport));
    }

    @Override
    public double convertPower(SvTransport transport) {
        return transport.getHorsPower() * 0.74;
    }
}
