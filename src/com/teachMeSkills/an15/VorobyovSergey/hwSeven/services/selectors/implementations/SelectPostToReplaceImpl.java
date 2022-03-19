package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.Blog;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.Post;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.menu.implementations.MainMenuCreationServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.other.implementations.ShowUserPostsServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.LineReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.LineReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.selectors.SelectPostToReplace;

public class SelectPostToReplaceImpl implements SelectPostToReplace {
    @Override
    public void replacePost(User user, Post post) {
        System.out.println("Твое хранилище переполнено. Создадим пост и заменим им один из существующих.");
        Blog blog = user.getUserBlog();

        //Создаем новый пост но в главное меню не переходим пока
        Post post1 = post;

        System.out.println("Твой список постов сейчас:");
        System.out.println(blog.getPostsList());
        System.out.println("Ну выбирай пост который заменим?");
        int numberToReplace = 0;
        //будем проверять чтобы то что мы введем было в пределах массива
        while ((numberToReplace = new OnlyOneNumberReaderServiceImpl().readNumberFromConsole()) >
                blog.getPostsList().size()) {
            System.out.println("Так дело не пойдет. Нужно выбрать реальный номер поста");
        }
        //сюда добавим
        blog.getPostsList().add(numberToReplace, post);
        //а тот что сдвинем удалим
        blog.getPostsList().remove(numberToReplace + 1);
        //и все это присвоим пользователю, а пользователя вернем в главное меню
        user.setUserBlog(blog);

        new MainMenuCreationServiceImpl().createMenuList(user);
    }
}
