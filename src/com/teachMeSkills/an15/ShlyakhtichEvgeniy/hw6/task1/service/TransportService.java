package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.Transport;

public interface TransportService {
    double calculatePower(Transport transport);

    void printCalculatedPower(Transport transport);
}
