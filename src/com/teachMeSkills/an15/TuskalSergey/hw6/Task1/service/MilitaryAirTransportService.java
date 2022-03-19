package com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.airTransport.MilitaryAirTransport;

public interface MilitaryAirTransportService {
    void shoot(int numberOfRockets, MilitaryAirTransport militaryAirTransport);
    void isCatapultOk(MilitaryAirTransport militaryAirTransport);
}
