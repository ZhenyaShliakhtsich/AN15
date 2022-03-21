package com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.airTransport.CivilAirTransport;

public interface CivilAirTransportService {
    boolean isTransportLoaded(int numberOfPassengers, CivilAirTransport civilAirTransport);
}
