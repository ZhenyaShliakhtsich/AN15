package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;

public interface SelectActionByNumberFromConsoleService {
    void selectActionByNumber (DataBase dataBase);
    void selectActionByNumber (User user);
}
