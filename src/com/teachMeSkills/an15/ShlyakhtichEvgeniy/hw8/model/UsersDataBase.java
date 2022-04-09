package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model;

import java.io.Serializable;
import java.util.HashMap;

public class UsersDataBase implements Serializable {
    private HashMap<String,User> users;

    public HashMap<String, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }
}
