package com.teachMeSkills.an15.PilyushinYuri.hw8.task2;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Product;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl.AuthServiceImpl;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
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
        HashMap<User, User> users = new HashMap<>();
        ArrayList<Product> products = new ArrayList<>();
        UserServiceImpl userService = new UserServiceImpl();
        AuthServiceImpl authService = new AuthServiceImpl();
        User admin = new User("admin", "adminPass");
        admin.setHasAdminRole(true);
        authService.registration(users);
        Scanner scanner = new Scanner(System.in);
        if (authService.login(users).equals(admin)) {
            StringBuilder stringBuilder = new StringBuilder("выберите действие:");
            stringBuilder.append("добавить продукт");
            stringBuilder.append("изменить продукт");
            stringBuilder.append("удалить продукт");
            stringBuilder.append("вернуться к авторизации");
            System.out.println(stringBuilder);
            String choise = scanner.nextLine();
            switch (choise) {
                case "добавить продукт":
                    userService.addProduct(products);
                    break;

                case "изменить продукт":
                    userService.changeProduct(products);
                    break;

                case "удалить продукт":
                    userService.deleteProduct(products);
                    break;
                case "вернуться к авторизации":
                    authService.login(users);
                    break;
                default:
                    System.out.println("выберите один из пунктов");
            }








        }
    }


}



