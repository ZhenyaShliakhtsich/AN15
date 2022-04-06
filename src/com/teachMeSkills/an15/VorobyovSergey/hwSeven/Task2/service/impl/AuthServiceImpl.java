package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.MenuService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.impl.MenuServiceAdminImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.impl.MenuServiceStartImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.impl.MenuServiceUserImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Basket;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.AuthService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.DatabaseService;

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

//!!!+++ Переименовать от обратной логики например isUserFound
//        boolean userIsNotFound = true;
        boolean isUserFound = false;
        for (User u : database) {
            if (u.getLogin().equals(login) && u.getPassword().equals(password)) {
//!!!+++                userIsNotFound = false;
                isUserFound = true;
                MenuService menuService = u.isHasAdminRole() ?
                        (new MenuServiceAdminImpl()) : (new MenuServiceUserImpl());
                menuService.createMenu(u);
            }
        }

//!!!+++        if (userIsNotFound){
        if (!isUserFound) {
            registration(database, storage);
        }
    }

    @Override
    public void registration(HashSet<User> database, HashSet<Product> storage) {
//        HashSet<User> database = database1;
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
        //Хотим добавить пользователя в базу и сохранить ее
        DatabaseService dbs = new DatabaseServiceImpl();

        //Еще нужна проверка был ли такой в базе
        boolean isUserFound = false;
        for (User u : database) {
            if (u.getLogin().equals(login)) {
                isUserFound = true;
                break;
            }
        }

        //если был не добавить, если нет добавить ))) логично
        if (isUserFound) {
            System.out.println("Database contains this user, change login and try again");
            new MenuServiceStartImpl().createMenu();
        } else {
            database.add(tempUser);
            dbs.saveUsersInDB(database);
            System.out.println("Registration is successful! Log In pleas!");
            new MenuServiceStartImpl().createMenu();
        }
    }
}
