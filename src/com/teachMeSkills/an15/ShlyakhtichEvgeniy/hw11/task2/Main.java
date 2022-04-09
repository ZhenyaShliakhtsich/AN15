package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw11.task2;

import java.util.ArrayList;
import java.util.Arrays;

//дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»)
//
//1. Найти существуют ли хоть один «a1» элемент в коллекции
//2. Найти существуют ли хоть один «a8» элемент в коллекции
//3. Найти есть ли символ «1» у всех элементов коллекции
//4. Проверить что не существуют ни одного «a7» элемента в коллекции
public class Main {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>(Arrays.asList("a1", "a2", "a3", "a1"));
        System.out.println(collection.stream().anyMatch((o)->o.equals("a1")));
        System.out.println(collection.stream().anyMatch((o)->o.equals("a8")));
        System.out.println(collection.stream().allMatch((o)->o.contains("1")));
        System.out.println(collection.stream().anyMatch((o)->!o.equals("a7")));
    }
}
