package com.teachMeSkills.an15.PilyushinYuri.hw8.task2;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Basket;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Product;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl.AuthServiceImpl;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl.MenuServiceImpl;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl.UserServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

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
        HashMap<String, User> users = new HashMap<>();
        ArrayList<Product> products = new ArrayList<>();

        MenuServiceImpl menuService = new MenuServiceImpl();
        User admin = new User("admin", "adminPass");
        User user1 = new User("login1", "pass1");
        users.put(admin.getLogin(), admin);
        users.put(user1.getLogin(), user1);
        Product product1 = new Product("масло", new BigDecimal(50.08), 25,"",new HashSet<String>());
        Product product2 = new Product("свечи", new BigDecimal(16.96), 150,"",new HashSet<String>());
        Product product3 = new Product("фильтр", new BigDecimal(29.11), 30,"",new HashSet<String>());
        products.add(product1);
        products.add(product2);
        products.add(product3);
        admin.setHasAdminRole(true);
        menuService.authMenu(users, products);





    }


}





