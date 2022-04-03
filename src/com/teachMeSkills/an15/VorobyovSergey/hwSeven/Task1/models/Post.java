package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models;

public class Post {
    private String postName;
    private String postText;

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postName='" + postName + '\'' +
                ", postText='" + postText + '\'' +
                '}';
    }
}
