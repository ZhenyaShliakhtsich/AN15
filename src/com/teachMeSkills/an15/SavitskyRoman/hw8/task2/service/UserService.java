package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Chapter;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Product;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.User;

import java.util.ArrayList;

public interface UserService {

    void addProduct(ArrayList<Product> products);

    void changeProduct(ArrayList<Product> products, StringBuilder adminStageFirstOfProductChange);

    void deleteProduct(ArrayList<Product> products);

    void addProductToBasket(User user, Product products);

    void payForBasket(User user, ArrayList<Chapter> chapterArrayList);

    void deleteProductFromBasket(User user);

    void rateProduct(ArrayList<Product> products, Product product);

    void commentProduct(ArrayList<Product> products, Product product);

    ArrayList<Product> searchCarToName(ArrayList<Chapter> chapterArrayList);
}
