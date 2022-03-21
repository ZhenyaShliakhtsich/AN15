package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.ShowUserAccountService;

public class ShowUserAccountServiceImpl implements ShowUserAccountService {
    @Override
    public void showUserAccount(User user) {
        System.out.println("----------\nИнформация о пользовательских данных:");
        System.out.println(user);
        MenuCreationService menu = new MainMenuCreationServiceImpl();
        menu.createMenuList(user);
    }
}
