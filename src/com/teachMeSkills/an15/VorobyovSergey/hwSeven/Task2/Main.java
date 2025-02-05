package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2;

//Разработать консольное приложение при запуске которого просят авторизировать пользователя.

//Если залогиниться как админ, то можно добавлять, удалять, изменять информацию об автозапчасти.
//Если логиниться как пользователь, то появляется доступ поиска по названию его машины

//Запчасть содержит в себе название, цену, отзыв, среднюю оценку, количество и машины, к которым она подходит.
//Пользователь может написать отзыв к детали и поставить оценку. Оценка должна калькулироваться средняя.
// Пользователь может получить скидку до 30 процентов. Размер скидки рассчитать рандомом.
// Пользователь может добавлять товар в корзину и удалять, оплатить всю корзину целиков посредством ввода в консоль «Оплачиваю».
// После оплаты количество деталей должно уменьшиться.

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.MenuService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.impl.MenuServiceStartImpl;

//Заиспользуем пару сервисов из предыдущего задания для экономии времени!!!
public class Main {
    public static void main(String[] args) {
        MenuService menuService = new MenuServiceStartImpl();
        menuService.createMenu();
    }
}
