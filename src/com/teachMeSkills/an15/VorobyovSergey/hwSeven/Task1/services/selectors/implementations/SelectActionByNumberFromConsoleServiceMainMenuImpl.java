package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.selectors.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.DataBase;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.implementations.EditUserMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.editpost.implementations.AddUserPostServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.editpost.implementations.EditUserPostServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.editpost.implementations.ShowUserPostsServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.edituser.implimentations.ShowUserAccountServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.selectors.SelectActionByNumberFromConsoleService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.OnlyOneNumberReaderService;

public class SelectActionByNumberFromConsoleServiceMainMenuImpl implements SelectActionByNumberFromConsoleService {
    @Override
    public void selectActionByNumber(DataBase dataBase) {

    }

    @Override
    public void selectActionByNumber(User user) {
        OnlyOneNumberReaderService numberReader = new OnlyOneNumberReaderServiceImpl();
        System.out.println("----------\nВыберите пункт главного меню (цифрой):");
        switch (numberReader.readNumberFromConsole()) {
            case 0:
                System.out.println("The End. Logout");
                break;
            case 1:
                new ShowUserAccountServiceImpl().showUserAccount(user);
                break;
            case 2:
                new EditUserMenuCreationServiceImpl().createMenuList(user);
                break;
            case 3:
                new AddUserPostServiceImpl().addPost(user);
                break;
            case 4:
                new ShowUserPostsServiceImpl().showPosts(user);
                break;
            case 5:
                new EditUserPostServiceImpl().editPost(user);
                break;
            default:
                new MainMenuCreationServiceImpl().createMenuList(user);
                break;
        }
    }
}
