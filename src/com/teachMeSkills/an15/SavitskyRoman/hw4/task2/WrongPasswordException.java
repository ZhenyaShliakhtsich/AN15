package com.teachMeSkills.an15.SavitskyRoman.hw4.task2;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    public void getWrongPasswordException() {
        System.out.println("\nНеверный пароль! Введите пароль, состоящий из латинских букв, нижнего подчеркивания и цифр, а так же пароль не должен превышать 20 символов");
    }
}
