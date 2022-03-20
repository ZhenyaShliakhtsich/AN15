package com.teachMeSkills.an15.BuzukArtyom.hw7.zadacha1.service.blog;

public class User {
    private Blog blog;
    private Registration registration;
    private Registration authorization;

    public Registration getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Registration authorization) {
        this.authorization = authorization;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }
}
