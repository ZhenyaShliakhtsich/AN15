package com.teachMeSkills.an15.NovikovVadim.hw8;

import com.teachMeSkills.an15.NovikovVadim.hw8.model.Product;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.DataBaseService;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.MenuServices;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.impl.DataBaseServiceImpl;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.impl.MenuServicesImpl;

import java.util.ArrayList;
import java.util.HashMap;

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

        DataBaseService dbService = new DataBaseServiceImpl();
        Object[] objects = dbService.loadDB();

        HashMap<String, User> users = (HashMap<String, User>) objects[0];
        ArrayList<Product> products = (ArrayList<Product>) objects[1];

        MenuServices menuServices = new MenuServicesImpl();
        menuServices.menu(users, products);

    }

}
