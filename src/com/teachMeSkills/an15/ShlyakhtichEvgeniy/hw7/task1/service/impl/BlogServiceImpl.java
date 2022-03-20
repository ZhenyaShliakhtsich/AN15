package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.Blog;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.Post;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service.BlogService;

import java.util.ArrayList;
import java.util.Scanner;

public class BlogServiceImpl implements BlogService {
    @Override
    public void createBlog(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название блога");
        Blog blog = new Blog();
        ArrayList<Post> posts = new ArrayList<>();
        blog.setPosts(posts);
        blog.setBlogName(scanner.nextLine());
        user.setBlog(blog);
        scanner.close();
    }

    @Override
    public void createPost(User user) {
        Post post = new Post();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название поста");
        post.setTitle(scanner.nextLine()); //??
        System.out.println("Введите текст поста");
        String newPost = scanner.nextLine();
        if (newPost.length() <= 1000) {
            post.setPost(newPost);
        }else {
            System.out.println("Ваш пост превысил лимит символов,поэтому был обрезан");
            post.setPost(newPost.substring(0,1000));
        }
    user.getBlog().getPosts().add(post);
    if (user.getBlog().getPosts().size() == 26) {
        System.out.println("Количество постов превысило лимит.Введите название поста,который можно заменить");
        String change = scanner.nextLine();
        for (int i = 0;i < 25;i++){
            if (change.equalsIgnoreCase(user.getBlog().getPosts().get(i).getTitle())){
                user.getBlog().getPosts().set(i,post);
                user.getBlog().getPosts().remove(25);
            }
        }
    }
    scanner.close();
    }

    @Override
    public void changePost(User user) {
        System.out.println("Введите название поста,который вы хотите поменять");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0;i < 25;i++){
            if (name.equalsIgnoreCase(user.getBlog().getPosts().get(i).getTitle())){
                user.getBlog().getPosts().get(i).toString();
                System.out.println("Что вы хотить поменять?");
                String change = scanner.nextLine();
                if (change.equalsIgnoreCase("Название")){
                    user.getBlog().getPosts().get(i).setTitle(scanner.nextLine());
                }else if(change.equalsIgnoreCase("Текст")){
                    user.getBlog().getPosts().get(i).setPost(scanner.nextLine());
                }
            }
        }
    }

    @Override
    public void showBlog(User user) {
        user.getBlog().toString();
    }

    @Override
    public void showPost(User user) {
        System.out.println("Введите название поста,который вы хотите посмотреть");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0;i < 25;i++){
            if (name.equalsIgnoreCase(user.getBlog().getPosts().get(i).getTitle())){
                user.getBlog().getPosts().get(i).toString();
            }
        }
    }
}
