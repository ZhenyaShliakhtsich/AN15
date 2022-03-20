package com.teachMeSkills.an15.NovikovVadim.hw7;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProjectDataBase {
    String FILENAME = "base.json";

    public ArrayList<User> readBase(String filename) throws Exception {
        Gson gson = new Gson();
        String str = "";
        try {
            //если файл пустой или некорректный, вернет не array list, стоит обработать эту ситуацию потом
            str = Files.readString(Paths.get(filename));
        } catch (NoSuchFileException e) {
            //при отстутствии файла, заводим новый
            return new ArrayList<User>();
        }

        //эту штуку нагуглил, не изучил что такой typetoken
        Type type = new TypeToken<ArrayList<User>>() {
        }.getType();
        ArrayList<User> users = gson.fromJson(str, type);

        return users;
    }

    public void writeBase(String filename, ArrayList<User> users) throws Exception {

        Gson gson = new Gson();

        Files.write(Paths.get(filename), gson.toJson(users).getBytes());
    }

}
