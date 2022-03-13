package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.services;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvUser;

public interface SvUserAuthenticationService {
    boolean isUserAuthenticated (SvUser user, String login, String password);
}
