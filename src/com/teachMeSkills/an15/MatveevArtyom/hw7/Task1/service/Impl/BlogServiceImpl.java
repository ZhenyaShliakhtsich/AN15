package com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.service.Impl;

import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.Blog;
import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.service.BlogService;

import java.util.ArrayList;
import java.util.Scanner;

public class BlogServiceImpl implements BlogService {
    @Override
    public Blog createBlogAndAddPosts(Blog blog) {
        System.out.println("Создание блога");
        System.out.println("Введите название вашего блога: ");
        String nameOfBlog = new Scanner(System.in).nextLine();
        blog.setName(nameOfBlog);
        blog.setPosts(addPosts(blog));
        return blog;
    }

    @Override
    public ArrayList<String> addPosts(Blog blog) {
        ArrayList<String> postsOfBlog = new ArrayList<>();
        while (postsOfBlog.size() != 25) {
            System.out.println("Напишите свой пост!");
            String post = new Scanner(System.in).nextLine();
            postsOfBlog.add(post);
            System.out.println("Продолжить писать посты? (Yes/No)");
            String choose = new Scanner(System.in).nextLine();
            if (choose.equalsIgnoreCase("No")) {
                break;
            }
        }
        if (postsOfBlog.size() == 25) {
            System.out.println("Вы хотите ввести больше, чем 25 постов! \n" +
                    "какой пост вы хотите заменить(1 - 25)");
            int choose = new Scanner(System.in).nextInt();
            System.out.print("Вы хотите заменить пост: ");
            System.out.println(postsOfBlog.get(choose));
            System.out.print("Введите новй пост: ");
            String post = new Scanner(System.in).nextLine();
            postsOfBlog.set(choose + 1, post);
        }
        return postsOfBlog;
    }

    @Override
    public Blog printBlog(Blog blog) {
        System.out.println("Имя блога: ");
        System.out.println(blog.getName());
        System.out.println("Все посты блога: ");
        for (String post : blog.getPosts()) {
            if (post.length() >= 1000) {
                System.out.println("Количество символов вашего поста больше 1000, " +
                        "ваш пост будет обрезан до 1000 символов");
                post.substring(1000);
            }
        }
        return blog;
    }

    @Override
    public Blog changePost(Blog blog) {
        boolean flag = true;
        ArrayList<String> postsOfBlog = blog.getPosts();
        while (flag) {
            System.out.println("Если вы хотите изменить пост, нажмите - 1\n" +
                    "Если нет, то нажмите любой другой символ");
            int choose = new Scanner(System.in).nextInt();
            if (choose == 1) {
                System.out.println("Выберите цифрой от 1 какой пост вы хотите изменить: ");
                int chooseOfPost = new Scanner(System.in).nextInt();
                System.out.print("Вы хотите заменить пост: ");
                System.out.println(postsOfBlog.get(chooseOfPost - 1));
                System.out.print("Введите новй пост: ");
                String post = new Scanner(System.in).nextLine();
                postsOfBlog.set(chooseOfPost - 1, post);
                System.out.println("Теперь ваш блог стал таким: ");
                System.out.println(blog.getPosts());
            } else {
                flag = false;
            }
        }
        blog.setPosts(postsOfBlog);
        return blog;
    }
}
