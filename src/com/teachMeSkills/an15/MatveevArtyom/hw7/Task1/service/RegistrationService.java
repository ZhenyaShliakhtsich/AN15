package com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.service;

import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.RegistrationAndAuthorisation;

public interface RegistrationService {
    RegistrationAndAuthorisation registration(RegistrationAndAuthorisation registration);

    RegistrationAndAuthorisation authorisation(RegistrationAndAuthorisation registration, RegistrationAndAuthorisation authorisation);

    RegistrationAndAuthorisation showAndChangeData(RegistrationAndAuthorisation authorisation);
}
