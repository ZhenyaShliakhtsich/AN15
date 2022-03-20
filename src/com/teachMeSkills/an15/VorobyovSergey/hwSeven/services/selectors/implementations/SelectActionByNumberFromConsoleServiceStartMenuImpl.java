package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.authentication.AuthService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.authentication.implementations.AuthServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.implimentations.*;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.EditUserMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.OnlyOneNumberReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.SelectActionByNumberFromConsoleService;

public class SelectActionByNumberFromConsoleServiceStartMenuImpl implements SelectActionByNumberFromConsoleService {
    @Override
    public void selectActionByNumber(DataBase dataBase) {
        OnlyOneNumberReaderService numberReader = new OnlyOneNumberReaderServiceImpl();
        AuthService service = new AuthServiceImpl();

        System.out.println("----------\nВыберите пункт для редактирования (цифрой):");
        switch (numberReader.readNumberFromConsole()) {
            case 0:
                System.out.println("The End. Logout");
                break;
            case 1:
                service.tryToAuthenticateUser(dataBase);
                break;
            case 2:
                service.tryToAuthoriseUser(dataBase);
                break;
            default:
                System.out.println("The End. Logout");
                break;
        }
    }

    @Override
    public void selectActionByNumber(User user) {

    }
}
