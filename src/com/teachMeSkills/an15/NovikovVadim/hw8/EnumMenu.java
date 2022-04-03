package com.teachMeSkills.an15.NovikovVadim.hw8;

public enum EnumMenu {
    Menu("Основное меню"),
    Menu_Exit("Выход из программы"),
    Menu_Admin("Продолжить как амдинистратор"),
    Menu_User("Продожить как пользователь"),

    Sign("Вход / регистрация"),
    Sign_Auth("Авторизоваться"),
    Sign_Reg("Зарегистрироваться"),
    Sign_Login("Введите логин"),
    Sign_Pass("Введите пароль"),
    Sign_OtherLogin("Ввести другой логин"),

    //Пользователь может написать отзыв к детали и поставить оценку. Оценка должна калькулироваться средняя.
    //Если логиниться как пользователь, то появляется доступ поиска по названию его машины
    // Пользователь может добавлять товар в корзину и удалять, оплатить всю корзину целиков посредством ввода в консоль «Оплачиваю».
    ProductUser("Меню пользователя"),
    ProductUser_show("Просмотреть список запачастей"),
    ProductUser_searchCarName("Поиск запчастей по марке автомобиля"),
    ProductUser_searchName("Поиск запчастей по названию"),
    ProductUser_comment("не реализовано - Отзыв на товар"),
    ProductUser_rate("не реализовано - Оценка товара от 1 до 5, где 5 - это отлично"),

    ProductBasket("Меню корзины"),
    ProductBasket_showBasket("Просмотреть корзину"),
    ProductBasket_add("Добавить в корзину"),
    ProductBasket_del("Удалить из корзины"),
    ProductBasket_pay("Оплатить товар"),

    ProductAdmin("Меню админа"),
    ProductAdmin_add("Добавить запачасть"),
    ProductAdmin_del("Удалить запачасть"),
    ProductAdmin_change("Изменить запачасть"),
    ProductAdmin_show("Просмотреть список запачастей"),

    ProductChangeMenu("Меню редактирования"),
    ProductChangeMenu_name("Установить наименование"),
    ProductChangeMenu_cost("Установить стоимость"),
    ProductChangeMenu_amount("Установить количество"),
    ProductChangeMenu_carModels("Установить список марок автомобилей");

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
