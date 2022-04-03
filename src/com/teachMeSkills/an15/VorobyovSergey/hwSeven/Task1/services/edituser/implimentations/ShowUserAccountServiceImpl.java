package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.edituser.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.edituser.ShowUserAccountService;

public class ShowUserAccountServiceImpl implements ShowUserAccountService {
    @Override
    public void showUserAccount(User user) {
        System.out.println("----------\nИнформация о пользовательских данных:");
        System.out.println(user);
        MenuCreationService menu = new MainMenuCreationServiceImpl();
        menu.createMenuList(user);
    }
}
