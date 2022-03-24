package com.teachMeSkills.an15.NovikovVadim.hw8;

public enum EnumMenu {
    Menu("Основное меню"),
    Menu_Exit("Выход из программы"),
    Menu_Admin("Продолжить как амдинистратор"),
    Menu_User("Продожить как пользователь - (не реализован)"),

    Sign("Вход / регистрация"),
    Sign_Auth("Авторизоваться"),
    Sign_Reg("Зарегистрироваться"),
    Sign_Login("Введите логин"),
    Sign_Pass("Введите пароль"),
    Sign_OtherLogin("Ввести другой логин"),

    ProductUser("Меню пользователя"),

    ProductAdmin("Меню админа"),
    ProductAdmin_add("Добавить запачасть"),
    ProductAdmin_del("Удалить запачасть"),
    ProductAdmin_change("Изменить запачасть - (не реализован)"),
    ProductAdmin_show("Просмотреть список запачастей"),

    ProductChangeMenu("Меню редактирования"),
    ProductChangeMenu_name("Установить наименование"),
    ProductChangeMenu_cost("Установить стоимость"),
    ProductChangeMenu_amount("Установить количество");

    private String title;

    EnumMenu(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
