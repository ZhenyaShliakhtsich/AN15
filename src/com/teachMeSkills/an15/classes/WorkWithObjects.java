package com.teachMeSkills.an15.classes;

public class WorkWithObjects {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 8, 9.5);
        System.out.println(cat);

        Cat cat1 = new Cat("Кокос", 7.5);

        System.out.println(cat1);

        Cat cat2 = new Cat("Гашиш");
        System.out.println(cat2);

        Cat cat3 = new Cat("Гашиш");
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());

        System.out.println(cat2.equals(cat3));
        System.out.println(cat2.hashCode() == cat3.hashCode() && cat2.equals(cat3));

        Cat cat4 = new Cat();
        System.out.println(cat4);

        Cat ca5 = new Cat("1111", 1, 1);

        System.out.println(ca5.hashCode());

        Dog dog = new Dog();
        dog.name = "Dog";
        dog.age = 1;
        dog.weight = 5;

        System.out.println(dog);

        Audi audi = new Audi(5, true, "black", 2100, 5);
        Audi audi2 = new Audi(5, true, "black", 2000, 5);
        System.out.println(audi.equals(audi2));

        Car car = new Reno(2);

        BMW bmw= new BMW(true, false, 5);

    }
}
