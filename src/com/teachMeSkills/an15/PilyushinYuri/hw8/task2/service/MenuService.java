package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Product;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface MenuService {
  public void userMenu(User user,ArrayList<Product> products,HashMap<String, User> users);
  public  void adminMenu(User user,ArrayList<Product> products,HashMap<String, User> users);
  public void authMenu(HashMap<String, User> users,ArrayList<Product> products);

}
