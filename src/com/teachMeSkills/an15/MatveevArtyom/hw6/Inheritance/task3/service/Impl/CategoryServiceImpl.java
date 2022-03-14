package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.service.Impl;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Basket;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Category;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.User;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.service.CategoryService;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvProduct;

import java.util.Arrays;
import java.util.Scanner;

public class CategoryServiceImpl implements CategoryService {
    @Override
    public void printCatalog(Category category) {
        for (Product product : category.getProducts()) {
            System.out.println(product.toString());
        }
    }

    @Override
    public void printDefiniteCatalog(Category category) {
        System.out.println("Выберите категорию: 1 - Крупы, 2 - Молочка, 3 - Булки");
        int counter = new Scanner(System.in).nextInt();
        if(counter == 1 && category.getName().equals("Крупы")){
            System.out.println(Arrays.toString(category.getProducts()));
        }else if(counter == 2 && category.getName().equals("Молочка")){
            System.out.println(Arrays.toString(category.getProducts()));
        }else if(counter == 3 && category.getName().equals("Булки")){
            System.out.println(Arrays.toString(category.getProducts()));
        }else System.out.println("Что-то неправильно! дурак, чё сказать!");
    }

    @Override
    public void selectInBasket(int count, Basket basket, Category category) {
        basket.setProduct(category.getProducts()[count]);
    }

    @Override
    public void byInBasket(User user, Product product) {
        System.out.println("Вы хотите купить");
        System.out.println(product);
        System.out.println("\nКорзина покупок теперь");
        for (Product product1: user.getBasket().getProducts()){
            System.out.println(product1);
        }
    }


}
