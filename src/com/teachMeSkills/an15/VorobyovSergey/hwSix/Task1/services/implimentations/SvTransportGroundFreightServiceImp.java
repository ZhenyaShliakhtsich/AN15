package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportGround.SvTransportGroundFreight;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.SvTransportGroundFreightService;

public class SvTransportGroundFreightServiceImp implements SvTransportGroundFreightService {
    @Override
    public void showCalculatedCargo(SvTransportGroundFreight transport, int weight) {
        System.out.println(transport.getLoadCapacity() >= weight ?
                "Грузовик загружен" : "Вам нужен грузовик побольше");
    }
}
