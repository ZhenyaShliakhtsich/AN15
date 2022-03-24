package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.OnlyOneNumberReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.enums.UserMenuEnum;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.MenuService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.UserService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl.UserServiceImpl;

import java.util.HashSet;

public class MenuServiceUserImpl implements MenuService {
    private OnlyOneNumberReaderService numberReader = new OnlyOneNumberReaderServiceImpl();
    private UserService service = new UserServiceImpl();

    @Override
    public void createMenu(User user, HashSet<Product> storage) {
        //Read enum
        System.out.printf("----------\nUser menu (%s):\n", user.getLogin());
        for (UserMenuEnum s : UserMenuEnum.values()) {
            System.out.println(" " + s.getMenuItemNumber() + " - " + s);
        }

        //Make choice
        System.out.println("----------\nChoose menu item (by number):");
        switch (numberReader.readNumberFromConsole()) {
            case 0:
                System.out.println("The End. Logout");
                break;
            case 1:
                System.out.println("NOW ADD_PRODUCT_TO_BASKET");
                user = service.addProductToBasket(user, storage);
                createMenu(user,storage);
                break;
            case 2:
                System.out.println("NOW DELETE_PRODUCT_FROM_BASKET");
                service.deleteProductFromBasket(user);
                createMenu(user,storage);
                break;
            case 3:
                System.out.println("NOW PAY_FOR_BASKET");
//                service.payForBasket();
                break;
            case 4:
                System.out.println("NOW RATE_PRODUCT");
//                service.rateProduct();
                break;
            case 5:
                System.out.println("NOW COMMENT_PRODUCT");
//                service.commentProduct();
                break;
            case 6:
                System.out.println("YOUR_BASKET");
                service.showBasket(user);
                createMenu(user,storage);
                break;
            default:
                System.out.println("The End. Logout");
                break;
        }

    }
}
