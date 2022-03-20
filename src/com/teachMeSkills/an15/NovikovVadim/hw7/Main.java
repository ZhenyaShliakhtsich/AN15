package com.teachMeSkills.an15.NovikovVadim.hw7;

import com.teachMeSkills.an15.NovikovVadim.hw7.services.*;
import com.teachMeSkills.an15.NovikovVadim.hw7.services.impl.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        ProjectDataBase db = new ProjectDataBase();
        ArrayList<User> users = db.readBase(db.FILENAME);
        User user = new User();

        UserService userService = new UserServiceImpl();
        switch (userService.chooseAnAuthorizationMethod()) {
            case ВХОД: {
                Authorization authorization = new AuthorizationImpl();
                user = authorization.login(users);
                //стоит еще проверить пароль - упустил этот момент
                break;
            }
            case РЕГИСТРАЦИЯ: {
                Registration registration = new RegistrationImpl();
                user = new User();
                registration.login(users, user);
                registration.password(user);
                users.add(user);
                break;
            }
        }

        if (OtherConst.ДА == userService.chooseAnInformation()) {
            userService.showInformation(user);
            userService.changeInformation(users, user);
        }

        BlogService blogService = new BlogServiceImpl();
        blogService.showBlogs(user);
        Blog blog = blogService.enterBlog(user);

        PostService postService = new PostServiceImpl();
        postService.showPosts(blog);
        Post post = postService.enterPost(blog);
        postService.enterText(post);

        db.writeBase(db.FILENAME, users);

    }

}
