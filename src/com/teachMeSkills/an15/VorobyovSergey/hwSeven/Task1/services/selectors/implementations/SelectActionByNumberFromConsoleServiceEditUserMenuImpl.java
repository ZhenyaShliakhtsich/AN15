package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.selectors.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.edituser.UserService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.implementations.EditUserMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.OnlyOneNumberReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.selectors.SelectActionByNumberFromConsoleService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.edituser.implimentations.*;

public class SelectActionByNumberFromConsoleServiceEditUserMenuImpl implements SelectActionByNumberFromConsoleService {
    @Override
    public void selectActionByNumber(DataBase dataBase) {

    }

    @Override
    public void selectActionByNumber(User user) {
        OnlyOneNumberReaderService numberReader = new OnlyOneNumberReaderServiceImpl();
        UserService service = new UserServiceImpl();

        System.out.println("----------\nВыберите пункт для редактирования (цифрой):");
        switch (numberReader.readNumberFromConsole()) {
            case 0:
                new MainMenuCreationServiceImpl().createMenuList(user);
                break;
            case 1:
                service.editFirstName(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user);
                break;
            case 2:
                service.editLastName(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user);
                break;
            case 3:
                service.editEmail(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user);
                break;
            case 4:
                service.editLogin(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user);
                break;
            case 5:
                service.editPassword(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user);
                break;
            case 6:
                service.editBlog(user);
                new EditUserMenuCreationServiceImpl().createMenuList(user);
                break;
            default:
                new SelectActionByNumberFromConsoleServiceMainMenuImpl().selectActionByNumber(user);
                break;
        }
    }
}
