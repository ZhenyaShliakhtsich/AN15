package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.enums.EditUserMenuItemsEnum;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.selectors.SelectActionByNumberFromConsoleService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.selectors.implementations.SelectActionByNumberFromConsoleServiceEditUserMenuImpl;

public class EditUserMenuCreationServiceImpl implements MenuCreationService {
    @Override
    public void createMenuList(DataBase dataBase) {

    }

    @Override
    public void createMenuList(User user) {
        System.out.println("----------\nПользовательские настройки меню: (" + user.getUserFirstName() + ")");
        for (EditUserMenuItemsEnum s : EditUserMenuItemsEnum.values()) {
            System.out.println(" " + s.getMenuItemNumber() + " - " + s);
        }
        SelectActionByNumberFromConsoleService selector = new SelectActionByNumberFromConsoleServiceEditUserMenuImpl();
        selector.selectActionByNumber(user);
    }
}
