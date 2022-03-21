package com.teachMeSkills.an15.NovikovVadim.hw7.services.impl;

import com.teachMeSkills.an15.NovikovVadim.hw7.Blog;
import com.teachMeSkills.an15.NovikovVadim.hw7.User;
import com.teachMeSkills.an15.NovikovVadim.hw7.services.BlogService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BlogServiceImpl implements BlogService {
    @Override
    public Blog enterBlog(User user) {
        Blog blog = enterBlogOperation(user);
        user.setBlogs(blog);
        return blog;
    }

    private Blog enterBlogOperation(User user) {

        while (true) {
            System.out.println("Введите имя блога");
            Scanner scanner = new Scanner(System.in);
            String nameBlog = scanner.nextLine();
            Blog blog = new Blog();
            boolean isEnterBlog = true;

            for (Blog userBlog : user.getBlogs()) {
                if (userBlog.getName().equalsIgnoreCase(nameBlog)) {
                    isEnterBlog = false;
                    blog = userBlog;
                }
            }


            if (isEnterBlog) {
                blog.setName(nameBlog);
                return blog;
            } else {
                System.out.println("Блог с таким именем уже существует: \n\t1. Ввести другое имя. \n\t2. Удалить старый блог. \n\t3. Просмотреть список блогов.\n\t4. Выбрать этот блог.");
                String answer = scanner.next();
                switch (answer) {
                    case ("1"): {
                        continue;
                    }
                    case ("2"): {
                        user.getBlogs().remove(blog);
                        blog = new Blog();
                        blog.setName(nameBlog);
                        return blog;
                    }
                    case ("3"): {
                        System.out.println(Arrays.toString(new ArrayList[]{user.getBlogs()}));
                        continue;
                    }
                    case ("4"): {
                        return blog;
                    }
                }

            }
        }


    }

    @Override
    public void showBlogs(User user) {
        int i = 0;

        System.out.println("Список блогов:");
        for (Blog iterBlog : user.getBlogs()) {
            i++;
            System.out.println("№ " + i + ". " + iterBlog.getName());
        }

    }
}
