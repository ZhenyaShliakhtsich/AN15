package com.teachMeSkills.an15.PilyushinYuri.hw7.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw7.model.Blog;
import com.teachMeSkills.an15.PilyushinYuri.hw7.model.Post;
import com.teachMeSkills.an15.PilyushinYuri.hw7.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw7.service.BlogService;

import java.util.ArrayList;
import java.util.Scanner;

public class BlogServiceImpl implements BlogService {
    @Override
    public Blog newBlog(User user) {
        Scanner scanner = new Scanner(System.in);
        Blog blog = new Blog();
        System.out.println("Введите занвание блога:");
        blog.setName(scanner.nextLine());
        ArrayList<Post> posts = new ArrayList<>();
        blog.setPosts(posts);
        user.setBlog(blog);
        return user.getBlog();
    }

    @Override
    public void showBlog(User user) {
        if (user.getBlog().getPost().size() <= 25) {
            System.out.println(user.getBlog());
        } else {
            System.out.println("количество постов превысило лимит.Выберите пост для замены");
            Scanner scanner = new Scanner(System.in);
            String exchangePost = scanner.nextLine();
            scanner.close();
            for (int i = 0; i <= 25; i++) {
                if (exchangePost.equals(user.getBlog().getPost().get(i).getName())) {
                    user.getBlog().getPost().set(i, newPost(user));
                    user.getBlog().getPost().remove(25);
                }
            }
        }


    }

    @Override
    public Post newPost(User user) {
        Scanner scanner = new Scanner(System.in);
        Post post = new Post();
        System.out.println("Название поста:");
        post.setName(scanner.nextLine());
        System.out.println("Ваш пост:");
        scanner.close();
        if (post.getTextBlock().length() <= 1000) {
            post.setTextBlock(scanner.nextLine());
        } else {
            post.setTextBlock(scanner.nextLine().substring(0, 1000));
            System.out.println("ваш пост достиг лимита в 1000 символов и был обрезан");
        }
        user.getBlog().getPost().add(post);
        return post;
    }

    @Override
    public void showPost(User user) {
        System.out.println(user.getBlog().getPost());
    }

    @Override
    public void changePost(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название поста для замены");
        String exchangePost = scanner.nextLine();
        for (int i = 0; i <= 25; i++) {
            if (exchangePost.equals(user.getBlog().getPost().get(i).getName())) {
                user.getBlog().getPost().set(i, newPost(user));
                user.getBlog().getPost().remove(25);
                newPost(user);
            }
        }
    }


}

