package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.implementations;


import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.enums.StartMenuItemsEnum;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.selectors.SelectActionByNumberFromConsoleService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.selectors.implementations.SelectActionByNumberFromConsoleServiceStartMenuImpl;

public class StartMenuCreationServiceImpl implements MenuCreationService {
    @Override
    public void createMenuList(DataBase dataBase) {
        System.out.println("----------\nМеню авторизации или аутентификации:");
        for (StartMenuItemsEnum s : StartMenuItemsEnum.values()) {
            System.out.println(" " + s.getMenuItemNumber() + " - " + s);
        }
        SelectActionByNumberFromConsoleService selector = new SelectActionByNumberFromConsoleServiceStartMenuImpl();
        selector.selectActionByNumber(dataBase);
    }

    @Override
    public void createMenuList(User user) {

    }
}
