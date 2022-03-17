package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models;

import java.util.ArrayList;

public class UsersList {
    private ArrayList<UserReg> users;

    public ArrayList<UserReg> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<UserReg> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UsersList{" +
                "users=" + users +
                '}';
    }
}
