package com.teachMeSkills.an15.SavitskyRoman.hw4.task2;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    public void getWrongLoginException() {
        System.out.println("\nНеверный логин! Введите логин, состоящий из латинских букв, нижнего подчеркивания и цифр, а так же логин не должен превышать 20 символов");
    }
}
