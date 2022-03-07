package com.teachMeSkills.an15.TuskalSergey.hw4;

public class WrongPasswordException extends Exception {
    String exceptionMessage;

    public WrongPasswordException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public WrongPasswordException() {

    }

    public static void wrongPasswordMessage() {
        System.out.println("Пароль может содержать только латинские буквы, цифры и " +
                "знак подчеркивания; длина пароля - меньше 20 символов.");

    }
}
