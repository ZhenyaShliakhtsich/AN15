package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.menu.MenuServiceImpl;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Basket;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;

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
        User admin = new User("admin", "admin", new Basket());
        admin.setHasAdminRole(true);
        User user = new User("login", "password", new Basket());
        ArrayList<Product> productsBasket = new ArrayList<>();
        user.getBasket().setProducts(productsBasket);
        HashMap<String, User> users = new HashMap<>();
        users.put(admin.getLogin(), admin);
        users.put(user.getLogin(), user);
        BigDecimal price1 = new BigDecimal(12);
        BigDecimal price2 = new BigDecimal(12);
        BigDecimal price3 = new BigDecimal(12);
        ArrayList<Integer> rates1 = new ArrayList<>();
        rates1.add(2);
        rates1.add(5);
        rates1.add(3);
        ArrayList<Integer> rates2 = new ArrayList<>();
        rates2.add(1);
        rates2.add(3);
        rates2.add(5);
        ArrayList<Integer> rates3 = new ArrayList<>();
        rates3.add(2);
        rates3.add(5);
        HashSet<String> cars1 = new HashSet<>();
        cars1.add("BMW");
        cars1.add("Audi");
        HashSet<String> cars2 = new HashSet<>();
        cars2.add("BWM");
        cars2.add("Renault");
        HashSet<String> cars3 = new HashSet<>();
        cars3.add("Renault");
        cars3.add("Ford");
        ArrayList<String> comments1 = new ArrayList<>();
        comments1.add("Клёво");
        ArrayList<String> comments2 = new ArrayList<>();
        ArrayList<String> comments3 = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product("1",price1,3,comments1,cars1,rates1);
        Product product2 = new Product("2",price2,5,comments2,cars2,rates2);
        Product product3 = new Product("3",price3,3,comments3,cars3,rates3);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        MenuServiceImpl menuServiceImpl = new MenuServiceImpl();
        menuServiceImpl.authMenu(user,products,users);

    }
}
