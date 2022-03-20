package com.teachMeSkills.an15.NovikovVadim.hw7;

public class Post {
    private String name;
    private String text;

    public Post() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Post(String name, String text) {
        this.name = name;
        this.text = text;
    }
}
