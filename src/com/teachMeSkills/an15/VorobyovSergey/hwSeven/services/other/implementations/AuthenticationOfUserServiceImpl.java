package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.AuthenticationOfUserService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.AuthorisationOfUserService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.LineReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.LineReaderServiceImpl;

public class AuthenticationOfUserServiceImpl implements AuthenticationOfUserService {
    @Override
    public void tryToAuthenticateUser(DataBase dataBase) {
        String login;
        String password;
        LineReaderService lineReader = new LineReaderServiceImpl();
        User user = new User();

        System.out.println("----------\nДавай попробуем аутентифицироваться по логину и паролю");
        login = lineReader.readLine("Введите логин");
        password = lineReader.readLine("Введите пароль");

        boolean isUserNotFound = true;
        for (User u : dataBase.getList()) {
            if (u.getUserLogin().equals(login) &&
                    u.getUserPassword().equals(password)) {
                user = u;
                isUserNotFound = false;
                break;
            }
        }
        //если такого не нашлось в базе идем регистрироваться
        if (isUserNotFound) {
            AuthorisationOfUserService authorisation = new AuthorisationOfUserServiceImpl();
            authorisation.tryToAuthoriseUser(dataBase);
        } else {
            MenuCreationService mainMenu = new MainMenuCreationServiceImpl();
            mainMenu.createMenuList(user);
        }
    }
}
