package com.teachMeSkills.an15.BuzukArtyom.hw8;

import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Product;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.User;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.MenuService;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.impl.MenuServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


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
        User user = new User("admin","admin");
        HashMap<String,User> users = new HashMap<>();
        users.put("admin",user);
        ArrayList<Product>products = new ArrayList<>();
        HashSet<String>carNames = new HashSet<>();
        carNames.add("BMW");
        carNames.add("Audi");
        BigDecimal bigDecimal = new BigDecimal(100);
        Product product = new Product("Maslo",bigDecimal,3,"Дорогое масло",carNames);
        HashSet<String>carNames1 = new HashSet<>();
        carNames1.add("Lada");
        BigDecimal bigDecimal1 = new BigDecimal(21.32);
        Product product1 = new Product("Magnitola",bigDecimal1,5,"Магнитола топовая",carNames1);
        products.add(product);
        products.add(product1);
        menuService.menuAuth(user,users,product,products);
    }
}
