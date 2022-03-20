package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations;


import com.teachMeSkills.an15.VorobyovSergey.hwSeven.enums.StartMenuItemsEnum;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.SelectActionByNumberFromConsoleService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.implementations.SelectActionByNumberFromConsoleServiceStartMenuImpl;

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
