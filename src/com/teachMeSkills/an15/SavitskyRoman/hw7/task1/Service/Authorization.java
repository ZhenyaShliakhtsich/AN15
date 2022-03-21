package com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service;

import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.User;

public interface Authorization {

    public void userAuthorization(User[] userArray);
    public int getNumberOfArray();
    public boolean isAuthorization();
}
