package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.Transport;

public interface TransportService {
    double calculatePower(Transport transport);

    void printCalculatedPower(Transport transport);
}
