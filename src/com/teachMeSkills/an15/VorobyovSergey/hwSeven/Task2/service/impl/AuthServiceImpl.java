package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.MenuService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.impl.MenuServiceAdminImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.impl.MenuServiceUserImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Basket;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.AuthService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    @Override
    public void login(HashSet<User> database, HashSet<Product> storage) {
        System.out.println("Try to log in!!!");
        System.out.println("Enter login:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        boolean userIsNotFound = true;
        for (User u: database){
            if (u.getLogin().equals(login) && u.getPassword().equals(password)){
                userIsNotFound = false;
                MenuService menuService = u.isHasAdminRole() ?
                        (new MenuServiceAdminImpl()) : (new MenuServiceUserImpl());
                menuService.createMenu(u, storage);
            }
        }

        if (userIsNotFound){
            registration(database, storage);
        }
    }

    @Override
    public void registration(HashSet<User> database, HashSet<Product> storage) {
        System.out.println("Start registration!!!");
        System.out.println("Enter login:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        User tempUser = new User();
        tempUser.setBasket(new Basket());
        tempUser.setLogin(login);
        tempUser.setPassword(password);
        //Тут на самом деле можно много проверок нагородить
        database.add(tempUser);
        System.out.println("Registration is successful! Authorise pleas!");
        login(database, storage);
    }
}
