package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.authentication;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;

public interface AuthService {
    void tryToAuthoriseUser(DataBase dataBase);
    void tryToAuthenticateUser (DataBase dataBase);
}
