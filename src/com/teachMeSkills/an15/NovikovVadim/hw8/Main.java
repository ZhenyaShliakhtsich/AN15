package com.teachMeSkills.an15.NovikovVadim.hw8;

import com.teachMeSkills.an15.NovikovVadim.hw8.model.Product;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.MenuServices;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.impl.MenuServicesImpl;

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

        //наша база данных
        User user1 = new User("Вадим", "123");
        user1.setHasAdminRole(true);
        User user2 = new User("Вадим2", "123");
        user2.setHasAdminRole(false);

        HashMap<String, User> users = new HashMap<>();
        users.put(user1.getLogin(), user1);
        users.put(user2.getLogin(), user2);

        ArrayList<Product> products = new ArrayList<Product>();
        HashSet<String> carNames = new HashSet<>();
        carNames.add(EnumCars.AUID.getTitle());
        carNames.add(EnumCars.BMW.getTitle());
        carNames.add(EnumCars.VW.getTitle());
        Product product = new Product();
        product.setName("Руль");
        product.setPrice(new BigDecimal("100"));
        product.setCarNames(carNames);
        product.setAvgRate(10);
        products.add(product);

        HashSet<String> carNames1 = new HashSet<>();
        carNames1.add(EnumCars.Skoda.getTitle());
        carNames1.add(EnumCars.AUID.getTitle());
        carNames1.add(EnumCars.VW.getTitle());
        Product product1 = new Product();
        product1.setName("DSG");
        product1.setPrice(new BigDecimal("2000"));
        product1.setCarNames(carNames1);
        product1.setAvgRate(10);
        products.add(product1);



//        AuthService authService = new AuthServiceImpl();
//        User user3 = authService.authlogin(users, "", false);
//        users.put(user3.getLogin(), user3);
//        //User user4 = authService.registration(users);

        MenuServices menuServices = new MenuServicesImpl();
        menuServices.menu(users, products);

    }
}
