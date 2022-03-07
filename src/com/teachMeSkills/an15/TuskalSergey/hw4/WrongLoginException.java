package com.teachMeSkills.an15.TuskalSergey.hw4;

public class WrongLoginException extends Exception {
    String exceptionMessage;

    public WrongLoginException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public WrongLoginException() {

    }

    public static void wrongLoginMessage() {
        System.out.println("Логин может содержать только латинские буквы, цифры и " +
                "знак подчеркивания; длина логина - меньше 20 символов.");

    }


}
