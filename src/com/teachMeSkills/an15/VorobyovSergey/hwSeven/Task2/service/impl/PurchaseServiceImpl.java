package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.PurchaseReceipt;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.PurchaseService;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PurchaseServiceImpl implements PurchaseService {
    @Override
    public void savePurchaseReceipt(PurchaseReceipt purchaseReceipt) {
        //Делаем индекс
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time.format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss")));
        //Готовим имя файла
        String fileSource = "src/com/teachMeSkills/an15/VorobyovSergey/hwSeven/Task2/purchaseDB/";
        String fileName = purchaseReceipt.getCustomerName();
        String index = time.format(DateTimeFormatter.ofPattern("_yyyy-MM-dd-HH-mm-ss"));
        String extension = ".txt";

        //Записали
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileSource + fileName + index + extension))){
            oos.writeObject(purchaseReceipt);
        } catch (IOException e) {
            System.out.println("Something is wrong with IO");
        }
    }

    @Override
    public void showUserReceipts(User user, String dir) {
        File file = new File(dir);
        PurchaseReceipt receipt = new PurchaseReceipt();
        String regex = "^" + user.getLogin() + ".+$";

        if (file.isDirectory()) {
            //Имя директории
            System.out.println("You id dir - " + file.getName());
            //Бежим по директории
            for (File f : file.listFiles()) {
                //Имя файла для наглядности
                System.out.print(f.getName() + " - ");
                //Читаем чек, десериализуем
                if (f.isFile() && f.getName().matches(regex)) {
                    try {
                        receipt = (PurchaseReceipt) new ObjectInputStream(new FileInputStream(f)).readObject();
                    } catch (IOException e) {
                        System.out.println("Something is wrong with IO");
                    } catch (ClassNotFoundException e) {
                        System.out.println("Something is wrong with classes");
                    }
                    //Чек на экран
                    System.out.println(receipt);
                } else {
                    System.out.println("Это нам не надо");
                }
            }
        }
    }
}
