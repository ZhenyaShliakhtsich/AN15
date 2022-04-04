package com.teachMeSkills.an15.MatveevArtyom.hw8.service;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;

public interface Menu {
    void menuAuth();

    void menuAdmin();

    void menuUser(User user);
}
