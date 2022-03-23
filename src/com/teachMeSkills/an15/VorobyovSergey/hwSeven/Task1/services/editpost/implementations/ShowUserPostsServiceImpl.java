package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.editpost.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.editpost.ShowUserPostsService;

public class ShowUserPostsServiceImpl implements ShowUserPostsService {
    @Override
    public void showPosts(User user) {
        try {
            System.out.println("В твоем блоге постов:");
            System.out.println(user.getUserBlog().getPostsList());
        } catch (NullPointerException e) {
            System.out.println("Нет от слова совсем!!!");
        }
        new MainMenuCreationServiceImpl().createMenuList(user);
    }
}
