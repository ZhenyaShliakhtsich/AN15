package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Basket;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Chapter;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Product;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface Menu {
    public void firstStage(AuthService authService, HashMap<User, User> users, UserService userService);

    public void adminFirstStage(StringBuilder adminFirstStageStringBuilder,
                                ArrayList<Chapter> chapterArrayList, UserService userService);

    public void adminSecondStage(ArrayList<Product> productArrayList, UserService userService);

    public void userFirstStage(User user,
                               ArrayList<Chapter> chapterArrayList, UserService userService);

    public void userSecondStage(UserService userService, Basket basket, Product product, User user,
                                ArrayList<Product> productArrayList);
}
