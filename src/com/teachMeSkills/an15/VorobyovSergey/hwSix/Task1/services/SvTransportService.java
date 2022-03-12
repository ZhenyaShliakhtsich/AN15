package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.SvTransport;

public interface SvTransportService {
    void showCalculatedPower(SvTransport transport);

    double convertPower(SvTransport transport);
}
