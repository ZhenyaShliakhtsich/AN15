package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UserReg;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.BlogService;

import java.util.ArrayList;
import java.util.Scanner;

public class BlogImpl implements BlogService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void createBlog(UserReg userReg) {
        userReg.setBlog(new ArrayList<>(25));
        System.out.println("Ввести название блога:");
        String blogName = scanner.nextLine();
        if (blogName != null) {
            userReg.setBlogName(blogName);
        } else {
            System.out.println("Вы ничего не ввели, попробуйте снова: ");
            createBlog(userReg);
        }

    }

    @Override
    public void addPost(UserReg userReg) {
        if (userReg.getBlog().size() > 25) {
            overLimit(userReg);
        } else {
            System.out.println("Добавить пост в блог. Введите текст поста: ");
            String postText = scanner.nextLine();
            if (postText != null && postText.length() <= 1000) {
                userReg.getBlog().add(postText);
            } else if (postText.length() > 1000) {
                System.out.println("Текст поста не может превышать 1000 символов.\n " +
                        "Текс поста обрезан до 1000 символов");
                postText = postText.substring(0, 1000);
                userReg.getBlog().add(postText);
            }
        }
    }

    @Override
    public void editPost(UserReg userReg) {
        System.out.println("Выберете номер поста под изменение");
        int number = scanner.nextInt();

        System.out.println("Если хотите изменить пост полность, введите \"полность\". " +
                "Если хотите изменить слово или предложение, то введите \"частично\"");
        String editor = scanner.nextLine();
        if (editor.equalsIgnoreCase("полность")) {
            System.out.println("Введите текст");
            userReg.getBlog().set(number - 1, scanner.nextLine());
        } else if (editor.equalsIgnoreCase("частично")) {
            System.out.println("Ввести изменяемый текст поста:");
            String text = scanner.nextLine();
            if (userReg.getBlog().get(number - 1).contains(text)) {
                System.out.println("Текст " + text + " изменить на (требуется ввод):");
                userReg.getBlog().get(number).replaceFirst(text, scanner.nextLine());
            } else {
                System.out.println("Такого текста в посте " + userReg.getBlog().get(number - 1).toString() + " нет");
                editPost(userReg);
            }

        } else {
            System.out.println("Такого поста нет.");
            addPost(userReg);
        }

    }

    @Override
    public void showAllPosts(UserReg userReg) {
        System.out.println(userReg.getBlog().toString());

    }

    @Override
    public void showPost(UserReg userReg) {
        try {
            System.out.println("Введите номер поста, который хотите увидеть");
            int numberOfPosts = scanner.nextInt();
            if (numberOfPosts > 0 && numberOfPosts < 25) {
                System.out.println(userReg.getBlog().get(numberOfPosts - 1).toString());
            }
        } catch (Exception e) {
            System.out.println("Введите число от 1 до 25");
            showPost(userReg);
        }
    }

    public void overLimit(UserReg userReg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В блоге превышен лимит в 25 постов \n Какой пост вы хотите заменить?" +
                "Введите номер поста: ");
        int postNumber;
        try {
            postNumber = scanner.nextInt();
            if (postNumber > 0 && postNumber < 26) {
                System.out.println("Добавить пост в блог. Введите текст поста: ");
                String postText = scanner.nextLine();
                if (postText != null) {
                    userReg.getBlog().add(postText);
                } else {
                    System.out.println(" Введите текст");
                    addPost(userReg);
                }
                if (postText.length() > 1000) {
                    System.out.println("Текст поста не может превышать 1000 символов.\n " +
                            "Текс поста обрезан до 1000 символов");
                    postText = postText.substring(0, 1000);
                }
                userReg.getBlog().add(postNumber - 1, postText);
            }

        } catch (Exception e) {
            System.out.println("Введите число от 1 до 25");
            overLimit(userReg);
        }


    }
}


