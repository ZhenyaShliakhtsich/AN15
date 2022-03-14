package com.teachMeSkills.an15.PilyushinYuri.hw6.service;


import com.teachMeSkills.an15.PilyushinYuri.hw6.model.Transport;

public interface TransportService {
    double calculatePower(Transport transport);
    void printCalculatedPower(Transport transport);
}
