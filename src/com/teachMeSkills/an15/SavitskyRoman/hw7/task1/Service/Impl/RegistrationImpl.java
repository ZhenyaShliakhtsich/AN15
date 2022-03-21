package com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Impl;

import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Registration;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.User;

import java.io.*;
import java.util.Scanner;

public class RegistrationImpl implements Registration {
    Scanner scanner = new Scanner(System.in);
    File file = new File("user.ser");
    boolean isRegistration = false;
    boolean isLogin = false;

    @Override
    public void registration(User[] userArray) {

        for (int x = 0; x < userArray.length; x++) {
            if (isArrayFull(userArray) || userArray[userArray.length - 1] != null) {
                System.out.println("Список пользователей полон");
                break;
            }
            if (userArray[x] == null && isCellArrayEmpty(userArray, x)) {
                while (!isRegistration) {
                    userArray[x] = new User();
                    userArray[x].setName(nameRegistration());
                    userArray[x].setSurname(surnameRegistration());
                    userArray[x].setEmail(emailRegistration());
                    userArray[x].setLogin(loginRegistration(userArray));
                    if (isLogin) userArray[x].setPassword(passwordRegistration());
                    if (isLogin) isConfirmPassword(userArray[x].getPassword());
                }
                break;
            }
        }
        setSaveUser(userArray);
    }

    public boolean isArrayFull(User[] userArray) {

        if (!file.isFile()) {
            return false;
        }
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("user.ser"));
            for (int y = 0; y < userArray.length; y++) {
                userArray[y] = (User) os.readObject();
                if (userArray[userArray.length - 1] != null) {
                    return true;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }


    public boolean isCellArrayEmpty(User[] userArray, int x) {
        if (file.isFile()) {
            try {
                ObjectInputStream os = new ObjectInputStream(new FileInputStream("user.ser"));
                for (int y = 0; y < userArray.length; y++) {
                    userArray[y] = (User) os.readObject();
                    if (x == y && userArray[y] != null) {
                        return false;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return true;
    }

    public boolean isLoginBusy(User[] userArray, String login) {
        User[] userArrayService = new User[userArray.length];
        for (User user : userArray) {
            if (user != null && user.getLogin() != null && user.getLogin().equals(login)) {
                return false;
            }
        }
        if (file.isFile()) {
            try {
                ObjectInputStream os = new ObjectInputStream(new FileInputStream("user.ser"));
                for (int y = 0; y < userArray.length; y++) {
                    userArrayService[y] = (User) os.readObject();
                    if (userArrayService[y] != null && userArrayService[y].getLogin().equals(login)) {
                        return false;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return true;
    }

    public void setSaveUser(User[] userArray) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("user.ser"));

            for (User ob : userArray) {
                os.writeObject(ob);
            }
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String nameRegistration() {
        String name = null;
        System.out.println("Регистрация. Введите ваше имя.");
        for (int y = 2; y >= 0; y--) {
            name = scanner.nextLine();
            if (name.length() == 0) {
                System.out.println("Вы не ввели имя. Повторите ввод.\nОставшееся количество попыток: " + y);
                continue;
            }
            break;
        }
        return name;
    }

    public String surnameRegistration() {
        String surname = null;
        System.out.println("Регистрация. Введите вашу фамилию.");
        for (int y = 2; y >= 0; y--) {
            surname = scanner.nextLine();
            if (surname.length() == 0) {
                System.out.println("Вы не ввели фамилию. Повторите ввод.\nОставшееся количество попыток: " + y);
                continue;
            }
            break;
        }
        return surname;
    }

    public String emailRegistration() {
        String email = null;
        System.out.println("Регистрация. Введите ваш email.");
        for (int y = 2; y >= 0; y--) {
            email = scanner.nextLine();
            if (email.length() == 0) {
                System.out.println("Вы не ввели email. Повторите ввод.\nОставшееся количество попыток: " + y);
                continue;
            }
            break;
        }
        return email;
    }

    public String loginRegistration(User[] userArray) {
        String login = null;
        System.out.println("Регистрация. Введите ваш login.");
        for (int y = 2; y >= 0; y--) {
            login = scanner.nextLine();
            if (y == 0) {
                System.out.println("Такой login занят. Увы, заново проходим регистрацию.");
                isLogin = false;
                continue;
            }
            if (login.length() == 0) {
                System.out.println("Вы не ввели login. Повторите ввод.\nОставшееся количество попыток: " + y);
                continue;
            }
            if (!isLoginBusy(userArray, login)) {

                System.out.println("Такой login занят, попробуйте ввести другой login.\nОставшееся количество попыток: " + y);
                continue;
            }
            isLogin = true;
            break;
        }
        return login;
    }

    public String passwordRegistration() {
        String password = null;
        System.out.println("Регистрация. Введите ваш password.");
        for (int y = 2; y >= 0; y--) {
            password = scanner.nextLine();
            if (password.length() == 0) {
                System.out.println("Вы не ввели password. Повторите ввод.\nОставшееся количество попыток: " + y);
                continue;
            }
            break;
        }
        return password;
    }

    public boolean isConfirmPassword(String password) {
        String confirmPassword = null;
        System.out.println("Регистрация. Повторите ваш password.");
        for (int y = 2; y >= 0; y--) {
            confirmPassword = scanner.nextLine();
            if (confirmPassword.length() == 0) {
                System.out.println("Вы не ввели password. Повторите ввод.\nОставшееся количество попыток: " + y);
                continue;
            }
            if (!confirmPassword.equals(password)) {
                System.out.println("Пароль не совпадает. Увы, заново проходим регистрацию.");
                return isRegistration = false;
            }
            break;
        }
        return isRegistration = true;
    }
}
