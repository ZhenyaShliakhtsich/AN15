package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.editpost.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.Post;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.editpost.AddUserPostService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.LineReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.LineReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.implimentations.UserParametersServiceBlogImpl;

public class AddUserPostServiceImpl implements AddUserPostService {
    @Override
    public void addPost(User user) {
        Post post = fillInPost();

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
            new UserParametersServiceBlogImpl().setParameter(user);
        }
        new MainMenuCreationServiceImpl().createMenuList(user);
    }

    Post fillInPost() {
        Post post = new Post();
        LineReaderService lineReaderService = new LineReaderServiceImpl();
        //Поменяли имя
        String name = lineReaderService.readLine("Введите имя поста:");
        post.setPostName(name);
        //Поменяли текст
        String text = lineReaderService.readLine("Введите текст поста:");
        if (text.length() <= 1000) {
            post.setPostText(text);
        } else {
            System.out.println("Пост длиннее чем 1000 символов, мы его чутка подрежем");
            text = text.substring(0, 1000);
            post.setPostText(text);
        }
        System.out.println("Твой новый пост - " + post);

        return post;
    }
}
