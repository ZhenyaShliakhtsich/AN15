package com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.Transport;

public interface TransportService {
    double calculatePower(Transport transport);
    void printCalculatedPower(Transport transport);
}
