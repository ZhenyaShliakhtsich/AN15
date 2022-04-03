package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.editpost.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.Post;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.edituser.implimentations.UserServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.editpost.AddUserPostService;

public class AddUserPostServiceImpl implements AddUserPostService {
    @Override
    public void addPost(User user) {
        Post post = new FillPostServiceImpl().fillInPleas();

        //Теперь добавим все это в список постов блога
        try {
            if (user.getUserBlog().getPostsList().size() < 25) {
                user.getUserBlog().getPostsList().add(post);
            } else {
                new SelectPostToReplaceImpl().replacePost(user, post);
            }
        } catch (NullPointerException e) {
            System.out.println("Твой блог пуст!!! Мы не можем туда ничего добавить." +
                    "\nДавай мы его создадим для начала!!!");
            new UserServiceImpl().editBlog(user);
        }
        new MainMenuCreationServiceImpl().createMenuList(user);
    }
}
