package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.OnlyOneNumberReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.enums.AdminMenuEnum;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu.MenuService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.UserService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl.UserServiceImpl;

public class MenuServiceAdminImpl implements MenuService {
    private OnlyOneNumberReaderService numberReader = new OnlyOneNumberReaderServiceImpl();
    private UserService service = new UserServiceImpl();

    @Override
    public void createMenu(User user) {
        //Read enum
        System.out.printf("----------\nAdmin menu (%s):\n", user.getLogin());
        for (AdminMenuEnum s : AdminMenuEnum.values()) {
            System.out.println(" " + s.getMenuItemNumber() + " - " + s);
        }

        //Make choice
        System.out.println("----------\nChoose menu item (by number):");
        switch (numberReader.readNumberFromConsole()) {
            case 0:
                System.out.println("The End. Logout");
                break;
            case 1:
                System.out.println("NOW ADD_PRODUCT");
                service.addProduct();
                createMenu(user);
                break;
            case 2:
                System.out.println("NOW DELETE_PRODUCT");
                service.deleteProduct();
                createMenu(user);
                break;
            case 3:
                System.out.println("NOW EDIT_PRODUCT");
                service.changeProduct();
                createMenu(user);
                break;
            case 4:
                System.out.println("NOW SHOW_PRODUCTS ");
                service.showProducts();
                createMenu(user);
                break;
            default:
                System.out.println("Ты не попал по нужной цифре. Попробуй еще раз");
                createMenu(user);
                break;
        }

    }

    @Override
    public void createMenu() {

    }
}
