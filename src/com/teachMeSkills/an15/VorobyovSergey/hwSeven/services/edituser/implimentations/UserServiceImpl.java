package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.Blog;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.UserService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.LineReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.LineReaderServiceImpl;

public class UserServiceImpl implements UserService {
    @Override
    public User editFirstName(User user) {
        User user1 = user;
        LineReaderService line = new LineReaderServiceImpl();
        user1.setUserFirstName(line.readLine("Введите имя пользователя"));
        return user1;
    }

    @Override
    public User editLastName(User user) {
        User user1 = user;
        LineReaderService line = new LineReaderServiceImpl();
        user1.setUserLastName(line.readLine("Введите фамилию пользователя"));
        return user1;
    }

    @Override
    public User editEmail(User user) {
        User user1 = user;
        String str;
        String regex = "^(.+)@(.+)$";
        LineReaderService line = new LineReaderServiceImpl();
        do {
            str = line.readLine("Введите email пользователя");
        }
        while (!str.matches(regex));
        user1.setUserEmail(str);
        return user1;
    }

    @Override
    public User editLogin(User user) {
        User user1 = user;
        LineReaderService line = new LineReaderServiceImpl();
        user1.setUserLogin(line.readLine("Введите логин пользователя"));
        return user1;
    }

    @Override
    public User editPassword(User user) {
        User user1 = user;
        String password;
        String passwordConfirmed;
        LineReaderService line = new LineReaderServiceImpl();
        password = line.readLine("Введите пароль пользователя");
        passwordConfirmed = line.readLine("Повторите пароль пользователя");
        while (!password.equals(passwordConfirmed)) {
            System.out.println("Вы не смогли повторить пароль!!!! Пробуем еще раз!!!");
            password = line.readLine("Введите пароль пользователя");
            passwordConfirmed = line.readLine("Повторите пароль пользователя");
        }

        user1.setUserPassword(passwordConfirmed);
        return user1;
    }

    @Override
    public User editBlog(User user) {
        User user1 = user;
        LineReaderService line = new LineReaderServiceImpl();
        Blog blog = new Blog();
        blog.setBlogName(line.readLine("Введите имя вашего блога"));
        user1.setUserBlog(blog);
        return user1;
    }
}
