package com.teachMeSkills.an15.classes;

public class Book implements BookService{
    private String name;
    private String author;

    @Override
    public void printBook() {
        System.out.println("Print Book override");
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
