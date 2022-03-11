package com.teachMeSkills.an15.classes;

public interface BookService {
    default void printBook(){
        System.out.println("Print Book");
    }
}
