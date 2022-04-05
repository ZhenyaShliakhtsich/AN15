package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.ConstVal;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.PurchaseReceipt;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.PurchaseService;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PurchaseServiceImpl implements PurchaseService {
//    private StringBuilder builder = new StringBuilder();

    @Override
    public void savePurchaseReceipt(PurchaseReceipt purchaseReceipt) {
        //Делаем индекс
        LocalDateTime time = LocalDateTime.now();

        //Готовим имя файла
        String fileSource = ConstVal.PATH_TO_RECEIPT_SERIALIZED;
        String fileName = purchaseReceipt.getCustomerName();
        String index = time.format(DateTimeFormatter.ofPattern(ConstVal.PATTERN_DATE_TIME_FOR_FILE_NAME));
        String extension = ".txt";

        //Записали
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileSource + fileName + index + extension))) {
            oos.writeObject(purchaseReceipt);
        } catch (IOException e) {
            System.out.println("Something is wrong with IO");
        }
    }

    @Override
    public void savePurchaseReceiptInTxt(PurchaseReceipt purchaseReceipt) {
//!!!+++ объявить в методе стринг_билдер, как переменную метода а не класса.
//Типа чтобы можно было метод параллельно потом выполнять, это не та переменная, чтобы объявлять ее в классе
        StringBuilder builder = new StringBuilder();

        //Делаем индекс
        LocalDateTime time = LocalDateTime.now();

        //Готовим имя файла
        String fileSource = ConstVal.PATH_TO_RECEIPT_TXT;
        String fileName = purchaseReceipt.getCustomerName();
        String index = time.format(DateTimeFormatter.ofPattern(ConstVal.PATTERN_DATE_TIME_FOR_FILE_NAME));
        String extension = ".txt";

        //Готовим список из имен товаров
        for (Product p : purchaseReceipt.getCustomerBasket().getProducts()) {
            builder.append("\t").append(p.getName()).append("\n");
        }
        String productsList = builder.toString();
        //Чистим буфер билдера
        builder.setLength(0);
        //Готовим текст чека и используем билдер по новому
        builder.append("Время операции: ")
                .append(time.format(DateTimeFormatter.ofPattern(ConstVal.PATTERN_DATE_TIME_FOR_FILE_NAME)))
                .append("\n").append("Имя клиента: ").append(fileName)
                .append("\n").append("Купил:").append("\n").append(productsList)
                .append("\n").append("Цена без скинки: ").append(purchaseReceipt.getPrice())
                .append("\n").append("Скидка: ").append(purchaseReceipt.getDiscount())
                .append("\n").append("Цена со скидкой: ").append(purchaseReceipt.getTotalPrice());

        //Записали
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileSource + fileName + index + extension))) {
            //Текст Чека
            bw.write(builder.toString());
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
                        // Тут важная прикалюха, что если чутка изменить рецепт то десерилизовать не получится
                        System.out.println("Something is wrong with IO," +
                                " maybe InvalidClassException and you change receipt structure");
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

    @Override
    public void showUserReceiptsInTxt(User user, String dir) {
        File file = new File(dir);
        String regex = "^" + user.getLogin() + ".+$";

        if (file.isDirectory()) {
            //Имя директории
            System.out.println("You id dir - " + file.getName());
            //Бежим по директории
            for (File f : file.listFiles()) {
                //Имя файла для наглядности
                System.out.print("\nFile: " + f.getName() + "\n");
                //Читаем чек в консоль
                if (f.isFile() && f.getName().matches(regex)) {
                    try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.out.println("Something is wrong with IO");
                    }
                } else {
                    System.out.println("Это нам не надо");
                }
            }
        }
    }
}
