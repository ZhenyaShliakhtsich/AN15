package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UserReg;

public interface ChangeInfoService {
    void showInfo(UserReg userReg);
    UserReg changeInfo(UserReg userReg);
}
