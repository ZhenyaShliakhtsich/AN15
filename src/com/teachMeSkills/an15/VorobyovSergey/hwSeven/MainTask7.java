package com.teachMeSkills.an15.VorobyovSergey.hwSeven;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.AuthenticationOfUserService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.implementations.AuthenticationOfUserServiceImpl;

public class MainTask7 {
    public static void main(String[] args) {
        //Внесем в базу Васю и дальше прога началась
        User vasia = new User();
        vasia.setUserFirstName("Vasia");
        vasia.setUserEmail("Vasia@mail.com");
        vasia.setUserLogin("Login");
        vasia.setUserPassword("Password");

        DataBase dataBase = new DataBase();
        dataBase.addToList(vasia);
        System.out.println("У нас один пользователь по умолчанию для начальной проверки");
        dataBase.showDataBase();

        //Начинаем с аутентификации и если пользователя нет то идем авторизироваться
        AuthenticationOfUserService authentication = new AuthenticationOfUserServiceImpl();
        authentication.tryToAuthenticateUser(dataBase);
    }
}
