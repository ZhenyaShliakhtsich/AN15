package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.authentication.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.authentication.AuthService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.edituser.UserService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.edituser.implimentations.UserServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.LineReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.implementations.LineReaderServiceImpl;

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
        UserService service = new UserServiceImpl();
        //1-FName
        user = service.editFirstName(user);
        //2-LName
        user = service.editLastName(user);
        //3-Email
        user = service.editEmail(user);
        //4-Login
        user = service.editLogin(user);
        //5-Password
        user = service.editPassword(user);
        //6-Blog
        user = service.editBlog(user);

        //план поменялся идем на аутентификацию, и добавим его в базу предварительно
        dataBase.addToList(user);
        System.out.println("Твоя БД пользователей:");
        dataBase.showDataBase();
        tryToAuthenticateUser(dataBase);
    }
}
