package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.authentication;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.DataBase;

public interface AuthService {
    void tryToAuthoriseUser(DataBase dataBase);
    void tryToAuthenticateUser (DataBase dataBase);
}
