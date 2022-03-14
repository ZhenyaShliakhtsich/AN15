package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service;

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.transport.Transport;

public interface TransportService {
    double calculatePower(Transport transport);
    void printCalculatedPower(Transport transport);
}
