package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.authentication.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.authentication.AuthService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.UserParametersService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.implimentations.*;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.LineReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.LineReaderServiceImpl;

public class AuthServiceImpl implements AuthService {
    LineReaderService lineReader = new LineReaderServiceImpl();

    @Override
    public void tryToAuthenticateUser(DataBase dataBase) {
        String login;
        String password;
        User user = new User();

        System.out.println("----------\nДавай попробуем аутентифицироваться по логину и паролю");
        login = lineReader.readLine("Введите логин");
        password = lineReader.readLine("Введите пароль");

        //Проверяем базу пользователей
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
            tryToAuthoriseUser(dataBase);
        } else {
            MenuCreationService mainMenu = new MainMenuCreationServiceImpl();
            mainMenu.createMenuList(user);
        }
    }

    @Override
    public void tryToAuthoriseUser(DataBase dataBase) {
        System.out.println("----------\nДавай создавать нового пользователя");
        //Создаем пользователя, и начинаем просто редачить ему поля через сервисы.
        //Потом эти же сервисы используем для редактирования уже существующего пользователя
        User user = new User();

        //1-FName
        UserParametersService fName = new UserParametersServiceFirstNameImpl();
        user = fName.setParameter(user);
        //2-LName
        UserParametersService lName = new UserParametersServiceLastNameImpl();
        user = lName.setParameter(user);
        //3-Email
        UserParametersService email = new UserParametersServiceEmailImpl();
        user = email.setParameter(user);
        //4-Login
        UserParametersService login = new UserParametersServiceLoginImpl();
        user = login.setParameter(user);
        //5-Password
        UserParametersService password = new UserParametersServicePasswordImpl();
        user = password.setParameter(user);
        //6-Blog
        UserParametersService blog = new UserParametersServiceBlogImpl();
        user = blog.setParameter(user);

        //план поменялся идем на аутентификацию, и добавим его в базу предварительно
        dataBase.addToList(user);
        System.out.println("Твоя БД пользователей:");
        dataBase.showDataBase();
        tryToAuthenticateUser(dataBase);
    }
}
