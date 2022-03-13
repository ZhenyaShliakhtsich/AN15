package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category();
        Category category2 = new Category();
        Category category3 = new Category();
        Product product1 = new Product("Гречка", 1 , 47);
        Product product2 = new Product("Нут", 2, 65);
        Product product3 = new Product("Пшено", 1.5, 21);
        Product[] products1 = new Product[3];
        products1[0] = product1;
        products1[1] = product2;
        products1[2] = product3;
        category1.setName("Крупы");
        category1.setProducts(products1);
        Product product4 = new Product("Молоко", 2 , 14);
        Product product5 = new Product("Кефир", 1.8, 28);
        Product product6 = new Product("Сметана", 1.4, 11);
        Product[] products2 = new Product[3];
        products2[0] = product4;
        products2[1] = product5;
        products2[2] = product6;
        category2.setName("Молочка");
        category2.setProducts(products2);
        Product product7 = new Product("Пирожок с мясом", 2.5 , 78);
        Product product8 = new Product("Булочка с маком", 1.3, 92);
        Product product9 = new Product("Сметанник", 1.45, 88);
        Product[] products3 = new Product[3];
        products3[0] = product4;
        products3[1] = product5;
        products3[2] = product6;
        category3.setName("Булки");
        category3.setProducts(products3);
        Product[] products = new Product[3];
        products[0] = product7;
        products[1] = product4;
        products[2] = product1;
        Basket basket = new Basket();
        basket.setProducts(products);
        User user = new User("NEMO", 1234, basket);

    }
}
