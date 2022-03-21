package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UserReg;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UsersList;

public interface ChangeInfoService {
    void showInfo(UserReg userReg);
    void changeInfo(UsersList usersList, UserReg userReg);
}
