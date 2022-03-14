package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.groundTransport.LightGroundTransport;

public interface LightTransportService {
    double calculateDistance(int hours, LightGroundTransport lightGroundTransport);

    double calculateFuel(double calculatedDistance, LightGroundTransport lightGroundTransport);

    void printCalculatingResult(int hours, LightGroundTransport lightGroundTransport);

}
