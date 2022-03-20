package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.Blog;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.Post;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.EditUserPostService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.LineReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.OnlyOneNumberReaderServiceImpl;

import java.util.ArrayList;

public class EditUserPostServiceImpl implements EditUserPostService {
    @Override
    public void editPost(User user) {
        ArrayList<Post> postList = new ArrayList<>();
        Blog blog = user.getUserBlog();
        Post post;
        int numberToEdit;
        try {
            System.out.println("В твоем блоге постов:");
            postList = user.getUserBlog().getPostsList();
            System.out.println(postList);
        } catch (NullPointerException e) {
            System.out.println("Нет от слова совсем!!!");
            new MainMenuCreationServiceImpl().createMenuList(user);
        }

        System.out.println("Ну выбирай пост который отредактируем?");
        //будем проверять чтобы то что мы введем было в пределах массива
        while ((numberToEdit = new OnlyOneNumberReaderServiceImpl().readNumberFromConsole()) >
                postList.size()) {
            System.out.println("Так дело не пойдет. Нужно выбрать реальный номер поста");
        }

        post = postList.get(numberToEdit);
        System.out.println("Редачим этот пост - " + post);

        postList.get(numberToEdit).setPostName(new LineReaderServiceImpl().readLine("Введи новое имя поста"));
        postList.get(numberToEdit).setPostText(new LineReaderServiceImpl().readLine("Введи новый текст поста"));

        blog.setPostsList(postList);
        user.setUserBlog(blog);

        new MainMenuCreationServiceImpl().createMenuList(user);
    }
}
