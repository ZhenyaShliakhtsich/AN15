package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.services.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvUser;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.services.SvUserAuthenticationService;

public class SvUserAuthenticationServiceImpl implements SvUserAuthenticationService {
    @Override
    public boolean isUserAuthenticated(SvUser user, String login, String password) {
        if (user.getUserLogin().equals(login) &&
                user.getUserPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
