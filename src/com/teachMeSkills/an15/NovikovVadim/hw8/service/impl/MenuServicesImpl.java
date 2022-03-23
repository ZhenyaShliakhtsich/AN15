package com.teachMeSkills.an15.NovikovVadim.hw8.service.impl;

import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.AuthService;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.MenuServices;

import java.util.HashMap;

public class MenuServicesImpl implements MenuServices {

    AuthService authService = new AuthServiceImpl();

    @Override
    public void authMenu(HashMap<String, User> users) {



    }
}
