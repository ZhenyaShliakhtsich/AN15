package com.teachMeSkills.an15.VorobyovSergey.hwSeven.models;

public class User {
    String userFirstName;
    String userLastName;
    String userEmail;
    String userLogin;
    String userPassword;
    Blog userBlog;

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Blog getUserBlog() {
        return userBlog;
    }

    public void setUserBlog(Blog userBlog) {
        this.userBlog = userBlog;
    }

    @Override
    public String toString() {
        return "User{" +
                "userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userLogin='" + userLogin + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userBlog=" + userBlog +
                '}';
    }
}
