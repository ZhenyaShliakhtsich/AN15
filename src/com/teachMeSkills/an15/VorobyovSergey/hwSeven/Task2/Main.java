package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2;

//Разработать консольное приложение при запуске которого просят авторизировать пользователя.

//Если залогиниться как админ, то можно добавлять, удалять, изменять информацию об автозапчасти.
//Если логиниться как пользователь, то появляется доступ поиска по названию его машины

//Запчасть содержит в себе название, цену, отзыв, среднюю оценку, количество и машины, к которым она подходит.
//Пользователь может написать отзыв к детали и поставить оценку. Оценка должна калькулироваться средняя.
// Пользователь может получить скидку до 30 процентов. Размер скидки рассчитать рандомом.
// Пользователь может добавлять товар в корзину и удалять, оплатить всю корзину целиков посредством ввода в консоль «Оплачиваю».
// После оплаты количество деталей должно уменьшиться.

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Basket;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.AuthService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl.AuthServiceImpl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;

//Заиспользуем пару сервисов из предыдущего задания для экономии времени!!!
public class Main {
    public static void main(String[] args) {
        //Create some users for example
        Basket basket = new Basket();
        User u1 = new User("l1", "p1", basket);
        User u2 = new User("l2", "p2", basket);
        User a1 = new User("a", "a", basket);
        a1.setHasAdminRole(true);
        //HashSet is something like database of users
        HashSet<User> database = new HashSet<>();
        database.add(u1);
        database.add(u2);
        database.add(a1);

        //Create set of cars
        HashSet<String> set1 = new HashSet<>();
        set1.add("Car 1");
        set1.add("Car 2");
        set1.add("Car 3");
        HashSet<String> set2 = new HashSet<>();
        set1.add("Car 2");
        set1.add("Car 4");
        //Create some products
        Product p1 = new Product("Product 1", new BigDecimal(1000), 10, "", set1);
        Product p2 = new Product("Product 2", new BigDecimal(2000), 20, "", set1);
        Product p3 = new Product("Product 3", new BigDecimal(3000), 30, "", set2);
        Product p4 = new Product("Product 4", new BigDecimal(4000), 40, "", set2);
        HashSet<Product> storage = new HashSet<>();
        storage.add(p1);
        storage.add(p2);
        storage.add(p3);
        storage.add(p4);

        //Next try to log in
        AuthService authService = new AuthServiceImpl();
        authService.login(database, storage);
        //That is it. After this we go throw services or stop the program
    }
}
