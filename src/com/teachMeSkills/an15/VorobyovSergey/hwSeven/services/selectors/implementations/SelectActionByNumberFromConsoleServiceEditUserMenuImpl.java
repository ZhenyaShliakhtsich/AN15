package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.EditUserMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.OnlyOneNumberReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.SelectActionByNumberFromConsoleService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.implimentations.*;

public class SelectActionByNumberFromConsoleServiceEditUserMenuImpl implements SelectActionByNumberFromConsoleService {
    @Override
    public void selectActionByNumber(DataBase dataBase) {

    }

    @Override
    public void selectActionByNumber(User user) {
        User user1;
        OnlyOneNumberReaderService numberReader = new OnlyOneNumberReaderServiceImpl();
        System.out.println("----------\nВыберите пункт для редактирования (цифрой):");
        switch (numberReader.readNumberFromConsole()) {
            case 0:
                new MainMenuCreationServiceImpl().createMenuList(user);
                break;
            case 1:
                user1 = new UserParametersServiceFirstNameImpl().setParameter(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user1);
                break;
            case 2:
                user1 = new UserParametersServiceLastNameImpl().setParameter(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user1);
                break;
            case 3:
                user1 = new UserParametersServiceEmailImpl().setParameter(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user1);
                break;
            case 4:
                user1 = new UserParametersServiceLoginImpl().setParameter(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user1);
                break;
            case 5:
                user1 = new UserParametersServicePasswordImpl().setParameter(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user1);
                break;
            case 6:
                user1 = new UserParametersServiceBlogImpl().setParameter(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user1);
                break;
            default:
                new SelectActionByNumberFromConsoleServiceMainMenuImpl().selectActionByNumber(user);
                break;
        }
    }
}
