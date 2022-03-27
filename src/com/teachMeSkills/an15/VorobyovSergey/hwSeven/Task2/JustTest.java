package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.PurchaseReceipt;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class JustTest {
    public static void main(String[] args) {

        String myDir = "src/com/teachMeSkills/an15/VorobyovSergey/hwSeven/Task2/purchaseDB";
        File file = new File(myDir);

        PurchaseReceipt receipt = new PurchaseReceipt();
        String regex = "^l1.+$";

        if (file.isDirectory()) {
            //Имя директории
            System.out.println(file.getName());
            //Бежим по директории
            for (File f : file.listFiles()) {
                //Имя файла для наглядности
                System.out.println(f.getName());
                System.out.println("regex - " + f.getName().matches(regex));
                //Читаем чек, десериализуем
                if (f.isFile()) {
                    try {
                        receipt = (PurchaseReceipt) new ObjectInputStream(new FileInputStream(f)).readObject();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    //Чек на экран
                    System.out.println(receipt);
                } else {
                    System.out.println("А гэта папачка, а не чэк");
                }
            }
        }

//        PurchaseReceipt receiptOut = new PurchaseReceipt();
//        receiptOut.setCustomerName("A1_A1");
//        receiptOut.setDiscount(21);


//        //Делаем индекс
//        LocalDateTime time = LocalDateTime.now();
//        System.out.println(time.format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss")));

        //Готовим имя файла
//        String fileSource = "src/com/teachMeSkills/an15/VorobyovSergey/hwSeven/Task2/purchaseDB/";
//        String fileName = receiptOut.getCustomerName();
//        String index = time.format(DateTimeFormatter.ofPattern("_yyyy-MM-dd-HH-mm-ss"));
//        String extension = ".txt";

        //Записали
//        try {
//            ObjectOutputStream oos = new ObjectOutputStream(
//                    new FileOutputStream(fileSource + fileName + index + extension));
//            oos.writeObject(receiptOut);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Прочитали
//        PurchaseReceipt receiptInp = null;
//        try {
//            ObjectInputStream ois = new ObjectInputStream(
//                    new FileInputStream(fileSource + fileName + index + extension));
//            receiptInp = (PurchaseReceipt) ois.readObject();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Прочитали");
//        System.out.println(receiptInp);
    }
}
