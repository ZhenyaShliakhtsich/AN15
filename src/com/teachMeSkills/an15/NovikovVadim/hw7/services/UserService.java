package com.teachMeSkills.an15.NovikovVadim.hw7.services;

import com.teachMeSkills.an15.NovikovVadim.hw7.OtherConst;
import com.teachMeSkills.an15.NovikovVadim.hw7.User;

import java.util.ArrayList;

public interface UserService {
    OtherConst chooseAnAuthorizationMethod();

    OtherConst chooseAnInformation();

    void showInformation(User user);

    void changeInformation(ArrayList<User> users, User user);

    void changeEmail(User user);
}
