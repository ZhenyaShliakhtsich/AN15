package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.service.Impl;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Category;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.service.CategoryService;

import java.util.Arrays;
import java.util.Scanner;

public class CategoryServiceImpl implements CategoryService {
    @Override
    public void printCatalog(Category category) {
        System.out.println(Arrays.toString(category.getProducts()));
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
}
