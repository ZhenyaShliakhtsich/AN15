package com.teachMeSkills.an15.VorobyovSergey.hwSeven;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.MenuCreationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.StartMenuCreationServiceImpl;

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
        System.out.println("У нас один пользователь по умолчанию для начальной проверки и его зовут Вася");
        dataBase.showDataBase();

        //Начинаем со стартового меню. Сразу передаем туда базу данных
        MenuCreationService service = new StartMenuCreationServiceImpl();
        service.createMenuList(dataBase);
    }
}
