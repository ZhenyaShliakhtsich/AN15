package com.teachMeSkills.an15.TuskalSergey.hw7.Task2;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.Basket;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.Product;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.User;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.MenuService;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.impl.MenuServiceImpl;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//Разработать консольное приложение при запуске которого просят авторизировать пользователя.
//Если залогиниться как админ, то можно добавлять, удалять, изменять информацию об автозапчасти.
//Если логиниться как пользователь, то появляется доступ поиска по названию его машины
//Запчасть содержит в себе название, цену, отзыв, среднюю оценку, количество и машины, к которым она подходит.
//Пользователь может написать отзыв к детали и поставить оценку. Оценка должна калькулироваться средняя.
// Пользователь может получить скидку до 30 процентов. Размер скидки рассчитать рандомом.
// Пользователь может добавлять товар в корзину и удалять, оплатить всю корзину целиком
// посредством ввода в консоль «Оплачиваю».
// После оплаты количество деталей должно уменьшиться.
// Чек выводить в отдельный файл с название receipt_{{current_date}}
public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, User> users = new HashMap<>();
        ArrayList<Product> products = new ArrayList<>();
        defaultInitialization(users, products);
        MenuService menuService = new MenuServiceImpl();
        menuService.authMenu();
    }

    public static void defaultInitialization(HashMap<String, User> users, ArrayList<Product> products) {
        User admin = new User("admin", "admin");
        admin.setHasAdminRole(true);
        User user = new User("user1", "user1", new Basket());
        users.put(admin.getLogin(), admin);
        users.put(user.getLogin(), user);
        HashSet<String> carNames = new HashSet<>();
        carNames.add("фольксваген");
        carNames.add("тойота");

        Product product1 = new Product("глушитель",
                new BigDecimal(99.99).setScale(2, RoundingMode.HALF_UP),
                1, "оригинальный", carNames);
        Product product2 = new Product("сцепление",
                new BigDecimal(199.99).setScale(2, RoundingMode.HALF_UP),
                5, "оригинальное", carNames);
        products.add(product1);
        products.add(product2);
    }
}

