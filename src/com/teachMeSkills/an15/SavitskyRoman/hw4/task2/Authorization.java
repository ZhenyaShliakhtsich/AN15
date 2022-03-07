package com.teachMeSkills.an15.SavitskyRoman.hw4.task2;

public class Authorization {

    static String checkIn = "[A-Za-z_\\d]*";

    static boolean isCheck(String login, String password, String confirmPassword) {
        try {
            if (!login.matches(checkIn) || login.length() >= 20) {
                throw new WrongLoginException("Проверка соотвествия символов в логине: " + login.matches(checkIn)
                        + "\nили в длине логина, должна быть меньше 20: " + login.length());
            } else if (!password.matches(checkIn) || password.length() >= 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Проверка соотвествия символов в пароле: "
                        + password.matches(checkIn) + "\nили в длине пароля, должна быть меньше 20: " + password.length()
                        + "\nили же не верно введен пароль: " + password.equals(confirmPassword));
            }
        } catch (WrongLoginException e) {
            e.getWrongLoginException();
            System.out.println(e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            e.getWrongPasswordException();
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("\nПервый ввод. Правильно введен пароль и логин: " + isCheck("_klXCjlk", "lolll_2222", "lolll_2222"));
        System.out.println("\nВторой вод. Правильно введен пароль и логин: " + isCheck("pppkdpd_1234", "lolll_2222", "loll_2222"));
    }
}
