package com.teachMeSkills.an15.PilyushinYuri.hw7.service;

import com.teachMeSkills.an15.PilyushinYuri.hw7.model.User;

import java.util.ArrayList;

public interface RegistrationService {
    void newUserRegistration(ArrayList<User> users);
    User userAuthentication(ArrayList<User> users);
}
