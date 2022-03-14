package com.teachMeSkills.an15.PilyushinYuri.hw6.service;

import com.teachMeSkills.an15.PilyushinYuri.hw6.model.AirTransport.CivilAirTransport;

public interface CivilAirService {
    void toSeat(int passenger, CivilAirTransport civilAirTransport);
    void isBisnessClassPresent (CivilAirTransport civilAirTransport);

}

