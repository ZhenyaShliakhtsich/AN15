package com.teachMeSkills.an15.MatveevArtyom.hw7;

import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.Blog;
import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.RegistrationAndAuthorisation;
import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.User;
import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.service.BlogService;
import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.service.Impl.BlogServiceImpl;
import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.service.Impl.RegistrationServiceImpl;
import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.service.RegistrationService;

public class Main {
    public static void main(String[] args) {
        RegistrationService registrationService = new RegistrationServiceImpl();
        BlogService blogService = new BlogServiceImpl();
        Blog blog = new Blog();
        RegistrationAndAuthorisation registration = new RegistrationAndAuthorisation();
        RegistrationAndAuthorisation authorisation = new RegistrationAndAuthorisation();
        User user = new User();
        user.setRegistrationAndAuthorisation(registrationService.registration(registration));
        System.out.println("Вы зарегистрировались!");
        user.setRegistrationAndAuthorisation(registrationService.authorisation(registration, authorisation));
        System.out.println("Вы успешно авторизировались!");
        user.setRegistrationAndAuthorisation(registrationService.showAndChangeData(authorisation));
        user.setBlog(blogService.createBlogAndAddPosts(blog));
        user.setBlog(blogService.printBlog(blog));
        System.out.println(user.getBlog());
        user.setBlog(blogService.changePost(blog));
    }
}
