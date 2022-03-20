package com.teachMeSkills.an15.BuzukArtyom.hw7.zadacha1.service;

import com.teachMeSkills.an15.BuzukArtyom.hw7.zadacha1.service.blog.Registration;

import java.io.IOException;

public interface RegistrationService {
    Registration registration(Registration registration) throws IOException;
    Registration equalsPassword(Registration registration);
    void writer(Registration registration) throws IOException;
    Registration authorization(Registration authorization);

}
