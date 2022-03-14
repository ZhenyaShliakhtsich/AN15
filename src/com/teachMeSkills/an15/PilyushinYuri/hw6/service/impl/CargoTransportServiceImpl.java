package com.teachMeSkills.an15.PilyushinYuri.hw6.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw6.model.GroundTransport.CargoCarTransport;
import com.teachMeSkills.an15.PilyushinYuri.hw6.service.CargoTransportService;

public class CargoTransportServiceImpl implements CargoTransportService {
    @Override
    public void isCanCarry(int cargoWeight, CargoCarTransport cargoCarTransport) {
        if (cargoWeight < cargoCarTransport.getCargoWeight()) {
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен другой грузовик.");

        }
    }
}
