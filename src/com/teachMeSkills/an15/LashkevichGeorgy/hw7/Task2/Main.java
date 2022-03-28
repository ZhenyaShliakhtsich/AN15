package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2;
//Разработать консольное приложение при запуске которого просят авторизировать пользователя.
//Если залогиниться как админ, то можно добавлять, удалять, изменять информацию об автозапчасти.

//Если логиниться как пользователь, то появляется доступ поиска по названию его машины и по разделам
// (подвеска - шаровая, ступица и тд, двс - масло, прокладки и тд) разделов должно быть 3.

//Раздел в себе содержит запчасти.
//Запчасть содержит в себе название, цену, отзыв, среднюю оценку, количество и машины, к которым она подходит.

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.User;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.AuthService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.PriceService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.UserService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl.AuthServiceImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl.PriceServiceImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl.UserServiceImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.Product;


import java.util.ArrayList;
import java.util.HashMap;


//Пользователь может написать отзыв к детали и поставить оценку. Оценка должна калькулироваться средняя.
// Пользователь может получить скидку до 30 процентов. Размер скидки рассчитать рандомом.
// Пользователь может добавлять товар в корзину и удалять, оплатить всю корзину целиков посредством ввода в консоль «Оплачиваю».
// После оплаты количество деталей должно уменьшиться.
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        HashMap<User, User> users = new HashMap<>();
        AuthService authService = new AuthServiceImpl();
        authService.registration(users);
        ArrayList<Product> products = new ArrayList<>();
        UserService userService = new UserServiceImpl();
        //HashMap<User, User> authUser = authService.login(users);

        /*UserServiceImpl userService = new UserServiceImpl();
         userService.addProduct(products);
        userService.addProduct(products);
        userService.changeProduct(products);
        userService.deleteProduct(products);
        userService.addProductToBasket((User) authUser, products);
        userService.addProductToBasket((User) authUser, products);
        PriceService priceService = new PriceServiceImpl();
        priceService.calculateTotalBasketPrice((User) authUser);*/



        authService.registration(users);
        HashMap<User, User> authUser = authService.login(users);
        if (users.get(authUser).isHasAdminRole()) {
            userService.changeProduct(products);
        }


    }
}
