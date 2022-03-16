package com.teachMeSkills.an15.NovikovVadim.hw6.store;

public interface Authentication {
    void login(User user) throws Exception;
    void password(User user) throws Exception;

}
