package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.enums.EditUserMenuItemsEnum;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.SelectActionByNumberFromConsoleService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.implementations.SelectActionByNumberFromConsoleServiceEditUserMenuImpl;

public class EditUserMenuCreationServiceImpl implements MenuCreationService {
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
