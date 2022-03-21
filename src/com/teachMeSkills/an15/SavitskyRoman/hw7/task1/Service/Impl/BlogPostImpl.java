package com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Impl;

import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Blog;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Post;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.BlogPost;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.User;

import java.io.*;
import java.util.Scanner;

public class BlogPostImpl implements BlogPost {
    Scanner scanner = new Scanner(System.in);
    File file = new File("user.ser");
    boolean isCreatPostName = false;
    boolean isCreatPost = false;
    Blog blog;

    @Override
    public void writeBlog(User[] userArray, int numberOfArray, Post[] post) {
        if (userArray[numberOfArray].getBlog() == null) {
            blog = new Blog();
            blog.setPost(post);
            blog.setBlogName(nameBlog());
            userArray[numberOfArray].setBlog(blog);
            setSaveUser(userArray);
        } else {
            System.out.println("Ваш блог: " + userArray[numberOfArray].getBlog().getBlogName());
        }
        creatPost(userArray, numberOfArray);

    }

    public String nameBlog() {
        String nameBlog = null;
        System.out.println("Введите название блога");
        for (int y = 2; y >= 0; y--) {
            nameBlog = scanner.nextLine();
            if (nameBlog.length() == 0) {
                System.out.println("Вы не ввели название блога. Повторите ввод.\nОставшееся количество попыток: " + y);
                continue;
            }
            break;
        }
        return nameBlog;
    }

    public void creatPost(User[] userArray, int numberOfArray) {
        for (int x = 0; x < userArray[numberOfArray].getBlog().getPost().length; x++) {
            if (userArray[numberOfArray].getBlog().getPost()[x] == null
                    && isCellArrayEmpty(userArray, numberOfArray, x)) {
                while (!isCreatPostName && !isCreatPost) {
                    userArray[numberOfArray].getBlog().getPost()[x] = new Post();
                    userArray[numberOfArray].getBlog().getPost()[x].setName(namePost(userArray, numberOfArray));
                    userArray[numberOfArray].getBlog().getPost()[x].setPost(Post(userArray, numberOfArray));
                }
                break;
            }
            if (isArrayFull(userArray, numberOfArray)
                    || userArray[numberOfArray].getBlog().getPost()[userArray[numberOfArray].getBlog().getPost().length - 1] != null) {
                System.out.println("Список постов полон");
                //Дополнить метод на удаление постов
                break;
            }
        }
        setSaveUser(userArray);

    }

    public boolean isArrayFull(User[] userArray, int numberOfArray) {

        if (!file.isFile()) {
            return false;
        }
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("user.ser"));
            for (int x = 0; x < userArray.length; x++) {
                userArray[x] = (User) os.readObject();
            }
            for (int y = 0; y < userArray[numberOfArray].getBlog().getPost().length; y++) {

                if (userArray[numberOfArray].getBlog().getPost()[userArray[numberOfArray].getBlog().getPost().length - 1]
                        != null) {
                    return true;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }


    public boolean isCellArrayEmpty(User[] userArray, int numberOfArray, int x) {
        if (file.isFile()) {
            try {
                ObjectInputStream os = new ObjectInputStream(new FileInputStream("user.ser"));
                for (int z = 0; z < userArray.length; z++) {
                    userArray[z] = (User) os.readObject();
                }
                for (int y = 0; y < userArray[numberOfArray].getBlog().getPost().length; y++) {
                    if (x == y && userArray[numberOfArray].getBlog().getPost()[y] != null) {

                        return false;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return true;
    }


    public String namePost(User[] userArray, int numberOfArray) {
        String name = null;
        System.out.println("Введите название поста");
        for (int y = 2; y >= 0; y--) {
            name = scanner.nextLine();
            if (y == 0) {
                System.out.println("Такое название поста уже есть. До свидания.\nОставшееся количество попыток: " + y);
                continue;
            }
            if (name.length() == 0) {
                System.out.println("Вы не ввели название поста. Повторите ввод.\nОставшееся количество попыток: " + y);
                continue;
            }
            if (!isPostNameBusy(userArray, numberOfArray, name)) {
                System.out.println("Такое название поста уже есть, попробуйте ввести другое название.\nОставшееся количество попыток: " + y);
                continue;
            }
            isCreatPostName = true;
            break;
        }
        return name;
    }

    public boolean isPostNameBusy(User[] userArray, int numberOfArray, String name) {
        User[] userArrayService = new User[userArray.length];
        for (int z = 0; z < userArray[numberOfArray].getBlog().getPost().length; z++) {
            if (userArray[numberOfArray].getBlog().getPost()[z] != null
                    && userArray[numberOfArray].getBlog().getPost()[z].getName() != null
                    && userArray[numberOfArray].getBlog().getPost()[z].getName().equals(name)) return false;
        }

        if (file.isFile()) {
            try {
                ObjectInputStream os = new ObjectInputStream(new FileInputStream("user.ser"));
                for (int x = 0; x < userArray.length; x++) {
                    userArrayService[x] = (User) os.readObject();
                }
                for (int y = 0; y < userArrayService[numberOfArray].getBlog().getPost().length; y++) {

                    if (userArrayService[numberOfArray].getBlog().getPost()[y] != null
                            && userArrayService[numberOfArray].getBlog().getPost()[y].getName().equals(name)) {
                        return false;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return true;
    }

    public void setSaveUser(User[] userArray) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("user.ser"));

            for (User ob : userArray) {
                os.writeObject(ob);
            }
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String Post(User[] userArray, int numberOfArray) {
        String name = null;
        System.out.println("Введите содержимое поста");
        for (int y = 2; y >= 0; y--) {
            name = scanner.nextLine();
            if (y == 0) {
                System.out.println("Такой поста уже есть. До свидания.\nОставшееся количество попыток: " + y);
                continue;
            }
            if (name.length() == 0) {
                System.out.println("Вы не ввели содержимое поста. Повторите ввод.\nОставшееся количество попыток: " + y);
                continue;
            }
            if (!isPostBusy(userArray, numberOfArray, name)) {
                System.out.println("Такое содержание поста уже есть, попробуйте ввести другое.\nОставшееся количество попыток: " + y);
                continue;
            }
            isCreatPost = true;
            break;
        }
        return name;
    }

    public boolean isPostBusy(User[] userArray, int numberOfArray, String name) {
        User[] userArrayService = new User[userArray.length];
        for (int z = 0; z < userArray[numberOfArray].getBlog().getPost().length; z++) {
            if (userArray[numberOfArray].getBlog().getPost()[z] != null
                    && userArray[numberOfArray].getBlog().getPost()[z].getPost() != null
                    && userArray[numberOfArray].getBlog().getPost()[z].getPost().equals(name)) return false;
        }

        if (file.isFile()) {
            try {
                ObjectInputStream os = new ObjectInputStream(new FileInputStream("user.ser"));
                for (int x = 0; x < userArray.length; x++) {
                    userArrayService[x] = (User) os.readObject();
                }
                for (int y = 0; y < userArrayService[numberOfArray].getBlog().getPost().length; y++) {

                    if (userArrayService[numberOfArray].getBlog().getPost()[y] != null
                            && userArrayService[numberOfArray].getBlog().getPost()[y].getPost().equals(name)) {
                        return false;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return true;
    }
}

