package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.EditUserMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.postactions.implementations.AddUserPostServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.postactions.implementations.EditUserPostServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.postactions.implementations.ShowUserPostsServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.implementations.ShowUserAccountServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.SelectActionByNumberFromConsoleService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.OnlyOneNumberReaderService;

public class SelectActionByNumberFromConsoleServiceMainMenuImpl implements SelectActionByNumberFromConsoleService {
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
