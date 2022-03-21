package com.teachMeSkills.an15.MatveevArtyom.hw7.task1;

import java.util.ArrayList;

public class User {
    private Blog blog;
    private RegistrationAndAuthorisation registrationAndAuthorisation;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public RegistrationAndAuthorisation getRegistrationAndAuthorisation() {
        return registrationAndAuthorisation;
    }

    public void setRegistrationAndAuthorisation(RegistrationAndAuthorisation registrationAndAuthorisation) {
        this.registrationAndAuthorisation = registrationAndAuthorisation;
    }

    @Override
    public String toString() {
        return "User{" +
                "blog=" + blog +
                ", registrationAndAuthorisation=" + registrationAndAuthorisation +
                '}';
    }
}
