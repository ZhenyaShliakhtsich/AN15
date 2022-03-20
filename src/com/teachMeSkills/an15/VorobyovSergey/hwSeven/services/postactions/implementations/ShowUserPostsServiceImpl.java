package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.postactions.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.postactions.ShowUserPostsService;

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
