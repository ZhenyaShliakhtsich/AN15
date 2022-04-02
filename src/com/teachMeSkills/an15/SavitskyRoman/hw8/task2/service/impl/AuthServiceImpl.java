package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.impl;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Basket;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.User;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.AuthService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private String loginAdmin = "admin";
    private String passwordAdmin = "admin";
    private Scanner scanner = new Scanner(System.in);

    private String answerUser() {
        String answer = null;
        boolean isAnswer = false;
        while (!isAnswer) {
            answer = scanner.nextLine();
            if (answer.isEmpty()) {
                System.out.println("Ошибка ввода. Попробуйте еще раз");
                continue;
            }
            isAnswer = true;
        }
        return answer;
    }

    @Override
    public User login(HashMap<User, User> users) {
        boolean isAnswer = false;
        while (!isAnswer) {
            System.out.println("Введите логин:");
            String login = answerUser();
            System.out.println("Введите пароль:");
            String password = answerUser();
            if (login.equals(loginAdmin) && password.equals(passwordAdmin)) {
                User admin = new User(login, password);
                admin.setHasAdminRole(true);
                System.out.println("Вы вошли как администратор");
                users.put(admin, admin);
                return users.get(admin);
            } else {
                User enteredUser = new User(login, password);
                if (users.containsKey(enteredUser)) {
                    System.out.println("Ты авторизирован");
                    enteredUser.setBasket(new Basket());
                    enteredUser.getBasket().setTotalPrice(new BigDecimal(0));

                    users.put(enteredUser, enteredUser);
                    return users.get(enteredUser);
                } else {
                    System.out.println("Логин или пароль неверные");
                }
            }
        }
        return null;
    }

    @Override
    public void registration(HashMap<User, User> users) {
        System.out.println("Введите логин:");
        String login = answerUser();
        System.out.println("Введите пароль:");
        String password = answerUser();
        User user = new User(login, password);
        users.put(user, user);
        System.out.println("Ты зарегистрирован! Авторизируйся!");
        //login(users);
    }
}
