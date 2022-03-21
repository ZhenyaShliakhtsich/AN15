package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;

public interface MenuCreationService {
    void createMenuList(DataBase dataBase);
    void createMenuList(User user);
}
