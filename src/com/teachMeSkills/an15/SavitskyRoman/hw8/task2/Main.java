package com.teachMeSkills.an15.SavitskyRoman.hw8.task2;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.User;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.AuthService;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.Menu;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.UserService;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.impl.AuthServiceImpl;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.impl.MenuImpl;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.impl.UserServiceImpl;

import java.util.HashMap;

//Разработать консольное приложение при запуске которого просят авторизировать пользователя.
//Если залогиниться как админ, то можно добавлять, удалять, изменять информацию об автозапчасти.
//Если логиниться как пользователь, то появляется доступ поиска по названию его машины
//Запчасть содержит в себе название, цену, отзыв, среднюю оценку, количество и машины, к которым она подходит.
//Пользователь может написать отзыв к детали и поставить оценку. Оценка должна калькулироваться средняя.
// Пользователь может получить скидку до 30 процентов. Размер скидки рассчитать рандомом.
// Пользователь может добавлять товар в корзину и удалять, оплатить всю корзину целиков посредством ввода в консоль «Оплачиваю».
// После оплаты количество деталей должно уменьшиться.
// Чек выводить в отдельный файл с название receipt_{{current_date}}
public class Main {
    public static void main(String[] args) {
        HashMap<User, User> users = new HashMap<>();
        AuthService authService = new AuthServiceImpl();
        UserService userService = new UserServiceImpl();
        Menu menu = new MenuImpl();
        menu.firstStage(authService, users, userService);
    }
}


