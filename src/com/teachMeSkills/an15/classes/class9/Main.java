package com.teachMeSkills.an15.classes.class9;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
//            FileInputStream fileInputStream = new FileInputStream("src/com/teachMeSkills/an15/classes/class9/firstFile.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("src/com/teachMeSkills/an15/classes/class9/secondFile.txt");

//            int i;
//
//            while ((i = fileInputStream.read()) != -1) {
//                fileOutputStream.write(i);
//            }

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
            Date date = new Date();

            File file = new File("src/com/teachMeSkills/an15/classes/class9/");
            String[] names = file.list();
            for (String name : names) {
                if (name.equalsIgnoreCase(String.format("src/com/teachMeSkills/an15/classes/class9/receipt_%s.txt",
                        simpleDateFormat.format(date)))) {

                }
            }

            System.out.println("isNull = " + file);


            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter(String.format("src/com/teachMeSkills/an15/classes/class9/receipt_%s.txt",
                            simpleDateFormat.format(new Date()))));

            String string = "Hello World!";
            bufferedWriter.write(string);
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/teachMeSkills/an15/classes/class9/thirdFile.txt"));
//            System.out.println(bufferedReader.readLine());

            String dir = "src/com/teachMeSkills/an15/classes/class9/";
            printAllFilesUnderEachDirectory(dir);

            Receipt receipt = new Receipt(100, "Порошок");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/com/teachMeSkills/an15/classes/class9/receipt.txt"));
            objectOutputStream.writeObject(receipt);
            objectOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/com/teachMeSkills/an15/classes/class9/receipt.txt"));
            Receipt newReceipt = (Receipt) objectInputStream.readObject();
            System.out.println(newReceipt.getName() + " : " + newReceipt.getPrice());

        } catch (InputMismatchException e) {
            System.out.println("InputMismatch + ");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printAllFilesUnderEachDirectory(String dir) {
        File file = new File(dir);
        List<String> directories = new ArrayList<>();
        if (file.isDirectory()) {
            System.out.println("Directory - " + file.getName());
            File temporaryFile;
            String[] names = file.list();
            for (String name : names) {
                temporaryFile = new File(dir + name + "/");
                if (temporaryFile.isDirectory()) {
                    directories.add(dir + name + "/");
                } else
                    System.out.println("\tFile - " + name);
            }

            for (String directory : directories) {
                printAllFilesUnderEachDirectory(directory);
            }
        }
    }
}

