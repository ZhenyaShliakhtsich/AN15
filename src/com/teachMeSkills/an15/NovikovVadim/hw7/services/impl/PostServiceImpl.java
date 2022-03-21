package com.teachMeSkills.an15.NovikovVadim.hw7.services.impl;

import com.teachMeSkills.an15.NovikovVadim.hw7.Blog;
import com.teachMeSkills.an15.NovikovVadim.hw7.Post;
import com.teachMeSkills.an15.NovikovVadim.hw7.services.PostService;

import java.util.Scanner;

public class PostServiceImpl implements PostService {
    @Override
    public void showPosts(Blog blog) {
        int i = 0;

        System.out.println("Список постов:");
        for (Post iterPost : blog.getPosts()) {
            i++;
            System.out.println("№ " + i + ". " + iterPost.getName());
        }
    }

    @Override
    public Post enterPost(Blog blog) {
        Post post = enterPostOperation(blog);
        blog.setPosts(post);
        return post;

    }

    @Override
    public void enterText(Post post) {
        System.out.println("Введите текст поста, максимум 1000 символов");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() >= 1000) {
            str = str.substring(0, 999);
        }
        post.setText(str);

    }

    private Post enterPostOperation(Blog blog) {

        while (true) {
            System.out.println("Введите имя поста");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            Post post = new Post();
            boolean isEnterPost = true;

            if (blog.getPosts().size() == blog.COUNTPOSTS) {
                showPosts(blog);

                System.out.println("Количество блогов достигло максимума, необходимо заменить пост:");
                while (true) {
                    try {
                        int index = scanner.nextInt();
                        if (index > 0 && index <= blog.COUNTPOSTS) {
                            post = blog.getPosts().get(index - 1);
                            post.setName(name);
                            blog.setName(name);
                            return post;
                        } else {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        System.out.println("Некорректный ввод номера поста, повторите еще раз: ");
                    }
                }
                //isEnterPost = false;
                //continue;

            } else {
                for (Post blogPost : blog.getPosts()) {
                    if (blogPost.getName().equalsIgnoreCase(name)) {
                        isEnterPost = false;
                        post = blogPost;
                    }
                }
            }

            if (isEnterPost) {
                post.setName(name);
                return post;
            } else {
                System.out.println("Пост с таким именем уже существует: \n\t1. Ввести другое имя. \n\t2. Удалить старый пост. \n\t3. Просмотреть список постов.");
                String answer = scanner.next();
                switch (answer) {
                    case ("1"): {
                        continue;
                    }
                    case ("2"): {
                        blog.getPosts().remove(post);
                        post = new Post();
                        post.setName(name);
                        return post;
                    }
                    case ("3"): {
                        showPosts(blog);
                        continue;
                    }
                }

            }
        }
    }
}
