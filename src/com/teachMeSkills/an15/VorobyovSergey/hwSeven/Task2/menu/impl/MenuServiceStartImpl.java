package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.OnlyOneNumberReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.enums.AdminMenuEnum;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.enums.StartMenuEnum;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.MenuService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl.AuthServiceImpl;

import java.util.HashSet;

public class MenuServiceStartImpl implements MenuService {
    private OnlyOneNumberReaderService numberReader = new OnlyOneNumberReaderServiceImpl();
    AuthServiceImpl service = new AuthServiceImpl();

    @Override
    public void createMenu(User user, HashSet<Product> storage) {
    }

    @Override
    public void createMenu() {
        //Read enum
        System.out.println("----------\nStart menu:");
        for (StartMenuEnum s : StartMenuEnum.values()) {
            System.out.println(" " + s.getMenuItemNumber() + " - " + s);
        }

        //Load 2 databases (Users and Storage)
        HashSet<User> users = null;
        HashSet<Product> products = null;

        //Make choice
        System.out.println("----------\nChoose menu item (by number):");
        switch (numberReader.readNumberFromConsole()) {
            case 0:
                System.out.println("The End. Logout");
                break;
            case 1:
                System.out.println("NOW LOG_IN");
                service.login(users, products);
                break;
            case 2:
                System.out.println("NOW REGISTRATION");
                service.registration(users, products);
                break;
            default:
                System.out.println("Ты не попал по нужной цифре. Попробуй еще раз");
                createMenu();
                break;
        }
    }
}
