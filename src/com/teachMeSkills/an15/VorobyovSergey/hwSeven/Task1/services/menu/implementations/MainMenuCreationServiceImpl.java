package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.enums.MainMenuItemsEnum;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.selectors.SelectActionByNumberFromConsoleService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.selectors.implementations.SelectActionByNumberFromConsoleServiceMainMenuImpl;

public class MainMenuCreationServiceImpl implements MenuCreationService {
    @Override
    public void createMenuList(DataBase dataBase) {

    }

    @Override
    public void createMenuList(User user) {
        System.out.println("----------\nГлавное меню: (" + user.getUserFirstName() + ")");
        for (MainMenuItemsEnum s : MainMenuItemsEnum.values()) {
            System.out.println(" " + s.getMenuItemNumber() + " - " + s);
        }
        SelectActionByNumberFromConsoleService selector = new SelectActionByNumberFromConsoleServiceMainMenuImpl();
        selector.selectActionByNumber(user);
    }
}
