package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;

public interface MenuCreationService {
    void createMenuList(DataBase dataBase);
    void createMenuList(User user);
}
