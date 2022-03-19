package com.teachMeSkills.an15.VorobyovSergey.hwSeven.models;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<User> list;

    public DataBase() {
        list = new ArrayList<>();
    }

    public ArrayList<User> getList() {
        return list;
    }

    public void addToList(User user) {
        getList().add(user);
    }

    public void showDataBase() {
        for (User u : this.getList()) {
            System.out.println(u);
        }
    }
}
