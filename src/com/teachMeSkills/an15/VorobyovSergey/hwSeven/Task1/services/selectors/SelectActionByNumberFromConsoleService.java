package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.selectors;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;

public interface SelectActionByNumberFromConsoleService {
    void selectActionByNumber (DataBase dataBase);
    void selectActionByNumber (User user);
}
