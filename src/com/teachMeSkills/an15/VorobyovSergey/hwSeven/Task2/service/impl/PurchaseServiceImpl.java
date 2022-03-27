package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.PurchaseReceipt;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.PurchaseService;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
            e.printStackTrace();
        }
    }
}
