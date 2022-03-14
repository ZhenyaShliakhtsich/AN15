package com.teachMeSkills.an15.AltievAli.hm6.task3;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.checkLogin("Ali", "AN15");

        System.out.println("------------------------------------------------------");

        Product product = new Product("Phone", 350, 3);
        Product product1 = new Product("TV", 700, 6);
        Product product2 = new Product("Coffee Maker", 500, 1);
        System.out.println(product);

        Category category = new Category("OnlineLibrary", new Product[]{new Product("book", 39, 5)});
        Category category2 = new Category("Goods", new Product[]{new Product("Watermelon", 2, 7)});
        Category category3 = new Category("Clothes", new Product[]{new Product("", 39, 5)});
        System.out.println(category3);

//          Basket basket = new Basket();//Not working!!!
//         basket.addProductByCategory(category);



    }
}
