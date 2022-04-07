package com.teachMeSkills.an15.LashkevichGeorgy.hw11;

//Условие: дана коллекция класс People (с полями name — имя, age — возраст, sex — пол), вида
// Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
// new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).
//
//
//1. Выбрать мужчин-военнообязанных (от 18 до 27 лет)
//2. Найти средний возраст среди мужчин
//3. Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
//
//
public class People {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "First{" +
                "name=" + name +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

}
