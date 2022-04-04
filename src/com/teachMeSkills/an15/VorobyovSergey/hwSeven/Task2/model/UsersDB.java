package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model;

import java.util.HashSet;

public class UsersDB {
    HashSet<User> database;

    public UsersDB() {
        database = new HashSet<>();
    }

    public HashSet<User> getDatabase() {
        return database;
    }

    public void setDatabase(HashSet<User> database) {
        this.database = database;
    }
}
