package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.ShowUserAccountService;

public class ShowUserAccountServiceImpl implements ShowUserAccountService {
    @Override
    public void showUserAccount(User user) {
        System.out.println("----------\nИнформация о пользовательских данных:");
        System.out.println(user);
        MenuCreationService menu = new MainMenuCreationServiceImpl();
        menu.createMenuList(user);
    }
}
