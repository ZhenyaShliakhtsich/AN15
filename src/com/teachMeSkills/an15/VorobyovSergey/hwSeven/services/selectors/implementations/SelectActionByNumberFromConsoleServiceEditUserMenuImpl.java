package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.UserService;
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
                break;
            case 3:
                service.editEmail(user);
                break;
            case 4:
                service.editLogin(user);
                break;
            case 5:
                service.editPassword(user);
                break;
            case 6:
                service.editBlog(user);
                break;
            default:
                new SelectActionByNumberFromConsoleServiceMainMenuImpl().selectActionByNumber(user);
                break;
        }
    }
}
