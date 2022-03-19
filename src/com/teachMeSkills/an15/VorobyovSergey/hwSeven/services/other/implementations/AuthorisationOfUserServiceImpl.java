package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.AuthenticationOfUserService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.AuthorisationOfUserService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.userparameters.UserParametersService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.userparameters.implimentations.*;

public class AuthorisationOfUserServiceImpl implements AuthorisationOfUserService {
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

        //и после как создали нового пользователя идем в главное меню
//        MenuCreationService mainMenu = new MainMenuCreationServiceImpl();
//        mainMenu.createMenuList(user);

        //план поменялся идем на аутентификацию, и добавим его в базу предварительно
        dataBase.addToList(user);
        AuthenticationOfUserService service = new AuthenticationOfUserServiceImpl();
        service.tryToAuthenticateUser(dataBase);

    }
}
