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
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.RateService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.UserService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl.AuthServiceImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl.PriceServiceImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl.RateServiceImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl.UserServiceImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.Product;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


//Пользователь может написать отзыв к детали и поставить оценку. Оценка должна калькулироваться средняя.
// Пользователь может получить скидку до 30 процентов. Размер скидки рассчитать рандомом.
// Пользователь может добавлять товар в корзину и удалять, оплатить всю корзину целиков посредством ввода в консоль «Оплачиваю».
// После оплаты количество деталей должно уменьшиться.
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        HashMap<User, User> users = new HashMap<>();
        AuthService authService = new AuthServiceImpl();
        ArrayList<Product> products = new ArrayList<>();
        UserService userService = new UserServiceImpl();
        RateService rateService = new RateServiceImpl();
        PriceService priceService = new PriceServiceImpl();
        User user = new User();
        flag = true;

        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Для регистрации тыкаем \"1\" (админа тоже регаем)\n" +
                    "Для авторизации тыкаем \"2\"\n" +
                    "Для входа в меню админа набрать \"3\"\n" +
                    "Для входа в меню юзера набрать \"4\"\n" +
                    "Для завершения работы приложения набрать \"100\"\n");
            boolean userFlag = true;
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    authService.registration(users);
                    break;
                case 2:
                    if (users.isEmpty()) {
                        System.out.println("Сначала зарегестрируйся пользователя\n");
                        break;
                    }
                    user = authService.login(users);
                    break;
                case 3:
                    if (user.isHasAdminRole()) {
                        while (userFlag) {
                            System.out.println("Для добавления продукта тыкаем \"1\"\n" +
                                    "Для изменения данных продукта тыкаем \"2\"\n" +
                                    "Чтобы удалить какой-нибудь продукт тыкаем \"3\"\n" +
                                    "Для выхода из меню тыкаем \"10\"");
                            Scanner scanner1 = new Scanner(System.in);
                            int userChoose = scanner1.nextInt();

                            switch (userChoose) {
                                case 1:
                                    userService.addProduct(products);
                                    break;
                                case 2:
                                    userService.changeProduct(products);
                                    break;
                                case 3:
                                    userService.deleteProduct(products);
                                    break;
                                case 10:
                                    userFlag = false;
                            }

                        }
                    } else System.out.println("Нужна авторизироваться как admin\n");
                    break;
                case 4:
                    if (!user.isHasAdminRole() && !users.isEmpty()) {
                        while (userFlag) {
                            System.out.println("Добавить продукт в корзину тыкаем \"1\"\n" +
                                    "Удалить продукт из корзины тыкаем \"2\"\n" +
                                    "Чтобы оценить продукт тыкаем \"3\"\n" +
                                    "Чтобы оставить комментарий продукту тыкаем \"4\"\n" +
                                    "Узнать стоимость продуктов в корзине с учетом скидыки" +
                                    " тыкаем \"5\"\n" +
                                    "Чтобы показать все товары тыкаем \"6\"\n" +
                                    "Для выхода из меню тыкаем \"10\"\n");
                            Scanner scanner5 = new Scanner(System.in);
                            int userChoose = scanner5.nextInt();
                            switch (userChoose) {
                                case 1:
                                    userService.addProductToBasket(user, products);
                                    break;
                                case 2:
                                    userService.deleteProductFromBasket(user);
                                    break;
                                case 3:
                                    userService.rateProduct(products);
                                    break;
                                case 4:
                                    userService.commentProduct(products);
                                    break;
                                case 5:
                                    System.out.println(priceService.calculateTotalBasketPrice(user));
                                    break;
                                case 6:
                                    userService.showProducts(products);
                                    break;

                                case 10:
                                    userFlag = false;
                            }
                        }
                    } else System.out.println("Нужно зарегестрировать пользователя. Админу сюда нельзя.\n");
                    break;
                case 100:
                    flag = false;
                    System.out.println("Приходите к нам иссттччооо");
                    break;
            }
        }


    }
}



