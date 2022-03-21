package com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.groundTransport.TrackGroundTransport;

public interface TrackTransportService {
    boolean isTransportLoaded(int cargo, TrackGroundTransport trackGroundTransport);
}
