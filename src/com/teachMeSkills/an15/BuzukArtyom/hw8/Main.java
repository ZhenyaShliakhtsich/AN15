package com.teachMeSkills.an15.BuzukArtyom.hw8;

import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Basket;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Product;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.User;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.MenuService;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.impl.MenuServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static com.teachMeSkills.an15.BuzukArtyom.hw8.DataBase.USERS;

//Разработать консольное приложение при запуске которого просят авторизировать пользователя.
//Если залогиниться как админ, то можно добавлять, удалять, изменять информацию об автозапчасти.
//Если логиниться как пользователь, то появляется доступ поиска по названию его машины
//Запчасть содержит в себе название, цену, отзыв, среднюю оценку, количество и машины, к которым она подходит.
//Пользователь может написать отзыв к детали и поставить оценку. Оценка должна калькулироваться средняя.
// Пользователь может получить скидку до 30 процентов. Размер скидки рассчитать рандомом.
// Пользователь может добавлять товар в корзину и удалять, оплатить всю корзину целиков посредством ввода в консоль «Оплачиваю».
// После оплаты количество деталей должно уменьшиться.
public class Main {
    public static void main(String[] args) {
        MenuService menuService = new MenuServiceImpl();
        HashMap<String, User> users = new HashMap<>();
        ArrayList<Product> products = new ArrayList<>();
        defaultInitialization(users, products);
        menuService.menuAuth();
    }

    public static void defaultInitialization(HashMap<String, User> users, ArrayList<Product> products) {
        User admin = new User("admin", "admin", new Basket());
        admin.setHasAdminRole(true);
        User user = new User("Login", "password", new Basket());
        users.put(admin.getLogin(), admin);
        users.put(user.getLogin(), user);
        HashSet<String> oilCarNames = new HashSet<>();
        oilCarNames.add("BMW");
        oilCarNames.add("Audi");


        Product oil = new Product("Maslo", new BigDecimal(100), 3, "Дорогое масло", oilCarNames);
        HashSet<String> cdChangerCarNames = new HashSet<>();
        cdChangerCarNames.add("Lada");
        BigDecimal bigDecimal1 = new BigDecimal(210);
        Product cdChanger = new Product("Magnitola", bigDecimal1, 5, "Магнитола топовая", cdChangerCarNames);
        products.add(oil);
        products.add(cdChanger);
    }
}
